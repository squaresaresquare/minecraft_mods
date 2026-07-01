package org.squaresaresquare.client.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.*;

public class ModBlockEntities {
    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }    public static final BlockEntityType<@NotNull MarbleBlockBlockEntity> MARBLE_BLOCK_BLOCK_ENTITY = register("marble_block", MarbleBlockBlockEntity::new, ModBlocks.MARBLE_BLOCK);

    public static void initialize() {
    }    public static final BlockEntityType<@NotNull MarblePillarBaseBlockEntity> MARBLE_PILLAR_BASE_BLOCK_ENTITY = register("marble_pillar_base", MarblePillarBaseBlockEntity::new, ModBlocks.MARBLE_PILLAR_BASE);
    public static final BlockEntityType<@NotNull OakLogBlockEntity> OAK_LOG_BLOCK_ENTITY = register("oak_log", OakLogBlockEntity::new, ModBlocks.OAK_LOG_BLOCK);
    public static final BlockEntityType<@NotNull MarblePillarBlockEntity> MARBLE_PILLAR_BLOCK_ENTITY = register("marble_pillar", MarblePillarBlockEntity::new, ModBlocks.MARBLE_PILLAR);
    public static final BlockEntityType<@NotNull MarblePlinthBlockEntity> MARBLE_PLINTH_BLOCK_ENTITY = register("quartz_pillar", MarblePlinthBlockEntity::new, ModBlocks.MARBLE_PLINTH_BLOCK);
    public static final BlockEntityType<@NotNull PillarCapBlockEntity> PILLAR_CAP_BLOCK_ENTITY = register("pillar_cap", PillarCapBlockEntity::new, ModBlocks.PILLAR_CAP);
    public static final BlockEntityType<@NotNull TripleWindow01BlockEntity> TRIPLE_WINDOW_0_1_BLOCK_ENTITY = register("triple_window_0_1", TripleWindow01BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_1);
    public static final BlockEntityType<@NotNull TripleWindow02BlockEntity> TRIPLE_WINDOW_0_2_BLOCK_ENTITY = register("triple_window_0_2", TripleWindow02BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_2);
    public static final BlockEntityType<@NotNull TripleWindow03BlockEntity> TRIPLE_WINDOW_0_3_BLOCK_ENTITY = register("triple_window_0_3", TripleWindow03BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_3);
    public static final BlockEntityType<@NotNull TripleWindow04BlockEntity> TRIPLE_WINDOW_0_4_BLOCK_ENTITY = register("triple_window_0_4", TripleWindow04BlockEntity::new, ModBlocks.TRIPLE_WINDOW_0_4);
    public static final BlockEntityType<@NotNull TripleWindow11BlockEntity> TRIPLE_WINDOW_1_1_BLOCK_ENTITY = register("triple_window_1_1", TripleWindow11BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_1);
    public static final BlockEntityType<@NotNull TripleWindow12BlockEntity> TRIPLE_WINDOW_1_2_BLOCK_ENTITY = register("triple_window_1_2", TripleWindow12BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_2);
    public static final BlockEntityType<@NotNull TripleWindow13BlockEntity> TRIPLE_WINDOW_1_3_BLOCK_ENTITY = register("triple_window_1_3", TripleWindow13BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_3);
    public static final BlockEntityType<@NotNull TripleWindow14BlockEntity> TRIPLE_WINDOW_1_4_BLOCK_ENTITY = register("triple_window_1_4", TripleWindow14BlockEntity::new, ModBlocks.TRIPLE_WINDOW_1_4);
    public static final BlockEntityType<@NotNull TripleWindow20BlockEntity> TRIPLE_WINDOW_2_0_BLOCK_ENTITY = register("triple_window_2_0", TripleWindow20BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_0);
    public static final BlockEntityType<@NotNull TripleWindow21BlockEntity> TRIPLE_WINDOW_2_1_BLOCK_ENTITY = register("triple_window_2_1", TripleWindow21BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_1);
    public static final BlockEntityType<@NotNull TripleWindow22BlockEntity> TRIPLE_WINDOW_2_2_BLOCK_ENTITY = register("triple_window_2_2", TripleWindow22BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_2);
    public static final BlockEntityType<@NotNull TripleWindow23BlockEntity> TRIPLE_WINDOW_2_3_BLOCK_ENTITY = register("triple_window_2_3", TripleWindow23BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_3);
    public static final BlockEntityType<@NotNull TripleWindow24BlockEntity> TRIPLE_WINDOW_2_4_BLOCK_ENTITY = register("triple_window_2_4", TripleWindow24BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_4);
    public static final BlockEntityType<@NotNull TripleWindow25BlockEntity> TRIPLE_WINDOW_2_5_BLOCK_ENTITY = register("triple_window_2_5", TripleWindow25BlockEntity::new, ModBlocks.TRIPLE_WINDOW_2_5);
    public static final BlockEntityType<@NotNull TripleWindow30BlockEntity> TRIPLE_WINDOW_3_0_BLOCK_ENTITY = register("triple_window_3_0", TripleWindow30BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_0);
    public static final BlockEntityType<@NotNull TripleWindow31BlockEntity> TRIPLE_WINDOW_3_1_BLOCK_ENTITY = register("triple_window_3_1", TripleWindow31BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_1);
    public static final BlockEntityType<@NotNull TripleWindow32BlockEntity> TRIPLE_WINDOW_3_2_BLOCK_ENTITY = register("triple_window_3_2", TripleWindow32BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_2);
    public static final BlockEntityType<@NotNull TripleWindow33BlockEntity> TRIPLE_WINDOW_3_3_BLOCK_ENTITY = register("triple_window_3_3", TripleWindow33BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_3);
    public static final BlockEntityType<@NotNull TripleWindow34BlockEntity> TRIPLE_WINDOW_3_4_BLOCK_ENTITY = register("triple_window_3_4", TripleWindow34BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_4);
    public static final BlockEntityType<@NotNull TripleWindow35BlockEntity> TRIPLE_WINDOW_3_5_BLOCK_ENTITY = register("triple_window_3_5", TripleWindow35BlockEntity::new, ModBlocks.TRIPLE_WINDOW_3_5);
    public static final BlockEntityType<@NotNull TripleWindow40BlockEntity> TRIPLE_WINDOW_4_0_BLOCK_ENTITY = register("triple_window_4_0", TripleWindow40BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_0);
    public static final BlockEntityType<@NotNull TripleWindow41BlockEntity> TRIPLE_WINDOW_4_1_BLOCK_ENTITY = register("triple_window_4_1", TripleWindow41BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_1);
    public static final BlockEntityType<@NotNull TripleWindow42BlockEntity> TRIPLE_WINDOW_4_2_BLOCK_ENTITY = register("triple_window_4_2", TripleWindow42BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_2);
    public static final BlockEntityType<@NotNull TripleWindow43BlockEntity> TRIPLE_WINDOW_4_3_BLOCK_ENTITY = register("triple_window_4_3", TripleWindow43BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_3);
    public static final BlockEntityType<@NotNull TripleWindow44BlockEntity> TRIPLE_WINDOW_4_4_BLOCK_ENTITY = register("triple_window_4_4", TripleWindow44BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_4);
    public static final BlockEntityType<@NotNull TripleWindow45BlockEntity> TRIPLE_WINDOW_4_5_BLOCK_ENTITY = register("triple_window_4_5", TripleWindow45BlockEntity::new, ModBlocks.TRIPLE_WINDOW_4_5);
    public static final BlockEntityType<@NotNull TripleWindow50BlockEntity> TRIPLE_WINDOW_5_0_BLOCK_ENTITY = register("triple_window_5_0", TripleWindow50BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_0);
    public static final BlockEntityType<@NotNull TripleWindow51BlockEntity> TRIPLE_WINDOW_5_1_BLOCK_ENTITY = register("triple_window_5_1", TripleWindow51BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_1);
    public static final BlockEntityType<@NotNull TripleWindow52BlockEntity> TRIPLE_WINDOW_5_2_BLOCK_ENTITY = register("triple_window_5_2", TripleWindow52BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_2);
    public static final BlockEntityType<@NotNull TripleWindow53BlockEntity> TRIPLE_WINDOW_5_3_BLOCK_ENTITY = register("triple_window_5_3", TripleWindow53BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_3);
    public static final BlockEntityType<@NotNull TripleWindow54BlockEntity> TRIPLE_WINDOW_5_4_BLOCK_ENTITY = register("triple_window_5_4", TripleWindow54BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_4);
    public static final BlockEntityType<@NotNull TripleWindow55BlockEntity> TRIPLE_WINDOW_5_5_BLOCK_ENTITY = register("triple_window_5_5", TripleWindow55BlockEntity::new, ModBlocks.TRIPLE_WINDOW_5_5);
    public static final BlockEntityType<@NotNull ArchedWindowLeftHalfColumnBaseBlockEntity> ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE_BLOCK_ENTITY = register("arched_window_left_half_column_base", ArchedWindowLeftHalfColumnBaseBlockEntity::new, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE);
    public static final BlockEntityType<@NotNull ArchedWindowLeftHalfColumnCapBlockEntity> ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP_BLOCK_ENTITY = register("arched_window_left_half_column_cap", ArchedWindowLeftHalfColumnCapBlockEntity::new, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP);
    public static final BlockEntityType<@NotNull ArchedWindowLeftHalfColumnMiddleBlockEntity> ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE_BLOCK_ENTITY = register("arched_window_left_half_column_middle", ArchedWindowLeftHalfColumnMiddleBlockEntity::new, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE);
    public static final BlockEntityType<@NotNull ArchedWindowRightHalfColumnBaseBlockEntity> ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE_BLOCK_ENTITY = register("arched_window_right_half_column_base", ArchedWindowRightHalfColumnBaseBlockEntity::new, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE);
    public static final BlockEntityType<@NotNull ArchedWindowRightHalfColumnCapBlockEntity> ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP_BLOCK_ENTITY = register("arched_window_right_half_column_cap", ArchedWindowRightHalfColumnCapBlockEntity::new, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP);
    public static final BlockEntityType<@NotNull ArchedWindowRightHalfColumnMiddleBlockEntity> ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE_BLOCK_ENTITY = register("arched_window_right_half_column_middle", ArchedWindowRightHalfColumnMiddleBlockEntity::new, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE);
    public static final BlockEntityType<@NotNull ArchedWindowMiddleBaseBlockEntity> ARCHED_WINDOW_MIDDLE_BASE_BLOCK_ENTITY = register("arched_window_middle_base", ArchedWindowMiddleBaseBlockEntity::new, ModBlocks.ARCHED_WINDOW_MIDDLE_BASE);
    public static final BlockEntityType<@NotNull ArchedWindowMiddleColumnBlockEntity> ARCHED_WINDOW_MIDDLE_COLUMN_BLOCK_ENTITY = register("arched_window_middle_column", ArchedWindowMiddleColumnBlockEntity::new, ModBlocks.ARCHED_WINDOW_MIDDLE_COLUMN);
    public static final BlockEntityType<@NotNull ArchedWindowMiddleCapBlockEntity> ARCHED_WINDOW_MIDDLE_CAP_BLOCK_ENTITY = register("arched_window_middle_cap", ArchedWindowMiddleCapBlockEntity::new, ModBlocks.ARCHED_WINDOW_MIDDLE_CAP);


    public static final BlockEntityType<@NotNull ThatchBlockEntity> THATCH_BLOCK_ENTITY =
            register("thatch", ThatchBlockEntity::new, ModBlocks.THATCH);

    public static final BlockEntityType<@NotNull ThatchPeakBlockEntity> THATCH_PEAK_BLOCK_ENTITY =
            register("thatch_peak", ThatchPeakBlockEntity::new, ModBlocks.THATCH_PEAK);

    public static final BlockEntityType<@NotNull HayBlockBlockEntity> HAY_BLOCK_BLOCK_ENTITY =
            register("hay_block", HayBlockBlockEntity::new, ModBlocks.HAY_BLOCK);

    public static final BlockEntityType<QuartzBricksBlockEntity> QUARTZ_BRICKS_BLOCK_ENTITY =
            register("quartz_bricks", QuartzBricksBlockEntity::new, ModBlocks.QUARTZ_BRICKS);

    public static final BlockEntityType<SixBlockArch11BlockEntity> SIX_BLOCK_ARCH_1_1_BLOCK_ENTITY =
            register("six_block_arch_1_1", SixBlockArch11BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_1_1);

    public static final BlockEntityType<SixBlockArch18BlockEntity> SIX_BLOCK_ARCH_1_8_BLOCK_ENTITY =
            register("six_block_arch_1_8", SixBlockArch18BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_1_8);

    public static final BlockEntityType<SixBlockArch21BlockEntity> SIX_BLOCK_ARCH_2_1_BLOCK_ENTITY =
            register("six_block_arch_2_1", SixBlockArch21BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_2_1);

    public static final BlockEntityType<SixBlockArch28BlockEntity> SIX_BLOCK_ARCH_2_8_BLOCK_ENTITY =
            register("six_block_arch_2_8", SixBlockArch28BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_2_8);

    public static final BlockEntityType<SixBlockInnerArchBlockEntity> SIX_BLOCK_INNER_ARCH_BLOCK_ENTITY =
            register("six_block_inner_arch", SixBlockInnerArchBlockEntity::new, ModBlocks.SIX_BLOCK_INNER_ARCH);

    public static final BlockEntityType<SixBlockArch22BlockEntity> SIX_BLOCK_ARCH_2_2_BLOCK_ENTITY =
            register("six_block_arch_2_2", SixBlockArch22BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_2_2);

    public static final BlockEntityType<SixBlockArch27BlockEntity> SIX_BLOCK_ARCH_2_7_BLOCK_ENTITY =
            register("six_block_arch_2_7", SixBlockArch27BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_2_7);

    public static final BlockEntityType<SixBlockArch31BlockEntity> SIX_BLOCK_ARCH_3_1_BLOCK_ENTITY =
        register("six_block_arch_3_1", SixBlockArch31BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_3_1);

    public static final BlockEntityType<SixBlockArch32BlockEntity> SIX_BLOCK_ARCH_3_2_BLOCK_ENTITY =
        register("six_block_arch_3_2", SixBlockArch32BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_3_2);

    public static final BlockEntityType<SixBlockArch33BlockEntity> SIX_BLOCK_ARCH_3_3_BLOCK_ENTITY =
        register("six_block_arch_3_3", SixBlockArch33BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_3_3);

    public static final BlockEntityType<SixBlockArch36BlockEntity> SIX_BLOCK_ARCH_3_6_BLOCK_ENTITY =
        register("six_block_arch_3_6", SixBlockArch36BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_3_6);

    public static final BlockEntityType<SixBlockArch37BlockEntity> SIX_BLOCK_ARCH_3_7_BLOCK_ENTITY =
        register("six_block_arch_3_7", SixBlockArch37BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_3_7);

    public static final BlockEntityType<SixBlockArch38BlockEntity> SIX_BLOCK_ARCH_3_8_BLOCK_ENTITY =
        register("six_block_arch_3_8", SixBlockArch38BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_3_8);

    public static final BlockEntityType<SixBlockArch42BlockEntity> SIX_BLOCK_ARCH_4_2_BLOCK_ENTITY =
        register("six_block_arch_4_2", SixBlockArch42BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_4_2);

    public static final BlockEntityType<SixBlockArch43BlockEntity> SIX_BLOCK_ARCH_4_3_BLOCK_ENTITY =
        register("six_block_arch_4_3", SixBlockArch43BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_4_3);

    public static final BlockEntityType<SixBlockArch44BlockEntity> SIX_BLOCK_ARCH_4_4_BLOCK_ENTITY =
        register("six_block_arch_4_4", SixBlockArch44BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_4_4);

    public static final BlockEntityType<SixBlockArch45BlockEntity> SIX_BLOCK_ARCH_4_5_BLOCK_ENTITY =
        register("six_block_arch_4_5", SixBlockArch45BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_4_5);

    public static final BlockEntityType<SixBlockArch46BlockEntity> SIX_BLOCK_ARCH_4_6_BLOCK_ENTITY =
        register("six_block_arch_4_6", SixBlockArch46BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_4_6);

    public static final BlockEntityType<SixBlockArch47BlockEntity> SIX_BLOCK_ARCH_4_7_BLOCK_ENTITY =
        register("six_block_arch_4_7", SixBlockArch47BlockEntity::new, ModBlocks.SIX_BLOCK_ARCH_4_7);

    public static final BlockEntityType<FiveBlockArch11BlockEntity> FIVE_BLOCK_ARCH_1_1_BLOCK_ENTITY =
        register("five_block_arch_1_1", FiveBlockArch11BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_1_1);

    public static final BlockEntityType<FiveBlockArch14BlockEntity> FIVE_BLOCK_ARCH_1_4_BLOCK_ENTITY =
        register("five_block_arch_1_4", FiveBlockArch14BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_1_4);

    public static final BlockEntityType<FiveBlockArch15BlockEntity> FIVE_BLOCK_ARCH_1_5_BLOCK_ENTITY =
        register("five_block_arch_1_5", FiveBlockArch15BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_1_5);

    public static final BlockEntityType<FiveBlockArch12BlockEntity> FIVE_BLOCK_ARCH_1_2_BLOCK_ENTITY =
        register("five_block_arch_1_2", FiveBlockArch12BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_1_2);

    public static final BlockEntityType<FiveBlockArch21BlockEntity> FIVE_BLOCK_ARCH_2_1_BLOCK_ENTITY =
        register("five_block_arch_2_1", FiveBlockArch21BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_2_1);

    public static final BlockEntityType<FiveBlockArch22BlockEntity> FIVE_BLOCK_ARCH_2_2_BLOCK_ENTITY =
        register("five_block_arch_2_2", FiveBlockArch22BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_2_2);

    public static final BlockEntityType<FiveBlockArch23BlockEntity> FIVE_BLOCK_ARCH_2_3_BLOCK_ENTITY =
        register("five_block_arch_2_3", FiveBlockArch23BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_2_3);

    public static final BlockEntityType<FiveBlockArch24BlockEntity> FIVE_BLOCK_ARCH_2_4_BLOCK_ENTITY =
        register("five_block_arch_2_4", FiveBlockArch24BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_2_4);

    public static final BlockEntityType<FiveBlockArch25BlockEntity> FIVE_BLOCK_ARCH_2_5_BLOCK_ENTITY =
        register("five_block_arch_2_5", FiveBlockArch25BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_2_5);

    public static final BlockEntityType<FiveBlockArch32BlockEntity> FIVE_BLOCK_ARCH_3_2_BLOCK_ENTITY =
        register("five_block_arch_3_2", FiveBlockArch32BlockEntity::new, ModBlocks.FIVE_BLOCK_ARCH_3_2);

    public static final BlockEntityType<DoubleArchedWindow64BlockEntity> DOUBLE_ARCHED_WINDOW_6_4_BLOCK_ENTITY =
        register("double_arched_window_6_4", DoubleArchedWindow64BlockEntity::new, ModBlocks.DOUBLE_ARCHED_WINDOW_6_4);
                                                                                                                                                                                            //::new block here





}
