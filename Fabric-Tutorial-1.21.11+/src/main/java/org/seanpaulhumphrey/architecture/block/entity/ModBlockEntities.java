package org.seanpaulhumphrey.architecture.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuartzPillarEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<QuartzPillarEntity> PILLAR_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "pillar_be"),
                    FabricBlockEntityTypeBuilder.create(QuartzPillarEntity::new, ModBlocks.QUARTZ_PILLAR).build(null));
    public static void registerBlockEntities() {
        Architecture.LOGGER.info("Registering Block Entities for " + Architecture.MOD_ID);
    }
}
