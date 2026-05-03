package org.seanpaulhumphrey.architecture.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static void registerItemGroups() {
        Architecture.LOGGER.info("Registering Item Groups for " + Architecture.MOD_ID);
    }
}
