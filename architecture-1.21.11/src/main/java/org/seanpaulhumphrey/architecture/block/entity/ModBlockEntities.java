package org.seanpaulhumphrey.architecture.block.entity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuartzPillarEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.HalfQuartzPillarEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArch11Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowLeftBottomEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch22Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowMiddleLeftEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.ThinQuartzBaseEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch16Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch23Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TwinColumnCapitalEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowCapLeftEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch24Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopCapMiddleEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch11Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArchMiddleEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowMiddleBottomEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowRightBottomEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArch22Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArchLeftEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.ThinQuartzColumnEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArch23Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch25Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch13Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch26Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TwinColumnsEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuartzPillarEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.HalfQuartzPillarEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch12Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TwinColumnBaseEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArch13Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch15Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch21Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.QuadWindowTopArch14Entity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowMiddleMiddleEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.ThinQuartzCapitalEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopCapRightEntity;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArch12Entity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<QuartzPillarEntity> PILLAR_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "pillar_be"),
                    FabricBlockEntityTypeBuilder.create(QuartzPillarEntity::new, ModBlocks.QUARTZ_PILLAR).build(null)); 
    public static final BlockEntityType<HalfQuartzPillarEntity> HALF_PILLAR_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "half_pillar_be"),
                    FabricBlockEntityTypeBuilder.create(HalfQuartzPillarEntity::new, ModBlocks.HALF_QUARTZ_PILLAR).build(null));
    public static final BlockEntityType<TripleWindowTopArch11Entity>TRIPLE_WINDOW_TOP_ARCH_1_1_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_1_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArch11Entity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1).build(null));
    public static final BlockEntityType<TripleWindowLeftBottomEntity>TRIPLE_WINDOW_LEFT_BOTTOM_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_left_bottom_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowLeftBottomEntity::new, ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM).build(null));
    public static final BlockEntityType<QuadWindowTopArch22Entity>QUAD_WINDOW_TOP_ARCH_2_2_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_2_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch22Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2).build(null));
    public static final BlockEntityType<TripleWindowMiddleLeftEntity>TRIPLE_WINDOW_MIDDLE_LEFT_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_middle_left_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowMiddleLeftEntity::new, ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT).build(null));
    public static final BlockEntityType<ThinQuartzBaseEntity>THIN_QUARTZ_BASE_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "thin_quartz_base_be"),
                        FabricBlockEntityTypeBuilder.create(ThinQuartzBaseEntity::new, ModBlocks.THIN_QUARTZ_BASE).build(null));
    public static final BlockEntityType<QuadWindowTopArch16Entity>QUAD_WINDOW_TOP_ARCH_1_6_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_6_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch16Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6).build(null));
    public static final BlockEntityType<QuadWindowTopArch23Entity>QUAD_WINDOW_TOP_ARCH_2_3_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_3_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch23Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3).build(null));
    public static final BlockEntityType<TwinColumnCapitalEntity>TWIN_COLUMN_CAPITAL_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "twin_column_capital_be"),
                        FabricBlockEntityTypeBuilder.create(TwinColumnCapitalEntity::new, ModBlocks.TWIN_COLUMN_CAPITAL).build(null));
    public static final BlockEntityType<TripleWindowCapLeftEntity>TRIPLE_WINDOW_CAP_LEFT_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_cap_left_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowCapLeftEntity::new, ModBlocks.TRIPLE_WINDOW_CAP_LEFT).build(null));
    public static final BlockEntityType<QuadWindowTopArch24Entity>QUAD_WINDOW_TOP_ARCH_2_4_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_4_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch24Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4).build(null));
    public static final BlockEntityType<TripleWindowTopCapMiddleEntity>TRIPLE_WINDOW_TOP_CAP_MIDDLE_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_middle_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopCapMiddleEntity::new, ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE).build(null));
    public static final BlockEntityType<QuadWindowTopArch11Entity>QUAD_WINDOW_TOP_ARCH_1_1_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_1_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch11Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1).build(null));
    public static final BlockEntityType<TripleWindowTopArchMiddleEntity>TRIPLE_WINDOW_TOP_ARCH_MIDDLE_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_middle_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArchMiddleEntity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE).build(null));
    public static final BlockEntityType<TripleWindowMiddleBottomEntity>TRIPLE_WINDOW_MIDDLE_BOTTOM_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_middle_bottom_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowMiddleBottomEntity::new, ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM).build(null));
    public static final BlockEntityType<TripleWindowRightBottomEntity>TRIPLE_WINDOW_RIGHT_BOTTOM_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_right_bottom_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowRightBottomEntity::new, ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM).build(null));
    public static final BlockEntityType<TripleWindowTopArch22Entity>TRIPLE_WINDOW_TOP_ARCH_2_2_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_2_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArch22Entity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2).build(null));
    public static final BlockEntityType<TripleWindowTopArchLeftEntity>TRIPLE_WINDOW_TOP_ARCH_LEFT_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_left_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArchLeftEntity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT).build(null));
    public static final BlockEntityType<ThinQuartzColumnEntity>THIN_QUARTZ_COLUMN_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "thin_quartz_column_be"),
                        FabricBlockEntityTypeBuilder.create(ThinQuartzColumnEntity::new, ModBlocks.THIN_QUARTZ_COLUMN).build(null));
    public static final BlockEntityType<TripleWindowTopArch23Entity>TRIPLE_WINDOW_TOP_ARCH_2_3_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_3_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArch23Entity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3).build(null));
    public static final BlockEntityType<QuadWindowTopArch25Entity>QUAD_WINDOW_TOP_ARCH_2_5_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_5_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch25Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5).build(null));
    public static final BlockEntityType<QuadWindowTopArch13Entity>QUAD_WINDOW_TOP_ARCH_1_3_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_3_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch13Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3).build(null));
    public static final BlockEntityType<QuadWindowTopArch26Entity>QUAD_WINDOW_TOP_ARCH_2_6_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_6_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch26Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6).build(null));
    public static final BlockEntityType<TwinColumnsEntity>TWIN_COLUMNS_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "twin_columns_be"),
                        FabricBlockEntityTypeBuilder.create(TwinColumnsEntity::new, ModBlocks.TWIN_COLUMNS).build(null));
    public static final BlockEntityType<QuartzPillarEntity>QUARTZ_PILLAR_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quartz_pillar_be"),
                        FabricBlockEntityTypeBuilder.create(QuartzPillarEntity::new, ModBlocks.QUARTZ_PILLAR).build(null));
    public static final BlockEntityType<HalfQuartzPillarEntity>HALF_QUARTZ_PILLAR_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "half_quartz_pillar_be"),
                        FabricBlockEntityTypeBuilder.create(HalfQuartzPillarEntity::new, ModBlocks.HALF_QUARTZ_PILLAR).build(null));
    public static final BlockEntityType<QuadWindowTopArch12Entity>QUAD_WINDOW_TOP_ARCH_1_2_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_2_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch12Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2).build(null));
    public static final BlockEntityType<TwinColumnBaseEntity>TWIN_COLUMN_BASE_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "twin_column_base_be"),
                        FabricBlockEntityTypeBuilder.create(TwinColumnBaseEntity::new, ModBlocks.TWIN_COLUMN_BASE).build(null));
    public static final BlockEntityType<TripleWindowTopArch13Entity>TRIPLE_WINDOW_TOP_ARCH_1_3_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_3_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArch13Entity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3).build(null));
    public static final BlockEntityType<QuadWindowTopArch15Entity>QUAD_WINDOW_TOP_ARCH_1_5_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_5_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch15Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5).build(null));
    public static final BlockEntityType<QuadWindowTopArch21Entity>QUAD_WINDOW_TOP_ARCH_2_1_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_1_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch21Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1).build(null));
    public static final BlockEntityType<QuadWindowTopArch14Entity>QUAD_WINDOW_TOP_ARCH_1_4_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_4_be"),
                        FabricBlockEntityTypeBuilder.create(QuadWindowTopArch14Entity::new, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4).build(null));
    public static final BlockEntityType<TripleWindowMiddleMiddleEntity>TRIPLE_WINDOW_MIDDLE_MIDDLE_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_middle_middle_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowMiddleMiddleEntity::new, ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE).build(null));
    public static final BlockEntityType<ThinQuartzCapitalEntity>THIN_QUARTZ_CAPITAL_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "thin_quartz_capital_be"),
                        FabricBlockEntityTypeBuilder.create(ThinQuartzCapitalEntity::new, ModBlocks.THIN_QUARTZ_CAPITAL).build(null));
    public static final BlockEntityType<TripleWindowTopCapRightEntity>TRIPLE_WINDOW_TOP_CAP_RIGHT_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_right_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopCapRightEntity::new, ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT).build(null));
    public static final BlockEntityType<TripleWindowTopArch12Entity>TRIPLE_WINDOW_TOP_ARCH_1_2_BE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_2_be"),
                        FabricBlockEntityTypeBuilder.create(TripleWindowTopArch12Entity::new, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2).build(null));
    public static void registerBlockEntities() {
        Architecture.LOGGER.info("Registering Block Entities for " + Architecture.MOD_ID);
    }
}
