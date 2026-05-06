package org.seanpaulhumphrey.architecture.effect;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Architecture.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        Architecture.LOGGER.info("Registering Mod Effects for " + Architecture.MOD_ID);
    }
}
