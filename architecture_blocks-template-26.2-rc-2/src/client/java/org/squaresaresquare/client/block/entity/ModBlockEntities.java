package org.squaresaresquare.client.block.entity;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.MarblePlinthBlockEntity;

import org.squaresaresquare.client.block.entity.custom.WhiteMarbleBlockBlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow11BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow12BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow13BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow14BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow15BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow16BlockEntity;
//::new import here

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class ModBlockEntities {
    public static final BlockEntityType<MarblePlinthBlockEntity> MARBLE_PLINTH_BLOCK_ENTITY =
            register("quartz_pillar", MarblePlinthBlockEntity::new, ModBlocks.MARBLE_PLINTH_BLOCK);

    public static final BlockEntityType<WhiteMarbleBlockBlockEntity> WHITE_MARBLE_BLOCK_BLOCK_ENTITY =
        register("white_marble_block", WhiteMarbleBlockBlockEntity::new, ModBlocks.WHITE_MARBLE_BLOCK);
        

    public static final BlockEntityType<QuadWindow11BlockEntity> QUAD_WINDOW_1_1_BLOCK_ENTITY =
        register("quad_window_1_1", QuadWindow11BlockEntity::new, ModBlocks.QUAD_WINDOW_1_1);
        

    public static final BlockEntityType<QuadWindow12BlockEntity> QUAD_WINDOW_1_2_BLOCK_ENTITY =
        register("quad_window_1_2", QuadWindow12BlockEntity::new, ModBlocks.QUAD_WINDOW_1_2);
        

    public static final BlockEntityType<QuadWindow13BlockEntity> QUAD_WINDOW_1_3_BLOCK_ENTITY =
        register("quad_window_1_3", QuadWindow13BlockEntity::new, ModBlocks.QUAD_WINDOW_1_3);
        

    public static final BlockEntityType<QuadWindow14BlockEntity> QUAD_WINDOW_1_4_BLOCK_ENTITY =
        register("quad_window_1_4", QuadWindow14BlockEntity::new, ModBlocks.QUAD_WINDOW_1_4);
        

    public static final BlockEntityType<QuadWindow15BlockEntity> QUAD_WINDOW_1_5_BLOCK_ENTITY =
        register("quad_window_1_5", QuadWindow15BlockEntity::new, ModBlocks.QUAD_WINDOW_1_5);
        

    public static final BlockEntityType<QuadWindow16BlockEntity> QUAD_WINDOW_1_6_BLOCK_ENTITY =
        register("quad_window_1_6", QuadWindow16BlockEntity::new, ModBlocks.QUAD_WINDOW_1_6);
        
    //::new block here
    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }

    public static void initialize() {
    }

}
