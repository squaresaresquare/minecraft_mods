#!/usr/bin/env python3
from pathlib import Path
from collections import defaultdict
import shutil, errno, os, unicodedata
home = str(Path.home())

moddirectory = f"{home}/Documents/GitRepos/minecraft_mods/architecture-1.21.11/"
block_model_directory=f"{moddirectory}src/main/resources/assets/architecture/models/block"

capitalized = list()
capitalized_nospaces = list()
ucase = list()
lcase = list()
description = list()

for entry in Path(block_model_directory).iterdir():
    file_name = str(entry.stem)
    if not file_name in [".DS_Store",".gitignore"]:
        parts = str(file_name).split('_')

        for i in range(len(parts)):
            parts[i] = parts[i].capitalize()
        capitalized.append('_'.join(parts))
        capitalized_nospaces.append(''.join(parts))
        description.append(' '.join(parts))
        ucase.append(file_name.upper())
        lcase.append(file_name.lower())

ModBlocks = defaultdict(list)
ModBlockEntities = defaultdict(list)
ModRecipeProvider = list()
ModLootTableProvider = list()
ModConfiguredFeatures = list()
ModPlacedFeatures = list()
ModRecipes = list()
ModScreenHandlers = list()
ArchitectureModClient = list()

en_us_list = list()

for i in range(len(capitalized)):
    #All this stuff ["".join(ch for ch in <string> if unicodedata.category(ch)[0]!="C")]
    #Removes control characters
    lc = "".join(ch for ch in lcase[i] if unicodedata.category(ch)[0]!="C")
    uc = "".join(ch for ch in ucase[i] if unicodedata.category(ch)[0]!="C")
    cp = "".join(ch for ch in ucase[i] if unicodedata.category(ch)[0]!="C")
    cpw = "".join(ch for ch in capitalized_nospaces[i] if unicodedata.category(ch)[0]!="C")
    desc = "".join(ch for ch in description[i] if unicodedata.category(ch)[0]!="C")
        
    ModBlocks['registerBlock'] = ModBlocks['registerBlock'][:] + [f'''    public static final Block {uc} = registerBlock("{lc}",
            properties -> new {cpw}(properties.nonOpaque()));''']

    ModBlocks['ItemGroupEvents'] = ModBlocks['ItemGroupEvents'][:] + [f"            entries.add(ModBlocks.{uc} );"]
   
    ModBlockEntities['import'] = ModBlockEntities['import'][:] + [f'''import org.seanpaulhumphrey.architecture.block.entity.custom.{cpw}Entity;''']

    ModBlockEntities['BlockEntityType'] = ModBlockEntities['BlockEntityType'][:] + [f'''    public static final BlockEntityType<{cpw}Entity>{uc}_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "{lc}_be"),
                        FabricBlockEntityTypeBuilder.create({cpw}Entity::new, ModBlocks.{uc}).build(null));''']   

    OutlineShape=""
    CollisionShape=""

    //collision detection part
    protected static final VoxelShape NORTH_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE =
            Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    protected static final VoxelShape NORTH_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape WEST_HALFSHAPE =
            VoxelShapes.cuboid(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);



    ModRecipeProvider.append(f'''                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.{uc}, RecipeCategory.DECORATIONS, ModBlocks.{uc});
    createShaped(RecipeCategory.MISC, ModBlocks.{uc})
            .pattern("XXX")
            .pattern("XXX")
            .pattern("XXX")
            .input('Q', ModBlocks.QUARTZ_PILLAR)
            .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
            .offerTo(exporter);

    createShapeless(RecipeCategory.MISC, ModBlocks.{uc}, 9)
            .input(ModBlocks.QUARTZ_PILLAR)
            .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
            .offerTo(exporter);
    ''')

    ModLootTableProvider.append(f"        addDrop(ModBlocks.{uc});\n")

    ModConfiguredFeatures.append(f'''    public static final RegistryKey<ConfiguredFeature<?, ?>> {uc} = registerKey("{lc}");\n''')

    ModPlacedFeatures.append(f'''    public static final RegistryKey<PlacedFeature> {uc}_KEY = registerKey("{lc}");''')

    ArchitectureModClient.append(f'''        BlockRenderLayerMap.putBlock(ModBlocks.{uc}, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.{uc}_BE, {cpw}EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.{uc}_SCREEN_HANDLER, {cpw}Screen::new);
    ''')

    ModRecipes.append(f'''public static final RecipeSerializer<{cpw}Recipe> {uc}_SERIALIZER = Registry.register(
    Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "{lc}"),
        new {cpw}Recipe.Serializer());
    public static final RecipeType<{cpw}Recipe> {uc}_TYPE = Registry.register(
        Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "{lc}"), new RecipeType<{cpw}Recipe>() {{
            @Override
            public String toString() {{
                return "{lc}";
            }}
        }});
    ''')

    ModScreenHandlers.append(f'''    public static final ScreenHandlerType<{cpw}ScreenHandler> {uc}_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "{lc}_screen_handler"),
        new ExtendedScreenHandlerType<>({cpw}ScreenHandler::new, BlockPos.PACKET_CODEC));
                    ''')
                    
    en_us_list.append(f'''  "block.architecture.{lc}_column": "{desc}''')
    # create custom blocks
    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/screen/custom/{cpw}Screen.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.screen.custom;

    import net.minecraft.client.gl.RenderPipelines;
    import net.minecraft.client.gui.DrawContext;
    import net.minecraft.client.gui.screen.ingame.HandledScreen;
    import net.minecraft.entity.player.PlayerInventory;
    import net.minecraft.text.Text;
    import net.minecraft.util.Identifier;
    import org.seanpaulhumphrey.architecture.Architecture;

    public class {cpw}Screen extends HandledScreen<{cpw}ScreenHandler> {{
        public static final Identifier GUI_TEXTURE =
                Identifier.of(Architecture.MOD_ID, "textures/gui/pillar/pillar_gui.png");

        public {cpw}Screen({cpw}ScreenHandler handler, PlayerInventory inventory, Text title) {{
            super(handler, inventory, title);
        }}

        @Override
        protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {{
            int x = (width - backgroundWidth) / 2;
            int y = (height - backgroundHeight) / 2;

            context.drawTexture(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight, 256, 256);
        }}

        @Override
            public void render(DrawContext context, int mouseX, int mouseY, float delta) {{
            super.render(context, mouseX, mouseY, delta);
                drawMouseoverTooltip(context, mouseX, mouseY);
        }}
    }}''')
    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/screen/custom/{cpw}ScreenHandler.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.screen.custom;

        import net.minecraft.block.entity.BlockEntity;
        import net.minecraft.entity.player.PlayerEntity;
        import net.minecraft.entity.player.PlayerInventory;
        import net.minecraft.inventory.Inventory;
        import net.minecraft.item.ItemStack;
        import net.minecraft.screen.ScreenHandler;
        import net.minecraft.screen.slot.Slot;
        import net.minecraft.util.math.BlockPos;
        import org.seanpaulhumphrey.architecture.screen.ModScreenHandlers;

        public class {cpw}ScreenHandler extends ScreenHandler {{
            private final Inventory inventory;

            public {cpw}ScreenHandler(int syncId, PlayerInventory playerInventory, BlockPos pos) {{
                this(syncId, playerInventory, playerInventory.player.getEntityWorld().getBlockEntity(pos));
        }}

        public {cpw}ScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity) {{
            super(ModScreenHandlers.{uc}_SCREEN_HANDLER, syncId);
            this.inventory = ((Inventory) blockEntity);

            this.addSlot(new Slot(inventory, 0, 80, 35) {{
                @Override
                public int getMaxItemCount() {{
                    return 1;
                }}
            }});

            addPlayerInventory(playerInventory);
            addPlayerHotbar(playerInventory);
        }}

        @Override
        public ItemStack quickMove(PlayerEntity player, int invSlot) {{
            ItemStack newStack = ItemStack.EMPTY;
            Slot slot = this.slots.get(invSlot);
            if (slot != null && slot.hasStack()) {{
                ItemStack originalStack = slot.getStack();
                newStack = originalStack.copy();
                if (invSlot < this.inventory.size()) {{
                    if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {{
                        return ItemStack.EMPTY;
                    }}
                }} else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {{
                    return ItemStack.EMPTY;
                }}

                if (originalStack.isEmpty()) {{
                    slot.setStack(ItemStack.EMPTY);
                }} else {{
                    slot.markDirty();
                }}
            }}
            return newStack;
        }}

        @Override
        public boolean canUse(PlayerEntity player) {{
            return this.inventory.canPlayerUse(player);
        }}

        private void addPlayerInventory(PlayerInventory playerInventory) {{
            for (int i = 0; i < 3; ++i) {{
                for (int l = 0; l < 9; ++l) {{
                    this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
                }}
            }}
        }}

        private void addPlayerHotbar(PlayerInventory playerInventory) {{
            for (int i = 0; i < 9; ++i) {{
                this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
            }}
        }}
    }}
    ''')



    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/block/entity/renderer/{cpw}EntityRenderer.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.block.entity.renderer;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.seanpaulhumphrey.architecture.block.entity.custom.*;
import net.minecraft.client.item.ItemModelManager;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.world.LightType;

public class {cpw}EntityRenderer implements BlockEntityRenderer<{cpw}Entity, BlockEntityRenderState> {{
    private final ItemModelManager itemModelManager;

    public {cpw}EntityRenderer(BlockEntityRendererFactory.Context context) {{
        itemModelManager = context.itemModelManager();
    }}

    @Override
    public {cpw}EntityRenderState createRenderState() {{
        return new {cpw}EntityRenderState();
    }}

    @Override
    public void render(BlockEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue queue, CameraRenderState cameraRenderState) {{

    }}

    private int getLightLevel(World world, BlockPos pos) {{
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }}
}}
    ''')

    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/block/entity/renderer/{cpw}EntityRenderState.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.block.entity.renderer;

import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class {cpw}EntityRenderState extends BlockEntityRenderState {{
    public BlockPos lightPosition;
    public World blockEntityWorld;
    public float rotation;

    final ItemRenderState itemRenderState = new ItemRenderState();
}}
    ''')

    # write separate collision for twin and full cuboid
    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/block/custom/{cpw}.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.level.LevelProperties.*;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Direction;
import org.seanpaulhumphrey.architecture.block.entity.custom.{cpw}Entity;

public class {cpw} extends BlockWithEntity implements BlockEntityProvider {{
    public static final MapCodec<{cpw}> CODEC = {cpw}.createCodec({cpw}::new);
    public {cpw}(Settings settings) {{
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HorizontalFacingBlock.FACING, Direction.NORTH));
    }}



    //the rest
    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {{
        return CODEC;
    }}

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {{
        return new {cpw}Entity(pos, state);
    }}

    @Override
    protected BlockRenderType getRenderType(BlockState state) {{
        return BlockRenderType.MODEL;
    }}

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos,
                                         PlayerEntity player, Hand hand, BlockHitResult hit) {{
        if(world.getBlockEntity(pos) instanceof {cpw}Entity {cpw}BlockEntity) {{
            if({cpw}BlockEntity.isEmpty() && !stack.isEmpty()) {{
                {cpw}BlockEntity.setStack(0, stack.copyWithCount(1));
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 2f);
                stack.decrement(1);

                {cpw}BlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            }} else if(stack.isEmpty() && !player.isSneaking()) {{
                ItemStack stackOnQuartzPillar = {cpw}BlockEntity.getStack(0);
                player.setStackInHand(Hand.MAIN_HAND, stackOnQuartzPillar);
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                {cpw}BlockEntity.clear();

                {cpw}BlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            }} else if(player.isSneaking() && !world.isClient()) {{
                player.openHandledScreen({cpw}BlockEntity);
            }}
        }}

        return ActionResult.SUCCESS;
    }}

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {{
        return this.getDefaultState().with(HorizontalFacingBlock.FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }}
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {{
        builder.add(HorizontalFacingBlock.FACING);
    }}

    //collision detection part
    protected static final VoxelShape NORTH_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE =
            Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    protected static final VoxelShape NORTH_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape WEST_HALFSHAPE =
            VoxelShapes.cuboid(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {{
        return switch (state.get(HorizontalFacingBlock.FACING)) {{
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> NORTH_SHAPE;
        }};
    }}
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {{
        return switch (state.get(HorizontalFacingBlock.FACING)) {{
            case SOUTH -> SOUTH_HALFSHAPE;
            case EAST -> EAST_HALFSHAPE;
            case WEST -> WEST_HALFSHAPE;
            default -> NORTH_HALFSHAPE;
        }};
    }}
}}
    ''')
    
    with open(f"{moddirectory}src/main/java/org/seanpaulhumphrey/architecture/block/entity/custom/{cpw}Entity.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.block.entity.custom;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import org.seanpaulhumphrey.architecture.block.entity.ImplementedInventory;
import org.seanpaulhumphrey.architecture.block.entity.ModBlockEntities;
import org.seanpaulhumphrey.architecture.screen.custom.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.Text;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import net.minecraft.entity.ai.pathing.NavigationType;

public class {cpw}Entity extends BlockEntity implements ImplementedInventory, ExtendedScreenHandlerFactory<@NotNull BlockPos> {{
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);
    private float rotation = 0;

    //@Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {{
        // Return true if mobs can pass through, false otherwise
        return false;
    }}

    public {cpw}Entity(BlockPos pos, BlockState state) {{
        super(ModBlockEntities.{uc}_BE, pos, state);
    }}

    @Override
    public DefaultedList<ItemStack> getItems() {{
        return inventory;
    }}

    public float getRenderingRotation() {{
        rotation += 0.5f;
        if(rotation >= 360) {{
            rotation = 0;
        }}
        return rotation;
    }}

    @Override
    protected void writeData(WriteView view) {{
        super.writeData(view);
        Inventories.writeData(view, inventory);
    }}

    @Override
    protected void readData(ReadView view) {{
        super.readData(view);
        Inventories.readData(view, inventory);
    }}

    @Override
    public void onBlockReplaced(BlockPos pos, BlockState oldState) {{
        ItemScatterer.spawn(world, pos, (this));
        super.onBlockReplaced(pos, oldState);
    }}

    @Override
    public BlockPos getScreenOpeningData(ServerPlayerEntity player) {{
        return this.pos;
    }}

    @Override
    public Text getDisplayName() {{
        return Text.literal("{cpw}");
    }}

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {{
        return new {cpw}ScreenHandler(syncId, playerInventory, this.pos);
    }}


    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {{
        return BlockEntityUpdateS2CPacket.create(this);
    }}

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {{
        return createNbt(registryLookup);
    }}
}}
    ''')

# create recipe.java files
    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/recipe/{cpw}Recipe.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record {cpw}Recipe(Ingredient inputItem, ItemStack output) implements Recipe<{cpw}RecipeInput> {{
    public DefaultedList<Ingredient> getIngredients() {{
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }}

    // read Recipe JSON files --> new {cpw}Recipe

    @Override
    public boolean matches({cpw}RecipeInput input, World world) {{
        if(world.isClient()) {{
            return false;
        }}

        return inputItem.test(input.getStackInSlot(0));
    }}

    @Override
    public ItemStack craft({cpw}RecipeInput input, RegistryWrapper.WrapperLookup lookup) {{
        return output.copy();
    }}

    @Override
    public RecipeSerializer<? extends Recipe<{cpw}RecipeInput>> getSerializer() {{
        return ModRecipes.{uc}_SERIALIZER;
    }}

    @Override
    public RecipeType<? extends Recipe<{cpw}RecipeInput>> getType() {{
        return ModRecipes.{uc}_TYPE;
    }}

    @Override
    public IngredientPlacement getIngredientPlacement() {{
        return IngredientPlacement.forSingleSlot(inputItem);
    }}

    @Override
    public RecipeBookCategory getRecipeBookCategory() {{
        return RecipeBookCategories.CRAFTING_MISC;
    }}

    public static class Serializer implements RecipeSerializer<{cpw}Recipe> {{
        public static final MapCodec<{cpw}Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter({cpw}Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter({cpw}Recipe::output)
        ).apply(inst, {cpw}Recipe::new));

        public static final PacketCodec<RegistryByteBuf, {cpw}Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, {cpw}Recipe::inputItem,
                        ItemStack.PACKET_CODEC, {cpw}Recipe::output,
                        {cpw}Recipe::new);

        @Override
        public MapCodec<{cpw}Recipe> codec() {{
            return CODEC;
        }}

        @Override
        public PacketCodec<RegistryByteBuf, {cpw}Recipe> packetCodec() {{
            return STREAM_CODEC;
        }}
    }}
}}
    ''')
        f.truncate()

    # create recipeInput.java files
    with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/recipe/{cpw}RecipeInput.java", "w") as f:
        f.write(f'''package org.seanpaulhumphrey.architecture.recipe;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record {cpw}RecipeInput(ItemStack input) implements RecipeInput {{
    @Override
    public ItemStack getStackInSlot(int slot) {{
        return input;
    }}

    @Override
    public int size() {{
        return 1;
    }}
}}
    ''')

#write the files
# create the ModBlocks.java file
block_0 = '\n'.join(ModBlocks['registerBlock'])
block_1 = '\n'.join(ModBlocks['ItemGroupEvents'])
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/block/ModBlocks.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.block;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.custom.*;
import org.seanpaulhumphrey.architecture.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {{
{block_0}
private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {{
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Architecture.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Architecture.MOD_ID, name), toRegister);
    }}

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {{
        return Registry.register(Registries.BLOCK, Identifier.of(Architecture.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Architecture.MOD_ID, name)))));
    }}

    private static void registerBlockItem(String name, Block block) {{
        Registry.register(Registries.ITEM, Identifier.of(Architecture.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Architecture.MOD_ID, name)))));
    }}

    public static void registerModBlocks() {{
        Architecture.LOGGER.info("Registering Mod Blocks for " + Architecture.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {{
            entries.add(ModBlocks.QUARTZ_PILLAR);
            entries.add(ModBlocks.HALF_QUARTZ_PILLAR);
    {block_1}
            }});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {{
            entries.add(ModBlocks.QUARTZ_PILLAR);
        }});
    }}
}}''')

#create the ModBlockEntities.java file
block_0 = '\n'.join(ModBlockEntities['BlockEntityType'])
import_0 = '\n'.join(ModBlockEntities['import'])

with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/block/entity/ModBlockEntities.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.block.entity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuartzPillarEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.HalfQuartzPillarEntity;
{import_0}
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {{
    public static final BlockEntityType<QuartzPillarEntity> PILLAR_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "pillar_be"),
                    FabricBlockEntityTypeBuilder.create(QuartzPillarEntity::new, ModBlocks.QUARTZ_PILLAR).build(null)); 
    public static final BlockEntityType<HalfQuartzPillarEntity> HALF_PILLAR_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "half_pillar_be"),
                    FabricBlockEntityTypeBuilder.create(HalfQuartzPillarEntity::new, ModBlocks.HALF_QUARTZ_PILLAR).build(null));
{block_0}
    public static void registerBlockEntities() {{
        Architecture.LOGGER.info("Registering Block Entities for " + Architecture.MOD_ID);
    }}
}}
''')

#create the ModRecipeProvider.java file
block_0 = '\n'.join(ModRecipeProvider)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/datagen/ModRecipeProvider.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.item.ModItems;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {{
        super(output, registriesFuture);
    }}

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {{
        return new RecipeGenerator(wrapperLookup, recipeExporter) {{
            @Override
            public void generate() {{
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HALF_QUARTZ_PILLAR, RecipeCategory.DECORATIONS, ModBlocks.HALF_QUARTZ_PILLAR);

                createShaped(RecipeCategory.MISC, ModBlocks.HALF_QUARTZ_PILLAR)
                        .pattern("XXX")
                        .pattern("XQX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUARTZ_PILLAR, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

    {block_0}

            }}
        }};
    }}

    @Override
    public String getName() {{
        return "Architecture Recipes";
    }}
}}
''')

# create ModLootTableProvider file
block_0 = '\n'.join(ModLootTableProvider)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/datagen/ModLootTableProvider.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {{
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {{
        super(dataOutput, registryLookup);
    }}

    @Override
    public void generate() {{
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(ModBlocks.QUARTZ_PILLAR);
        addDrop(ModBlocks.HALF_QUARTZ_PILLAR);
        {block_0}
    }}
}}

''')

# create ModConfiguredFeatures file
block_0 = '\n'.join(ModConfiguredFeatures)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/world/ModConfiguredFeatures.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.world;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class ModConfiguredFeatures {{
{block_0}
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {{
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Architecture.MOD_ID, name));
    }}

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {{
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }}
}}

''')

# create ModPlacedFeatures file
block_0 = '\n'.join(ModPlacedFeatures)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/world/ModPlacedFeatures.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.world;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {{
{block_0}
    public static void bootstrap(Registerable<PlacedFeature> context) {{
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
    }}

    public static RegistryKey<PlacedFeature> registerKey(String name) {{
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Architecture.MOD_ID, name));
    }}

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {{
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }}

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {{
        register(context, key, configuration, List.of(modifiers));
    }}
}}

''')

# create recipe/ModRecipes.java file
block_0 = '\n\n'.join(ModRecipes)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/recipe/ModRecipes.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.recipe;

import org.seanpaulhumphrey.architecture.*;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {{
{block_0}
    public static void registerRecipes() {{
        Architecture.LOGGER.info("Registering Custom Recipes for " + Architecture.MOD_ID);
    }}
}}
''')



# create en_us.json file
block_0 = ',\n'.join(en_us_list)
with open(f"{moddirectory}/src/main/resources/assets/architecture/lang/en_us.json", "w") as f:
    f.write(f'''{{
  "block.architecture.quartz_pillar": "Quartz Pillar",
  "block.architecture.half_quartz_pillar": "Half Quartz Pillar",
  "block.architecture.thin_quartz_base": "Thin Quartz Base",
  "block.architecture.thin_quartz_capital": "Thin Quartz Capital",
  "block.architecture.thin_quartz_column": "Thin Quartz Column"
{block_0}
}}
''')

block_0 = '\n'.join(ModScreenHandlers)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/screen/ModScreenHandlers.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.screen.custom.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {{
    {block_0}

    public static void registerScreenHandlers() {{
        Architecture.LOGGER.info("Registering Screen Handlers for " + Architecture.MOD_ID);
    }}
}}
''')

block_0 = '\n'.join(ArchitectureModClient)
with open(f"{moddirectory}/src/main/java/org/seanpaulhumphrey/architecture/ArchitectureModClient.java", "w") as f:
    f.write(f'''package org.seanpaulhumphrey.architecture;

import net.fabricmc.api.ClientModInitializer;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.block.entity.ModBlockEntities;
import org.seanpaulhumphrey.architecture.block.entity.renderer.*;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.seanpaulhumphrey.architecture.screen.ModScreenHandlers;
import net.minecraft.client.render.BlockRenderLayer;
import org.seanpaulhumphrey.architecture.screen.custom.*;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ArchitectureModClient implements ClientModInitializer {{
    @Override
    public void onInitializeClient() {{
{block_0}
    }}
}}
''')
print("complete")

