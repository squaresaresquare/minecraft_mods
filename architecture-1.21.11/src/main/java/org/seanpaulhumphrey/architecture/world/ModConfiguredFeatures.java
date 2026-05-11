package org.seanpaulhumphrey.architecture.world;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_1_1 = registerKey("triple_window_top_arch_1_1");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_LEFT_BOTTOM = registerKey("triple_window_left_bottom");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_2_2 = registerKey("quad_window_top_arch_2_2");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_MIDDLE_LEFT = registerKey("triple_window_middle_left");

    public static final RegistryKey<ConfiguredFeature<?, ?>> THIN_QUARTZ_BASE = registerKey("thin_quartz_base");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_1_6 = registerKey("quad_window_top_arch_1_6");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_2_3 = registerKey("quad_window_top_arch_2_3");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TWIN_COLUMN_CAPITAL = registerKey("twin_column_capital");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_CAP_LEFT = registerKey("triple_window_cap_left");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_2_4 = registerKey("quad_window_top_arch_2_4");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_CAP_MIDDLE = registerKey("triple_window_top_cap_middle");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_1_1 = registerKey("quad_window_top_arch_1_1");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_MIDDLE = registerKey("triple_window_top_arch_middle");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_MIDDLE_BOTTOM = registerKey("triple_window_middle_bottom");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_RIGHT_BOTTOM = registerKey("triple_window_right_bottom");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_2_2 = registerKey("triple_window_top_arch_2_2");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_LEFT = registerKey("triple_window_top_arch_left");

    public static final RegistryKey<ConfiguredFeature<?, ?>> THIN_QUARTZ_COLUMN = registerKey("thin_quartz_column");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_2_3 = registerKey("triple_window_top_arch_2_3");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_2_5 = registerKey("quad_window_top_arch_2_5");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_1_3 = registerKey("quad_window_top_arch_1_3");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_2_6 = registerKey("quad_window_top_arch_2_6");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TWIN_COLUMNS = registerKey("twin_columns");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_PILLAR = registerKey("quartz_pillar");

    public static final RegistryKey<ConfiguredFeature<?, ?>> HALF_QUARTZ_PILLAR = registerKey("half_quartz_pillar");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_1_2 = registerKey("quad_window_top_arch_1_2");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TWIN_COLUMN_BASE = registerKey("twin_column_base");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_1_3 = registerKey("triple_window_top_arch_1_3");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_1_5 = registerKey("quad_window_top_arch_1_5");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_2_1 = registerKey("quad_window_top_arch_2_1");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUAD_WINDOW_TOP_ARCH_1_4 = registerKey("quad_window_top_arch_1_4");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_MIDDLE_MIDDLE = registerKey("triple_window_middle_middle");

    public static final RegistryKey<ConfiguredFeature<?, ?>> THIN_QUARTZ_CAPITAL = registerKey("thin_quartz_capital");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_CAP_RIGHT = registerKey("triple_window_top_cap_right");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIPLE_WINDOW_TOP_ARCH_1_2 = registerKey("triple_window_top_arch_1_2");

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Architecture.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

