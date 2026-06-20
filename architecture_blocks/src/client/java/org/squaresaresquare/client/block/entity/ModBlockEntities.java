package org.squaresaresquare.client.block.entity;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.MarblePlinthBlockEntity;

import org.squaresaresquare.client.block.entity.custom.WhiteMarbleBlockBlockEntity;
import org.squaresaresquare.client.block.entity.custom.MarblePillarBlockEntity;
import org.squaresaresquare.client.block.entity.custom.MarblePillarBaseBlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow01BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow24BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow23BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow22BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow21BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow14BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow12BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow13BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow11BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow02BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow03BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow04BlockEntity;
import org.squaresaresquare.client.block.entity.custom.QuadWindow42BlockEntity;import org.squaresaresquare.client.block.entity.custom.QuadWindow41BlockEntity;import org.squaresaresquare.client.block.entity.custom.QuadWindow40BlockEntity;import org.squaresaresquare.client.block.entity.custom.QuadWindow32BlockEntity;import org.squaresaresquare.client.block.entity.custom.QuadWindow31BlockEntity;import org.squaresaresquare.client.block.entity.custom.QuadWindow30BlockEntity;import org.squaresaresquare.client.block.entity.custom.QuadWindow20BlockEntity;//::new import here

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

    public static final BlockEntityType<MarblePillarBlockEntity> MARBLE_PILLAR_BLOCK_ENTITY =
        register("marble_pillar", MarblePillarBlockEntity::new, ModBlocks.MARBLE_PILLAR);

    public static final BlockEntityType<MarblePillarBaseBlockEntity> MARBLE_PILLAR_BASE_BLOCK_ENTITY =
        register("marble_pillar_base", MarblePillarBaseBlockEntity::new, ModBlocks.MARBLE_PILLAR_BASE);

    public static final BlockEntityType<QuadWindow01BlockEntity> QUAD_WINDOW_0_1_BLOCK_ENTITY =
        register("quad_window_0_1", QuadWindow01BlockEntity::new, ModBlocks.QUAD_WINDOW_0_1);

    public static final BlockEntityType<QuadWindow04BlockEntity> QUAD_WINDOW_0_4_BLOCK_ENTITY =
        register("quad_window_0_4", QuadWindow04BlockEntity::new, ModBlocks.QUAD_WINDOW_0_4);

    public static final BlockEntityType<QuadWindow03BlockEntity> QUAD_WINDOW_0_3_BLOCK_ENTITY =
        register("quad_window_0_3", QuadWindow03BlockEntity::new, ModBlocks.QUAD_WINDOW_0_3);

    public static final BlockEntityType<QuadWindow02BlockEntity> QUAD_WINDOW_0_2_BLOCK_ENTITY =
        register("quad_window_0_2", QuadWindow02BlockEntity::new, ModBlocks.QUAD_WINDOW_0_2);

    public static final BlockEntityType<QuadWindow13BlockEntity> QUAD_WINDOW_1_3_BLOCK_ENTITY =
        register("quad_window_1_3", QuadWindow13BlockEntity::new, ModBlocks.QUAD_WINDOW_1_3);

    public static final BlockEntityType<QuadWindow12BlockEntity> QUAD_WINDOW_1_2_BLOCK_ENTITY =
        register("quad_window_1_2", QuadWindow12BlockEntity::new, ModBlocks.QUAD_WINDOW_1_2);

    public static final BlockEntityType<QuadWindow11BlockEntity> QUAD_WINDOW_1_1_BLOCK_ENTITY =
        register("quad_window_1_1", QuadWindow11BlockEntity::new, ModBlocks.QUAD_WINDOW_1_1);

    public static final BlockEntityType<QuadWindow14BlockEntity> QUAD_WINDOW_1_4_BLOCK_ENTITY =
        register("quad_window_1_4", QuadWindow14BlockEntity::new, ModBlocks.QUAD_WINDOW_1_4);

    public static final BlockEntityType<QuadWindow21BlockEntity> QUAD_WINDOW_2_1_BLOCK_ENTITY =
        register("quad_window_2_1", QuadWindow21BlockEntity::new, ModBlocks.QUAD_WINDOW_2_1);

    public static final BlockEntityType<QuadWindow22BlockEntity> QUAD_WINDOW_2_2_BLOCK_ENTITY =
        register("quad_window_2_2", QuadWindow22BlockEntity::new, ModBlocks.QUAD_WINDOW_2_2);

    public static final BlockEntityType<QuadWindow24BlockEntity> QUAD_WINDOW_2_4_BLOCK_ENTITY =
        register("quad_window_2_4", QuadWindow24BlockEntity::new, ModBlocks.QUAD_WINDOW_2_4);

    public static final BlockEntityType<QuadWindow23BlockEntity> QUAD_WINDOW_2_3_BLOCK_ENTITY =
        register("quad_window_2_3", QuadWindow23BlockEntity::new, ModBlocks.QUAD_WINDOW_2_3);

    public static final BlockEntityType<QuadWindow20BlockEntity> QUAD_WINDOW_2_0_BLOCK_ENTITY =
        register("quad_window_2_0", QuadWindow20BlockEntity::new, ModBlocks.QUAD_WINDOW_2_0);

    public static final BlockEntityType<QuadWindow30BlockEntity> QUAD_WINDOW_3_0_BLOCK_ENTITY =
        register("quad_window_3_0", QuadWindow30BlockEntity::new, ModBlocks.QUAD_WINDOW_3_0);

    public static final BlockEntityType<QuadWindow31BlockEntity> QUAD_WINDOW_3_1_BLOCK_ENTITY =
        register("quad_window_3_1", QuadWindow31BlockEntity::new, ModBlocks.QUAD_WINDOW_3_1);

    public static final BlockEntityType<QuadWindow32BlockEntity> QUAD_WINDOW_3_2_BLOCK_ENTITY =
        register("quad_window_3_2", QuadWindow32BlockEntity::new, ModBlocks.QUAD_WINDOW_3_2);

    public static final BlockEntityType<QuadWindow40BlockEntity> QUAD_WINDOW_4_0_BLOCK_ENTITY =
        register("quad_window_4_0", QuadWindow40BlockEntity::new, ModBlocks.QUAD_WINDOW_4_0);

    public static final BlockEntityType<QuadWindow41BlockEntity> QUAD_WINDOW_4_1_BLOCK_ENTITY =
        register("quad_window_4_1", QuadWindow41BlockEntity::new, ModBlocks.QUAD_WINDOW_4_1);

    public static final BlockEntityType<QuadWindow42BlockEntity> QUAD_WINDOW_4_2_BLOCK_ENTITY =
        register("quad_window_4_2", QuadWindow42BlockEntity::new, ModBlocks.QUAD_WINDOW_4_2);
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
