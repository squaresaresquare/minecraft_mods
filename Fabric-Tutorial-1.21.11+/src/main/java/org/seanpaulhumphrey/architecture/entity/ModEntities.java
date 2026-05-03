package org.seanpaulhumphrey.architecture.entity;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static void registerModEntities() {
        Architecture.LOGGER.info("Registering Mod Entities for " + Architecture.MOD_ID);
    }
}
