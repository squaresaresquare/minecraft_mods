package org.seanpaulhumphrey.architecture.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.screen.custom.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
        public static final ScreenHandlerType<TripleWindowTopArch11ScreenHandler> TRIPLE_WINDOW_TOP_ARCH_1_1_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_1_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArch11ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowLeftBottomScreenHandler> TRIPLE_WINDOW_LEFT_BOTTOM_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_left_bottom_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowLeftBottomScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch22ScreenHandler> QUAD_WINDOW_TOP_ARCH_2_2_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_2_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch22ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowMiddleLeftScreenHandler> TRIPLE_WINDOW_MIDDLE_LEFT_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_middle_left_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowMiddleLeftScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<ThinQuartzBaseScreenHandler> THIN_QUARTZ_BASE_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "thin_quartz_base_screen_handler"),
        new ExtendedScreenHandlerType<>(ThinQuartzBaseScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch16ScreenHandler> QUAD_WINDOW_TOP_ARCH_1_6_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_6_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch16ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch23ScreenHandler> QUAD_WINDOW_TOP_ARCH_2_3_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_3_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch23ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TwinColumnCapitalScreenHandler> TWIN_COLUMN_CAPITAL_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "twin_column_capital_screen_handler"),
        new ExtendedScreenHandlerType<>(TwinColumnCapitalScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowCapLeftScreenHandler> TRIPLE_WINDOW_CAP_LEFT_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_cap_left_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowCapLeftScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch24ScreenHandler> QUAD_WINDOW_TOP_ARCH_2_4_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_4_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch24ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopCapMiddleScreenHandler> TRIPLE_WINDOW_TOP_CAP_MIDDLE_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_middle_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopCapMiddleScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch11ScreenHandler> QUAD_WINDOW_TOP_ARCH_1_1_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_1_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch11ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopArchMiddleScreenHandler> TRIPLE_WINDOW_TOP_ARCH_MIDDLE_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_middle_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArchMiddleScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowMiddleBottomScreenHandler> TRIPLE_WINDOW_MIDDLE_BOTTOM_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_middle_bottom_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowMiddleBottomScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowRightBottomScreenHandler> TRIPLE_WINDOW_RIGHT_BOTTOM_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_right_bottom_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowRightBottomScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopArch22ScreenHandler> TRIPLE_WINDOW_TOP_ARCH_2_2_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_2_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArch22ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopArchLeftScreenHandler> TRIPLE_WINDOW_TOP_ARCH_LEFT_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_left_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArchLeftScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<ThinQuartzColumnScreenHandler> THIN_QUARTZ_COLUMN_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "thin_quartz_column_screen_handler"),
        new ExtendedScreenHandlerType<>(ThinQuartzColumnScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopArch23ScreenHandler> TRIPLE_WINDOW_TOP_ARCH_2_3_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_3_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArch23ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch25ScreenHandler> QUAD_WINDOW_TOP_ARCH_2_5_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_5_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch25ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch13ScreenHandler> QUAD_WINDOW_TOP_ARCH_1_3_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_3_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch13ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch26ScreenHandler> QUAD_WINDOW_TOP_ARCH_2_6_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_6_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch26ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TwinColumnsScreenHandler> TWIN_COLUMNS_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "twin_columns_screen_handler"),
        new ExtendedScreenHandlerType<>(TwinColumnsScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuartzPillarScreenHandler> QUARTZ_PILLAR_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quartz_pillar_screen_handler"),
        new ExtendedScreenHandlerType<>(QuartzPillarScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<HalfQuartzPillarScreenHandler> HALF_QUARTZ_PILLAR_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "half_quartz_pillar_screen_handler"),
        new ExtendedScreenHandlerType<>(HalfQuartzPillarScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch12ScreenHandler> QUAD_WINDOW_TOP_ARCH_1_2_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_2_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch12ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TwinColumnBaseScreenHandler> TWIN_COLUMN_BASE_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "twin_column_base_screen_handler"),
        new ExtendedScreenHandlerType<>(TwinColumnBaseScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopArch13ScreenHandler> TRIPLE_WINDOW_TOP_ARCH_1_3_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_3_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArch13ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch15ScreenHandler> QUAD_WINDOW_TOP_ARCH_1_5_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_5_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch15ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch21ScreenHandler> QUAD_WINDOW_TOP_ARCH_2_1_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_1_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch21ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<QuadWindowTopArch14ScreenHandler> QUAD_WINDOW_TOP_ARCH_1_4_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_4_screen_handler"),
        new ExtendedScreenHandlerType<>(QuadWindowTopArch14ScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowMiddleMiddleScreenHandler> TRIPLE_WINDOW_MIDDLE_MIDDLE_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_middle_middle_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowMiddleMiddleScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<ThinQuartzCapitalScreenHandler> THIN_QUARTZ_CAPITAL_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "thin_quartz_capital_screen_handler"),
        new ExtendedScreenHandlerType<>(ThinQuartzCapitalScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopCapRightScreenHandler> TRIPLE_WINDOW_TOP_CAP_RIGHT_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_right_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopCapRightScreenHandler::new, BlockPos.PACKET_CODEC));
                    
    public static final ScreenHandlerType<TripleWindowTopArch12ScreenHandler> TRIPLE_WINDOW_TOP_ARCH_1_2_SCREEN_HANDLER =
    Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_2_screen_handler"),
        new ExtendedScreenHandlerType<>(TripleWindowTopArch12ScreenHandler::new, BlockPos.PACKET_CODEC));
                    

    public static void registerScreenHandlers() {
        Architecture.LOGGER.info("Registering Screen Handlers for " + Architecture.MOD_ID);
    }
}
