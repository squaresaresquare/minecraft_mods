package org.seanpaulhumphrey.architecture.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class ModItems {
    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Architecture.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Architecture.MOD_ID, name)))));
    }
    public static void registerModItems() {
        Architecture.LOGGER.info("Registering Mod Items for " + Architecture.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}