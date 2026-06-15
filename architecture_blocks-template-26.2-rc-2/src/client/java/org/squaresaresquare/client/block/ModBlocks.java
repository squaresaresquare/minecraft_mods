package org.squaresaresquare.client.block;

import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.NotNull;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.custom.MarblePlinthBlock;
import org.squaresaresquare.client.block.custom.WhiteMarbleBlockBlock;
import org.squaresaresquare.client.block.custom.QuadWindow11Block;
import org.squaresaresquare.client.block.custom.QuadWindow12Block;
import org.squaresaresquare.client.block.custom.QuadWindow13Block;
import org.squaresaresquare.client.block.custom.QuadWindow14Block;
import org.squaresaresquare.client.block.custom.QuadWindow15Block;
import org.squaresaresquare.client.block.custom.QuadWindow16Block;
//::new import here

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
    public static final Block MARBLE_PLINTH_BLOCK = register(
            "marble_plinth_block",
            MarblePlinthBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

 
    public static final Block WHITE_MARBLE_BLOCK = register(
            "white_marble_block",
            WhiteMarbleBlockBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    public static final Block QUAD_WINDOW_1_1 = register(
            "quad_window_1_1",
            QuadWindow11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    public static final Block QUAD_WINDOW_1_2 = register(
            "quad_window_1_2",
            QuadWindow12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    public static final Block QUAD_WINDOW_1_3 = register(
            "quad_window_1_3",
            QuadWindow13Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    public static final Block QUAD_WINDOW_1_4 = register(
            "quad_window_1_4",
            QuadWindow14Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    public static final Block QUAD_WINDOW_1_5 = register(
            "quad_window_1_5",
            QuadWindow15Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    public static final Block QUAD_WINDOW_1_6 = register(
            "quad_window_1_6",
            QuadWindow16Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    //::new block here
    public static void initialize() {

    }
}
