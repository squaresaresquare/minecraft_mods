package org.squaresaresquare.client.block.entity;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.MarblePlinthBlockEntity;

import org.squaresaresquare.client.block.entity.custom.MarbleBlockBlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow01BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow24BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow23BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow22BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow21BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow14BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow12BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow13BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow11BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow02BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow03BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow04BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow52BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow51BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow50BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow42BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow41BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow40BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow32BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow31BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow30BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow20BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow55BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow54BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow53BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow35BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow34BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow33BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow25BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow43BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow45BlockEntity;
import org.squaresaresquare.client.block.entity.custom.TripleWindow44BlockEntity;
import org.squaresaresquare.client.block.entity.custom.MarblePillarBlockEntity;
import org.squaresaresquare.client.block.entity.custom.OakLogBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowLeftHalfColumnCapBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowMiddleCapBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowMiddleColumnBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowMiddleBaseBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowRightHalfColumnCapBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowLeftHalfColumnMiddleBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowRightHalfColumnMiddleBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowRightHalfColumnBaseBlockEntity;
import org.squaresaresquare.client.block.entity.custom.ArchedWindowLeftHalfColumnBaseBlockEntity;
import org.squaresaresquare.client.block.entity.custom.PillarCapBlockEntity;
import org.squaresaresquare.client.block.entity.custom.MarblePillarBaseBlockEntity;

import org.squaresaresquare.client.block.entity.custom.ThatchBlockEntity;//::new import here
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class ModBlockEntities {
    public static final BlockEntityType<MarbleBlockBlockEntity> MARBLE_BLOCK_BLOCK_ENTITY = register("marble_block", MarbleBlockBlockEntity::new, ModBlocks.MARBLE_BLOCK);
    public static final BlockEntityType<MarblePillarBaseBlockEntity> MARBLE_PILLAR_BASE_BLOCK_ENTITY = register("marble_pillar_base", MarblePillarBaseBlockEntity::new, ModBlocks.MARBLE_PILLAR_BASE);
    public static final BlockEntityType<OakLogBlockEntity> OAK_LOG_BLOCK_ENTITY = register("oak_log", OakLogBlockEntity::new, ModBlocks.OAK_LOG_BLOCK);
    public static final BlockEntityType<MarblePillarBlockEntity> MARBLE_PILLAR_BLOCK_ENTITY = register("marble_pillar", MarblePillarBlockEntity::new, ModBlocks.MARBLE_PILLAR);
    public static final BlockEntityType<MarblePlinthBlockEntity> MARBLE_PLINTH_BLOCK_ENTITY = register("quartz_pillar", MarblePlinthBlockEntity::new, ModBlocks.MARBLE_PLINTH_BLOCK);
    public static final BlockEntityType<PillarCapBlockEntity> PILLAR_CAP_BLOCK_ENTITY = register("pillar_cap", PillarCapBlockEntity::new, ModBlocks.PILLAR_CAP);
    public static final BlockEntityType<TripleWindow01BlockEntity> TRIPLE_WINDOW_0_1_BLOCK_ENTITY = register("triple_window_0_1", TripleWindow01BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_1);
    public static final BlockEntityType<TripleWindow02BlockEntity> TRIPLE_WINDOW_0_2_BLOCK_ENTITY = register("triple_window_0_2", TripleWindow02BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_2);
    public static final BlockEntityType<TripleWindow03BlockEntity> TRIPLE_WINDOW_0_3_BLOCK_ENTITY = register("triple_window_0_3", TripleWindow03BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_3);
    public static final BlockEntityType<TripleWindow04BlockEntity> TRIPLE_WINDOW_0_4_BLOCK_ENTITY = register("triple_window_0_4", TripleWindow04BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_4);
    public static final BlockEntityType<TripleWindow11BlockEntity> TRIPLE_WINDOW_1_1_BLOCK_ENTITY = register("triple_window_1_1", TripleWindow11BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_1);
    public static final BlockEntityType<TripleWindow12BlockEntity> TRIPLE_WINDOW_1_2_BLOCK_ENTITY = register("triple_window_1_2", TripleWindow12BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_2);
    public static final BlockEntityType<TripleWindow13BlockEntity> TRIPLE_WINDOW_1_3_BLOCK_ENTITY = register("triple_window_1_3", TripleWindow13BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_3);
    public static final BlockEntityType<TripleWindow14BlockEntity> TRIPLE_WINDOW_1_4_BLOCK_ENTITY = register("triple_window_1_4", TripleWindow14BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_4);
    public static final BlockEntityType<TripleWindow20BlockEntity> TRIPLE_WINDOW_2_0_BLOCK_ENTITY = register("triple_window_2_0", TripleWindow20BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_0);
    public static final BlockEntityType<TripleWindow21BlockEntity> TRIPLE_WINDOW_2_1_BLOCK_ENTITY = register("triple_window_2_1", TripleWindow21BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_1);
    public static final BlockEntityType<TripleWindow22BlockEntity> TRIPLE_WINDOW_2_2_BLOCK_ENTITY = register("triple_window_2_2", TripleWindow22BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_2);
    public static final BlockEntityType<TripleWindow23BlockEntity> TRIPLE_WINDOW_2_3_BLOCK_ENTITY = register("triple_window_2_3", TripleWindow23BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_3);
    public static final BlockEntityType<TripleWindow24BlockEntity> TRIPLE_WINDOW_2_4_BLOCK_ENTITY = register("triple_window_2_4", TripleWindow24BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_4);
    public static final BlockEntityType<TripleWindow25BlockEntity> TRIPLE_WINDOW_2_5_BLOCK_ENTITY = register("triple_window_2_5", TripleWindow25BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_5);
    public static final BlockEntityType<TripleWindow30BlockEntity> TRIPLE_WINDOW_3_0_BLOCK_ENTITY = register("triple_window_3_0", TripleWindow30BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_0);
    public static final BlockEntityType<TripleWindow31BlockEntity> TRIPLE_WINDOW_3_1_BLOCK_ENTITY = register("triple_window_3_1", TripleWindow31BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_1);
    public static final BlockEntityType<TripleWindow32BlockEntity> TRIPLE_WINDOW_3_2_BLOCK_ENTITY = register("triple_window_3_2", TripleWindow32BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_2);
    public static final BlockEntityType<TripleWindow33BlockEntity> TRIPLE_WINDOW_3_3_BLOCK_ENTITY = register("triple_window_3_3", TripleWindow33BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_3);
    public static final BlockEntityType<TripleWindow34BlockEntity> TRIPLE_WINDOW_3_4_BLOCK_ENTITY = register("triple_window_3_4", TripleWindow34BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_4);
    public static final BlockEntityType<TripleWindow35BlockEntity> TRIPLE_WINDOW_3_5_BLOCK_ENTITY = register("triple_window_3_5", TripleWindow35BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_5);
    public static final BlockEntityType<TripleWindow40BlockEntity> TRIPLE_WINDOW_4_0_BLOCK_ENTITY = register("triple_window_4_0", TripleWindow40BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_0);
    public static final BlockEntityType<TripleWindow41BlockEntity> TRIPLE_WINDOW_4_1_BLOCK_ENTITY = register("triple_window_4_1", TripleWindow41BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_1);
    public static final BlockEntityType<TripleWindow42BlockEntity> TRIPLE_WINDOW_4_2_BLOCK_ENTITY = register("triple_window_4_2", TripleWindow42BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_2);
    public static final BlockEntityType<TripleWindow43BlockEntity> TRIPLE_WINDOW_4_3_BLOCK_ENTITY = register("triple_window_4_3", TripleWindow43BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_3);
    public static final BlockEntityType<TripleWindow44BlockEntity> TRIPLE_WINDOW_4_4_BLOCK_ENTITY = register("triple_window_4_4", TripleWindow44BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_4);
    public static final BlockEntityType<TripleWindow45BlockEntity> TRIPLE_WINDOW_4_5_BLOCK_ENTITY = register("triple_window_4_5", TripleWindow45BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_5);
    public static final BlockEntityType<TripleWindow50BlockEntity> TRIPLE_WINDOW_5_0_BLOCK_ENTITY = register("triple_window_5_0", TripleWindow50BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_0);
    public static final BlockEntityType<TripleWindow51BlockEntity> TRIPLE_WINDOW_5_1_BLOCK_ENTITY = register("triple_window_5_1", TripleWindow51BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_1);
    public static final BlockEntityType<TripleWindow52BlockEntity> TRIPLE_WINDOW_5_2_BLOCK_ENTITY = register("triple_window_5_2", TripleWindow52BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_2);
    public static final BlockEntityType<TripleWindow53BlockEntity> TRIPLE_WINDOW_5_3_BLOCK_ENTITY = register("triple_window_5_3", TripleWindow53BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_3);
    public static final BlockEntityType<TripleWindow54BlockEntity> TRIPLE_WINDOW_5_4_BLOCK_ENTITY = register("triple_window_5_4", TripleWindow54BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_4);
    public static final BlockEntityType<TripleWindow55BlockEntity> TRIPLE_WINDOW_5_5_BLOCK_ENTITY = register("triple_window_5_5", TripleWindow55BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_5);
    public static final BlockEntityType<ArchedWindowLeftHalfColumnBaseBlockEntity> ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE_BLOCK_ENTITY = register("arched_window_left_half_column_base", ArchedWindowLeftHalfColumnBaseBlockEntity::new, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE);
    public static final BlockEntityType<ArchedWindowLeftHalfColumnCapBlockEntity> ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP_BLOCK_ENTITY = register("arched_window_left_half_column_cap", ArchedWindowLeftHalfColumnCapBlockEntity::new, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP);
    public static final BlockEntityType<ArchedWindowLeftHalfColumnMiddleBlockEntity> ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE_BLOCK_ENTITY = register("arched_window_left_half_column_middle", ArchedWindowLeftHalfColumnMiddleBlockEntity::new, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE);
    public static final BlockEntityType<ArchedWindowRightHalfColumnBaseBlockEntity> ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE_BLOCK_ENTITY = register("arched_window_right_half_column_base", ArchedWindowRightHalfColumnBaseBlockEntity::new, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE);
    public static final BlockEntityType<ArchedWindowRightHalfColumnCapBlockEntity> ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP_BLOCK_ENTITY = register("arched_window_right_half_column_cap", ArchedWindowRightHalfColumnCapBlockEntity::new, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP);
    public static final BlockEntityType<ArchedWindowRightHalfColumnMiddleBlockEntity> ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE_BLOCK_ENTITY = register("arched_window_right_half_column_middle", ArchedWindowRightHalfColumnMiddleBlockEntity::new, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE);
    public static final BlockEntityType<ArchedWindowMiddleBaseBlockEntity> ARCHED_WINDOW_MIDDLE_BASE_BLOCK_ENTITY = register("arched_window_middle_base", ArchedWindowMiddleBaseBlockEntity::new, ModBlocks.ARCHED_WINDOW_MIDDLE_BASE);
    public static final BlockEntityType<ArchedWindowMiddleColumnBlockEntity> ARCHED_WINDOW_MIDDLE_COLUMN_BLOCK_ENTITY = register("arched_window_middle_column", ArchedWindowMiddleColumnBlockEntity::new, ModBlocks.ARCHED_WINDOW_MIDDLE_COLUMN);
    public static final BlockEntityType<ArchedWindowMiddleCapBlockEntity> ARCHED_WINDOW_MIDDLE_CAP_BLOCK_ENTITY = register("arched_window_middle_cap", ArchedWindowMiddleCapBlockEntity::new, ModBlocks.ARCHED_WINDOW_MIDDLE_CAP);


    public static final BlockEntityType<ThatchBlockEntity> THATCH_BLOCK_ENTITY =
        register("thatch", ThatchBlockEntity::new, ModBlocks.THATCH);
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
