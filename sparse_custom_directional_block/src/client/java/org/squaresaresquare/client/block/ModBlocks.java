package org.squaresaresquare.client.block;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import org.squaresaresquare.Sparse_custom_directional_block;
import net.minecraft.world.level.block.*;
import net.minecraft.core.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

/*
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
*/

public class ModBlocks {
    private static void registerDirectionalBlockItem(String name, HorizontalDirectionalBlock block){
        Sparse_custom_directional_block.LOGGER.info("Registering Directional Blocks for " + Sparse_custom_directional_block.MOD_ID);
        Registry.register(BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(
                        Sparse_custom_directional_block.MOD_ID
                        name),
                new BlockItem(block,
                        new Item.Properties().
                                useBlockDescriptionPrefix().
                                setId(ResourceKey.
                                        create(Registries.ITEM,
                                                Identifier.fromNamespaceAndPath(Sparse_custom_directional_block.MOD_ID)))));

    }
    private static void registerBlockItem(String name,Block  block){
        Sparse_custom_directional_block.LOGGER.info("Registering Blocks for " + Sparse_custom_directional_block.MOD_ID)
    }
    private static void registerModBlocks(){
        Sparse_custom_directional_block.LOGGER.info("Registering Mod Blocks for " + Sparse_custom_directional_block.MOD_ID)
    }
}