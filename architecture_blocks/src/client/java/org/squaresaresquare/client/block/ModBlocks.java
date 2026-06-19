package org.squaresaresquare.client.block;

import java.util.function.Function;

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
import org.squaresaresquare.client.block.custom.WhiteMarbleBlockBlock;
import org.squaresaresquare.client.block.custom.MarblePillarBaseBlock;
import org.squaresaresquare.client.block.custom.QuadWindow01Block;
import org.squaresaresquare.client.block.custom.QuadWindow24Block;
import org.squaresaresquare.client.block.custom.QuadWindow23Block;import org.squaresaresquare.client.block.custom.QuadWindow22Block;import org.squaresaresquare.client.block.custom.QuadWindow21Block;import org.squaresaresquare.client.block.custom.QuadWindow14Block;import org.squaresaresquare.client.block.custom.QuadWindow12Block;import org.squaresaresquare.client.block.custom.QuadWindow13Block;import org.squaresaresquare.client.block.custom.QuadWindow11Block;import org.squaresaresquare.client.block.custom.QuadWindow02Block;import org.squaresaresquare.client.block.custom.QuadWindow03Block;import org.squaresaresquare.client.block.custom.QuadWindow04Block;//::new import here

public class ModBlocks {
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        // Create a registry key for the block

        ResourceKey<@NotNull Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.setId(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            ResourceKey<@NotNull Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
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
    public static final Block MARBLE_PLINTH_BLOCK = register(
            "marble_plinth_block",
            MarblePlinthBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

 
    public static final Block WHITE_MARBLE_BLOCK = register(
            "white_marble_block",
            WhiteMarbleBlockBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block MARBLE_PILLAR = register(
            "marble_pillar",
            MarblePillarBaseBlock::new,
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

    public static final Block QUAD_WINDOW_0_1 = register(
        "quad_window_0_1",
        QuadWindow01Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
        
 
    public static final Block QUAD_WINDOW_0_4 = register(
        "quad_window_0_4",
        QuadWindow04Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_0_3 = register(
        "quad_window_0_3",
        QuadWindow03Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_0_2 = register(
        "quad_window_0_2",
        QuadWindow02Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_1_1 = register(
        "quad_window_1_1",
        QuadWindow11Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_1_3 = register(
        "quad_window_1_3",
        QuadWindow13Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_1_2 = register(
        "quad_window_1_2",
        QuadWindow12Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block QUAD_WINDOW_1_4 = register(
        "quad_window_1_4",
        QuadWindow14Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_2_1 = register(
        "quad_window_2_1",
        QuadWindow21Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_2_2 = register(
        "quad_window_2_2",
        QuadWindow22Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block QUAD_WINDOW_2_4 = register(
        "quad_window_2_4",
        QuadWindow24Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
 
    public static final Block QUAD_WINDOW_2_3 = register(
        "quad_window_2_3",
        QuadWindow23Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );
                                                                                                            //::new block here
    public static void initialize() {

    }
}
