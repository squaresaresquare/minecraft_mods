package org.squaresaresquare.client.block;

import java.util.List;
import java.util.function.Function;

import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.custom.MarblePlinthBlock;
import org.squaresaresquare.client.block.custom.MarbleBlockBlock;
import org.squaresaresquare.client.block.custom.TripleWindow01Block;
import org.squaresaresquare.client.block.custom.TripleWindow24Block;
import org.squaresaresquare.client.block.custom.TripleWindow52Block;
import org.squaresaresquare.client.block.custom.TripleWindow51Block;
import org.squaresaresquare.client.block.custom.TripleWindow50Block;
import org.squaresaresquare.client.block.custom.TripleWindow42Block;
import org.squaresaresquare.client.block.custom.TripleWindow41Block;
import org.squaresaresquare.client.block.custom.TripleWindow40Block;
import org.squaresaresquare.client.block.custom.TripleWindow32Block;
import org.squaresaresquare.client.block.custom.TripleWindow31Block;
import org.squaresaresquare.client.block.custom.TripleWindow30Block;
import org.squaresaresquare.client.block.custom.TripleWindow20Block;
import org.squaresaresquare.client.block.custom.TripleWindow23Block;
import org.squaresaresquare.client.block.custom.TripleWindow22Block;
import org.squaresaresquare.client.block.custom.TripleWindow21Block;
import org.squaresaresquare.client.block.custom.TripleWindow14Block;
import org.squaresaresquare.client.block.custom.TripleWindow12Block;
import org.squaresaresquare.client.block.custom.TripleWindow13Block;
import org.squaresaresquare.client.block.custom.TripleWindow11Block;
import org.squaresaresquare.client.block.custom.TripleWindow02Block;
import org.squaresaresquare.client.block.custom.TripleWindow03Block;
import org.squaresaresquare.client.block.custom.TripleWindow04Block;
import org.squaresaresquare.client.block.custom.TripleWindow43Block;
import org.squaresaresquare.client.block.custom.TripleWindow45Block;
import org.squaresaresquare.client.block.custom.TripleWindow44Block;
import org.squaresaresquare.client.block.custom.MarblePillarBlock;
import org.squaresaresquare.client.block.custom.OakLogBlock;
import org.squaresaresquare.client.block.custom.TripleWindow55Block;
import org.squaresaresquare.client.block.custom.TripleWindow54Block;
import org.squaresaresquare.client.block.custom.TripleWindow53Block;
import org.squaresaresquare.client.block.custom.TripleWindow35Block;
import org.squaresaresquare.client.block.custom.TripleWindow34Block;
import org.squaresaresquare.client.block.custom.TripleWindow33Block;
import org.squaresaresquare.client.block.custom.TripleWindow25Block;
import org.squaresaresquare.client.block.custom.TripleWindowComplete;
import org.squaresaresquare.client.block.custom.ArchedWindowLeftHalfColumnCapBlock;
import org.squaresaresquare.client.block.custom.ArchedWindowMiddleCapBlock;import org.squaresaresquare.client.block.custom.ArchedWindowMiddleColumnBlock;import org.squaresaresquare.client.block.custom.ArchedWindowMiddleBaseBlock;import org.squaresaresquare.client.block.custom.ArchedWindowRightHalfColumnCapBlock;import org.squaresaresquare.client.block.custom.ArchedWindowLeftHalfColumnMiddleBlock;import org.squaresaresquare.client.block.custom.ArchedWindowRightHalfColumnMiddleBlock;import org.squaresaresquare.client.block.custom.ArchedWindowRightHalfColumnBaseBlock;import org.squaresaresquare.client.block.custom.ArchedWindowLeftHalfColumnBaseBlock;import org.squaresaresquare.client.block.custom.PillarCapBlock;import org.squaresaresquare.client.block.custom.MarblePillarBaseBlock;//::new import here

public class ModBlocks {
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        // Create a registry key for the block

        ResourceKey<@NotNull Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.setId(blockKey));
        Block CUSTOM_BLOCK = Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            ResourceKey<@NotNull Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);

            BlockColorRegistry.register(List.of(new BlockTintSource() {
                @Override
                public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                    BlockState stateBelow = level.getBlockState(pos.below());
                    if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                        return 0xFF98FB98; // Color code in hex format
                    }
                    return 0xFFFFDAB9; // Color code in hex format
                }
                @Override
                public int color(BlockState state) {
                    return 0xFFFFDAB9; // Color code in hex format
                }
            }), CUSTOM_BLOCK );
        }
        return CUSTOM_BLOCK;
    }
    private static ResourceKey<@NotNull Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, name));
    }
    private static ResourceKey<@NotNull Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, name));
    }
    public static boolean neverAllowSpawn(BlockState state, BlockGetter level, BlockPos pos, EntityType<?> type) {
        return false;
    }
    public static final Block TRIPLE_WIND0W_COMPLETE = register(
            "triple_window_complete",
            TripleWindowComplete::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block MARBLE_PLINTH_BLOCK = register(
            "marble_plinth_block",
            MarblePlinthBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block MARBLE_BLOCK = register(
            "marble_block",
            MarbleBlockBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block MARBLE_PILLAR = register(
            "marble_pillar",
            MarblePillarBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block OAK_LOG = register(
            "oak_log",
            OakLogBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.WOOD)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_0_1 = register(
        "triple_window_0_1",
        TripleWindow01Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_0_2 = register(
            "triple_window_0_2",
            TripleWindow02Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_0_3 = register(
            "triple_window_0_3",
            TripleWindow03Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_0_4 = register(
        "triple_window_0_4",
        TripleWindow04Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_1_1 = register(
        "triple_window_1_1",
        TripleWindow11Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_1_2 = register(
            "triple_window_1_2",
            TripleWindow12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_1_3 = register(
        "triple_window_1_3",
        TripleWindow13Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_1_4 = register(
        "triple_window_1_4",
        TripleWindow14Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_2_0 = register(
            "triple_window_2_0",
            TripleWindow20Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_2_1 = register(
        "triple_window_2_1",
        TripleWindow21Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_2_2 = register(
        "triple_window_2_2",
        TripleWindow22Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_2_3 = register(
            "triple_window_2_3",
            TripleWindow23Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_2_4 = register(
        "triple_window_2_4",
        TripleWindow24Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_2_5 = register(
            "triple_window_2_5",
            TripleWindow25Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_3_0 = register(
        "triple_window_3_0",
        TripleWindow30Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_3_1 = register(
        "triple_window_3_1",
        TripleWindow31Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_3_2 = register(
        "triple_window_3_2",
        TripleWindow32Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_3_3 = register(
            "triple_window_3_3",
            TripleWindow33Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );


    public static final Block TRIPLE_WINDOW_3_4 = register(
            "triple_window_3_4",
            TripleWindow34Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_3_5 = register(
            "triple_window_3_5",
            TripleWindow35Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_4_0 = register(
        "triple_window_4_0",
        TripleWindow40Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_4_1 = register(
        "triple_window_4_1",
        TripleWindow41Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_4_2 = register(
        "triple_window_4_2",
        TripleWindow42Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_4_3 = register(
            "triple_window_4_3",
            TripleWindow43Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_4_4 = register(
            "triple_window_4_4",
            TripleWindow44Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block TRIPLE_WINDOW_4_5 = register(
            "triple_window_4_5",
            TripleWindow45Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block TRIPLE_WINDOW_5_0 = register(
        "triple_window_5_0",
        TripleWindow50Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_5_1 = register(
        "triple_window_5_1",
        TripleWindow51Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block TRIPLE_WINDOW_5_2 = register(
        "triple_window_5_2",
        TripleWindow52Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_5_3 = register(
        "triple_window_5_3",
        TripleWindow53Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_5_4 = register(
        "triple_window_5_4",
        TripleWindow54Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block TRIPLE_WINDOW_5_5 = register(
        "triple_window_5_5",
        TripleWindow55Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block MARBLE_PILLAR_BASE = register(
        "marble_pillar_base",
        MarblePillarBaseBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block PILLAR_CAP = register(
        "pillar_cap",
        PillarCapBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE = register(
        "arched_window_left_half_column_base",
        ArchedWindowLeftHalfColumnBaseBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE = register(
        "arched_window_right_half_column_base",
        ArchedWindowRightHalfColumnBaseBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE = register(
        "arched_window_right_half_column_middle",
        ArchedWindowRightHalfColumnMiddleBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE = register(
        "arched_window_left_half_column_middle",
        ArchedWindowLeftHalfColumnMiddleBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP = register(
        "arched_window_right_half_column_cap",
        ArchedWindowRightHalfColumnCapBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP = register(
        "arched_window_left_half_column_cap",
        ArchedWindowLeftHalfColumnCapBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_MIDDLE_BASE = register(
        "arched_window_middle_base",
        ArchedWindowMiddleBaseBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_MIDDLE_COLUMN = register(
        "arched_window_middle_column",
        ArchedWindowMiddleColumnBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block ARCHED_WINDOW_MIDDLE_CAP = register(
        "arched_window_middle_cap",
        ArchedWindowMiddleCapBlock::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
    public static final Block INVISIBLE = register(
            "invisible",
            MarblePillarBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.GLASS),
            true
    );

    //::new block here                                                                                                                                                                                                                    //::new block here
    public static void initialize() {

    }
}
