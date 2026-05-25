package net.minecraft.architecturemod.block.entity;

import net.minecraft.architecturemod.ArchitectureMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.minecraft.architecturemod.block.ModBlocks;
import net.minecraft.architecturemod.block.entity.custom.QuartzPillarBlockEntity;

public class ModBlockEntities {
    public static final BlockEntityType<QuartzPillarBlockEntity> QUARTZ_PILLAR_BLOCK_ENTITY =
            register("quartz_pillar", QuartzPillarBlockEntity::new, ModBlocks.QUARTZ_PILLAR);

    public static final BlockEntityType<QuartzPillarBlockEntity> COUNTER_BLOCK_ENTITY =
            register("counter", QuartzPillarBlockEntity::new, ModBlocks.QUARTZ_PILLAR);

    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }


    public static void initialize() {
    }
}
