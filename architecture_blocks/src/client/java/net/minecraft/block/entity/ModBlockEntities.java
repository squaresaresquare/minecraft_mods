package net.minecraft.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.ModBlocks;
import net.minecraft.block.entity.custom.OakLogBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.squaresaresquare.Architecture_blocks;

public class ModBlockEntities {
    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }    public static final BlockEntityType<OakLogBlockEntity> OAK_LOG_BLOCK_ENTITY = register("oak_log", OakLogBlockEntity::new, ModBlocks.OAK_LOG_BLOCK);
    //::new block here

    public static void initialize() {
    }



}
