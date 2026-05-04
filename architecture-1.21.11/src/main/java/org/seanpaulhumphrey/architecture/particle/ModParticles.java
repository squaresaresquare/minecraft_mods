package org.seanpaulhumphrey.architecture.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Architecture.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        Architecture.LOGGER.info("Registering Particles for " + Architecture.MOD_ID);
    }
}
