#!/usr/bin/env python3
import inspect
import logging
import signal
import sys
import shutil
import os
import functools
import re
import argparse
from pprint import pprint
from pathlib import Path

class addBlock:
    def __init__(self,mod_path: str = "{self.mod_path}", overwrite_files: bool = True, verbose: bool = False, debug: bool = False):
        self.mod_path = mod_path
        self.verbose = verbose
        self.overwrite_files = overwrite_files
        self.backup_files = list()
        self.block_name = str()
        self.CapitalizedName = str()
        self.uppercaseName = str()
        self.recipe = str()
        self.debug  = debug

        self.logger = logging.getLogger(__name__)
        if Path(self.mod_path).is_dir():
            self.logger.info(f"Mod Path {self.mod_path} exists")
        else:
            self.logger.error(f"Mod Path {self.mod_path} does not exist. Fail now")
            raise FileNotFoundError(errno.ENOENT, os.stderror(f"{errno.ENOENT}: This requires a valid path to a minecraft mod project folder"), mod_path)

    #Some built in functions you can implement
    def __str__(self):
        return pprint(self.__dir__)

    def __repr__(self):
        return f'Verbose {self.__name__}'
    
    def __dir__(self):
        return_dir = dict(mod_path = self.mod_path,
                    block_name = self.block_name,
                    CapitalizedName = self.CapitalizedName,
                    uppercaseName = self.uppercaseName,
                    backup_files = self.backup_files,
                    overwrite_files = self.overwrite_files,
                    verbose = self.verbose,
                    recipe = self.recipe_block
                    )
        return return_dir

    def create_file(self, file_path: str, contents: str):
        if Path(file_path).is_file():
            backupfile = f"{file_path}.bak"
            self.backup_files.append(backupfile)
            try: 
                Path(file_path).rename(backupfile)
            except Exception as e:
                sys.stderr.write(str(e.args[0]) + '\n')
        if self.verbose:
            sys.stdout.write(f"create file {file_path}\n")
        if self.debug:
            sys.stdout.write(f"create file: {file_path}:\nwith contents:\n{contents}\n")
        try:
            with open(file_path, "w", encoding="utf-8") as file:
                try:
                    file.write(contents + "\n")
                except Exception as q:
                    sys.stderr.write(str(q.args[0]) + '\n')
        except Exception as e:
            sys.stderr.write(f"failed to open {file_path} for writing\n" + str(e.args[0]) + "\n")

    def update_file(self,file_path: str,update_string: str,pattern: str = '::new block here'):
        if Path(file_path).is_file():
            backupfile = f"{file_path}.bak"
            self.backup_files.append(backupfile)
            try:
                shutil.copy2(file_path, backupfile)
            except Exception as e:
                sys.stderr.write(str(e.args[0]) + '\n')
        if self.verbose:
            sys.stdout.write(f"update file {file_path}\n")
        if self.debug:
            sys.stdout.write(f"update file: {file_path}:\nafter \"{pattern}\" insert block:\n{update_string}\n")
        try:
            with open(file_path, "r") as file:
                try:
                    lines = file.readlines()
                except Exception as q:
                    sys.stderr.write(str(q.args[0]) + '\n')
        except Exception as e:
            sys.stderr.write(str(e.args[0]) + '\n' + '\n')
        try:
            with open(file_path, "w") as file:
               for line in lines:
                    if pattern in line:
                        try:
                            file.write(update_string + '\n')
                        except Exception as e:
                            sys.stderr.write(str(e.args[0]) + '\n')
                    try:
                        file.write(line)
                    except Exception as e:
                        sys.stderr.write(str(e.args[0]) + '\n')
        except Exception as e:
            sys.stderr.write("failed to open " + file_path + " for writing " + str(e.args[0]) + '\n')

    def check_files(self):
        #verify the minimum necessary files are in place.

        if Path(f"{self.mod_path}/src/main/resources/assets/architecture_blocks/models/block/{self.block_name}.json").is_file:
            msg=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/models/block/{self.block_name}.json exists\n"
            if self.verbose:
                sys.stdout.write(msg)
            self.logger.info(msg)
        else:
            err_msg=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/models/block/{self.block_name}.json doesn't exist\n"
            sys.stderr.write(err_msg)
            self.logger.error(msg)
            raise FileNotFoundError
        
        if Path(f"{self.mod_path}/src/main/resources/assets/architecture_blocks/shapes/{self.block_name}.txt").is_file:
            msg=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/shapes/{self.block_name}.txt exists\n"
            if self.verbose:
                sys.stdout.write(msg)
            self.logger.info(msg)
        else:
            err_msg=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/shapes/{self.block_name}.txt doesn't exist\n"
            err_msg=f"{err_msg}\nIn Blockbench open the blockbench file\nExport the shape\n\tFile->Export->Export Voxel Shape\n\tChoose Mojang Mappings\n\tsave the file to: {self.mod_path}/src/main/resources/assets/architecture_blocks/shapes/{self.block_name}.txt\n"
            sys.stderr.write(err_msg)
            self.logger.error(msg)
            raise FileNotFoundError

    #Add block
    def add_block(self, recipe: dict, block_name: str, recipe_result_block_count: int = 1) -> bool:
        #validate_name
        if not self.block_name:
            self.block_name = block_name

        if not block_name or ' ' in block_name:
            msg = f"[{self.block_name}] is not a valid block name\n"
            sys.stderr.write(msg)
            self.logger.error(msg)
            raise ValueError(msg)
        self.block_name = block_name
       

        NameParts = re.split(r"[-_]", block_name)
        newList = [x.capitalize() for x in NameParts]
        CapitalizedName = ''.join(newList)
        newList = [x.upper() for x in NameParts]
        uppercaseName = '_'.join(newList)
        self.CapitalizedName = CapitalizedName
        self.uppercaseName = uppercaseName

        if self.verbose:
            sys.stdout.write(self.__str__())

        self.recipe_block = f"                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.{self.uppercaseName}, {recipe_result_block_count})\n"
        for index in range(len(recipe["ingredients"])):
            ing = recipe['ingredients'][index]
            if ing == "WHITE_MARBLE_BLOCK":
                self.recipe_block += f"                        .define('{index}', ModBlocks.{ing})\n"
            else:
                self.recipe_block += f"                        .define('{index}', Blocks.{ing})\n"
        for pattern in recipe["patterns"]:
            self.recipe_block += f"                        .pattern(\"{pattern}\")\n"
        for ingredient in recipe['ingredients']:
            lowercase_ingredient = ingredient.lower()
            uppercase_ingredient = ingredient.upper()
            if self.uppercase_ingredient == "WHITE_MARBLE_BLOCK":
                self.recipe_block += f"                        .unlockedBy(\"has_{lowercase_ingredient}\", this.has(ModBlocks.{uppercase_ingredient}))\n"
            else:
                self.recipe_block += f"                        .unlockedBy(\"has_{lowercase_ingredient}\", this.has(Blocks.{uppercase_ingredient}))\n"
        self.recipe_block += f"                        .save(this.output);\n"

        if self.debug or self.verbose:
            sys.stdout.write(f"recipe block:\n{self.recipe_block}\n")

        self.check_files()        
        self.create_custom_block_file()
        self.create_custom_block_entity_file()
        self.update_ModBlocks()
        self.update_ModBlockEntities()
        self.update_ModBlockLootTableProvider()
        self.update_ModCreativeModeTabs()
        self.update_ModRecipeProvider()
        self.update_ModItems()
        self.create_blockentity_renderer()
        self.create_blockentity_rendererstate()
        self.update_Architecture_blocksClient()
        self.create_item_model()
        self.create_item_json()
        self.update_en_us()
        self.create_blockstate_json()
        if self.verbose:
            sys.stdout.write("remove backup files\n")
        for backupfile in self.backup_files:
            if Path(backupfile).is_file():
                os.remove(backupfile)
                
    def create_blockentity_renderer(self):
        self.create_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/rendering/blockentity/{self.CapitalizedName}BlockEntityRenderer.java",contents=f"""
package org.squaresaresquare.client.rendering.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import org.squaresaresquare.client.block.entity.custom.{self.CapitalizedName}BlockEntity;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class {self.CapitalizedName}BlockEntityRenderer implements BlockEntityRenderer<{self.CapitalizedName}BlockEntity, {self.CapitalizedName}BlockEntityRenderState> {{
    private final Font font;
    private final ItemModel itemModel = null;

    public {self.CapitalizedName}BlockEntityRenderer(BlockEntityRendererProvider.Context context) {{
        this.font = context.font();
    }}

    @Override
    public {self.CapitalizedName}BlockEntityRenderState createRenderState() {{
        return new {self.CapitalizedName}BlockEntityRenderState();
    }}

    @Override
    public void extractRenderState({self.CapitalizedName}BlockEntity blockEntity, {self.CapitalizedName}BlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {{
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }}

    @Override
    public void submit({self.CapitalizedName}BlockEntityRenderState state, PoseStack matrices, SubmitNodeCollector queue, CameraRenderState cameraState) {{
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }}
}}
        """)

    def create_blockentity_rendererstate(self):
        self.create_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/rendering/blockentity/{self.CapitalizedName}BlockEntityRenderState.java", 
            contents=f"""
package org.squaresaresquare.client.rendering.blockentity;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Display.ItemDisplay.ItemRenderState;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class {self.CapitalizedName}BlockEntityRenderState extends BlockEntityRenderState {{
    public BlockPos lightPosition;
    public float rotation;
    final ItemRenderState itemRenderState = new ItemRenderState(ItemStack.EMPTY, ItemDisplayContext.NONE);
}}
        """)

    def update_Architecture_blocksClient(self):
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/Architecture_blocksClient.java", update_string=f"""
        BlockColorRegistry.register(List.of(new BlockTintSource() {{
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {{
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {{
                    return 0xFF98FB98; // Color code in hex format
                }}
                return 0xFFFFDAB9; // Color code in hex format
            }}
            @Override
            public int color(BlockState state) {{
                return 0xFFFFDAB9; // Color code in hex format
            }}
        }}), ModBlocks.{self.uppercaseName});
                """)


    def update_ModItems(self):
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/item/ModItems.java",
            update_string=f"    public static final Item {self.uppercaseName} = registerItem(\"{self.block_name}\", Item::new);")
        
    def update_ModRecipeProvider(self):
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/datagen/ModRecipeProvider.java",
            update_string=self.recipe_block)

    def update_ModBlockLootTableProvider(self):
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/datagen/ModBlockLootTableProvider.java",
            update_string=f"    dropSelf(ModBlocks.{self.uppercaseName});")

    def update_ModCreativeModeTabs(self):
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/creativemodetab/ModCreativeModeTabs.java",
            update_string=f"                        output.accept(ModBlocks.{self.uppercaseName});")
                
    def update_ModBlocks(self):
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/block/ModBlocks.java",
        update_string=f""" 
        public static final Block {self.uppercaseName} = register(
            "{self.block_name}",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );
        """)

    def create_item_model(self):
        self.create_file(file_path=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/models/item/{self.block_name}.json",
        contents='''
{
  "parent": "architecture_blocks:block/{self.block_name}"
}
        ''')

    def create_custom_block_entity_file(self):
        self.create_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/block/entity/custom/{self.CapitalizedName}BlockEntity.java",
        contents=f"""
package org.squaresaresquare.client.block.entity.custom;

import org.squaresaresquare.client.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class {self.CapitalizedName}BlockEntity extends BlockEntity {{
    public {self.CapitalizedName}BlockEntity(BlockPos pos, BlockState state) {{
        super(ModBlockEntities.{self.uppercaseName}_BLOCK_ENTITY, pos, state);
    }}
}}
        """)

    def update_ModBlockEntities(self):
        self.update_file(file_path = f"{self.mod_path}/src/client/java/org/squaresaresquare/client/block/entity/ModBlockEntities.java",
        update_string = f"""
    public static final BlockEntityType<{self.CapitalizedName}BlockEntity> {self.uppercaseName}_BLOCK_ENTITY =
        register("{self.block_name}", {self.CapitalizedName}BlockEntity::new, ModBlocks.{self.uppercaseName});
        """)
        # second update
        self.update_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/block/entity/ModBlockEntities.java",
            pattern='::new import here',
            update_string=f"import org.squaresaresquare.client.block.entity.custom.{self.CapitalizedName}BlockEntity;")

    def update_en_us(self):
        self.update_file(file_path=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/lang/en_us.json",
            pattern="stub",
            update_string=f'''"block.architecture_blocks.{self.block_name}": "{str(str(self.block_name).capitalize).replace('_', ' ')}",''')
    
    def create_custom_block_file(self):
        shapedir = "/src/main/resources/assets/architecture_blocks/shapes/"
        Shape_function = str()

        with open(f"{self.mod_path}{shapedir}{self.block_name}.txt", "r", encoding="utf-8") as file:
            lines = file.readlines()
        modified_lines = list()
        for line in lines:
            Shape_function += re.sub(r'^', '    ', line)
        
        self.create_file(file_path=f"{self.mod_path}/src/client/java/org/squaresaresquare/client/block/custom/{self.CapitalizedName}Block.java",
        contents=f"""
package org.squaresaresquare.client.block.custom;

import com.mojang.serialization.MapCodec;
import javax.swing.text.html.BlockView;
import org.jetbrains.annotations.Nullable;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.{self.CapitalizedName}BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.client.renderer.rendertype.RenderType;

public class {self.CapitalizedName}Block extends BaseEntityBlock {{

{Shape_function}

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {{
        return this.makeShape();
    }}

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {{
        return this.makeShape();
    }}

    public {self.CapitalizedName}Block(Properties settings) {{
        super(settings);
    }}

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {{
        return simpleCodec({self.CapitalizedName}Block::new);
    }}

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {{
        return new {self.CapitalizedName}BlockEntity(pos, state);
    }}

    public void onInitialize() {{
        ModBlocks.initialize();
    }}
}}
        """)

    def create_blockstate_json(self):
        self.create_file(file_path=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/blockstates/{self.block_name}.json",
            contents=f'''{{
  "variants": {{
    "": {{
      "model": "architecture_blocks:block/{self.block_name}"
    }}
  }}
}}
        ''')

    def create_item_json(self):
        self.create_file(file_path=f"{self.mod_path}/src/main/resources/assets/architecture_blocks/models/item/{self.block_name}.json",
            contents=f'''{{
  "parent": "architecture_blocks:block/{self.block_name}"
}}
            ''')


def roll_back(self) -> bool:
    for backupfile in self.backup_files:
        local_file = backupfile.replace('.bak' '')
        try:
            shutil.rename(backupfile, local_file)
        except:
            return False
        else:
            return True

def clean_up_on_success(self):
    for backupfile in self.backup_files:
        os.remove(backupfile)

def signal_handler(sig: int, frame, obj: object):
    sys.stderr.write("Aborting block add. Rolling back\n")
    self.logger.warn("Aborting block add. Rolling back")
    if obj.roll_back():
        self.logger.warn("Block add rolled back successfuly")
        sys.exit(0)
    else:
        sys.stderr.write("Block add roll back failed, manual cleanup is necessisary\n")
        self.logger.error("Block add roll back failed, manual cleanup is necessisary")
        raise RuntimeError("Block add roll back failed, manual cleanup is necessisary")
        sys.exit(255)


def main():
    #handle SIGINT (ctrl c)
    signal.signal(signal.SIGINT, signal_handler)
    #Command line options
    parser = argparse.ArgumentParser( description="A script to add a block to my minecraft mod")
    parser.add_argument("-m", "--mod_path", type=str, default="", help="Path to the minecraft mod project directory")
    parser.add_argument("-b", "--block_name", type=str, help="Block name, must match the model file name without extention")
    parser.add_argument("-i", "--ingredients", type=str, help="Comma separated list of minecraft ingredients in upercase. For exampe \"STICK,COBBLESTONE\"")
    parser.add_argument("-r", "--recipe", type=str, help="A comma separated list of up to 3 rows of ingredients as they would be used with a crafting table. For example, if ingredients are \"STICK,COBBLESTONE\" a pickaxe recipe would be: \"'111',' 0 ',' 0 '")
    parser.add_argument("-c", "--recipe_result_count", type=int, default=1, help="A comma separated list of up to 3 rows of ingredients as they would be used with a crafting table. For example, if ingredients are \"STICK,COBBLESTONE\" a pickaxe recipe would be: \"'111',' 0 ',' 0 '")
    parser.add_argument("-v", "--verbose", action="store_true", help="Enable verbose mode")
    parser.add_argument("-d", "--debug", action="store_true", help="Enable debug mode")
    args = parser.parse_args()
    #instantiate object
    ingredients = re.split(r"[,]", args.ingredients) 
    crafting_table_patterns = re.split(r"[,; ]", args.recipe) 
    block_name = args.block_name
    
    recipe = dict(ingredients=ingredients, patterns=crafting_table_patterns)
    ab = addBlock(mod_path=args.mod_path,verbose=args.verbose,debug=args.debug)
    ab.add_block(recipe, block_name, int(args.recipe_result_count))
if __name__ == "__main__":
        main()
