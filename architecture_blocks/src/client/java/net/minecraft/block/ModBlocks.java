package net.minecraft.block;

import net.minecraft.block.custom.OakLogBlock;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.squaresaresquare.Architecture_blocks;

import java.util.function.Function;
//::new import here

public class ModBlocks {
    public static final Block OAK_LOG_BLOCK = register(
            "oak_log",
            OakLogBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block INVISIBLE = register(
            "invisible",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.GLASS),
            true
    );

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

    //::new block here                                                                                                                                                                                                                    //::new block here
    public static void initialize() {

    }
}
