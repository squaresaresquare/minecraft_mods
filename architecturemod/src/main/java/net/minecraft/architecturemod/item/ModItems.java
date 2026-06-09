package net.minecraft.architecturemod.item;

import net.minecraft.architecturemod.ArchitectureMod;
import net.minecraft.architecturemod.block.ModBlocks;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

public class ModItems {
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, name)))));
    }

    //just to have an item with an icon we can use for the custom creative tab
    public static final Item GENERIC_ITEM = registerItem("generic_item", Item::new);
    public static final Item QUARTZ_PILLAR = registerItem("quartz_pillar", Item::new);
    public static final Item QUARTZ_PILLAR_CAP = registerItem("quartz_pillar_cap", Item::new);
    public static final Item QUARTZ_PILLAR_BASE = registerItem("quartz_pillar_base", Item::new);
    //A tab in creative mode to put all the custom blocks under
    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, "creative_tab")
    );
}
