package org.seanpaulhumphrey.architecture.world;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> QUARTZ_PILLAR_KEY = registerKey("quartz_pillar");
    public static final RegistryKey<PlacedFeature> HALF_QUARTZ_PILLAR_KEY = registerKey("half_quartz_pillar");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_1_1_KEY = registerKey("quad_window_top_arch_1_1");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_1_2_KEY = registerKey("quad_window_top_arch_1_2");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_1_3_KEY = registerKey("quad_window_top_arch_1_3");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_1_4_KEY = registerKey("quad_window_top_arch_1_4");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_1_5_KEY = registerKey("quad_window_top_arch_1_5");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_1_6_KEY = registerKey("quad_window_top_arch_1_6");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_2_1_KEY = registerKey("quad_window_top_arch_2_1");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_2_2_KEY = registerKey("quad_window_top_arch_2_2");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_2_3_KEY = registerKey("quad_window_top_arch_2_3");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_2_4_KEY = registerKey("quad_window_top_arch_2_4");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_2_5_KEY = registerKey("quad_window_top_arch_2_5");
    public static final RegistryKey<PlacedFeature> QUAD_WINDOW_TOP_ARCH_2_6_KEY = registerKey("quad_window_top_arch_2_6");
    public static final RegistryKey<PlacedFeature> THIN_QUARTZ_BASE_KEY = registerKey("thin_quartz_base");
    public static final RegistryKey<PlacedFeature> THIN_QUARTZ_CAPITAL_KEY = registerKey("thin_quartz_capital");
    public static final RegistryKey<PlacedFeature> THIN_QUARTZ_COLUMN_KEY = registerKey("thin_quartz_column");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_CAP_LEFT_KEY = registerKey("triple_window_cap_left");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_LEFT_BOTTOM_KEY = registerKey("triple_window_left_bottom");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_MIDDLE_BOTTOM_KEY = registerKey("triple_window_middle_bottom");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_MIDDLE_LEFT_KEY = registerKey("triple_window_middle_left");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_MIDDLE_MIDDLE_KEY = registerKey("triple_window_middle_middle");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_RIGHT_BOTTOM_KEY = registerKey("triple_window_right_bottom");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_1_1_KEY = registerKey("triple_window_top_arch_1_1");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_1_2_KEY = registerKey("triple_window_top_arch_1_2");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_1_3_KEY = registerKey("triple_window_top_arch_1_3");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_2_2_KEY = registerKey("triple_window_top_arch_2_2");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_2_3_KEY = registerKey("triple_window_top_arch_2_3");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_LEFT_KEY = registerKey("triple_window_top_arch_left");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_ARCH_MIDDLE_KEY = registerKey("triple_window_top_arch_middle");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_CAP_MIDDLE_KEY = registerKey("triple_window_top_cap_middle");
    public static final RegistryKey<PlacedFeature> TRIPLE_WINDOW_TOP_CAP_RIGHT_KEY = registerKey("triple_window_top_cap_right");
    public static final RegistryKey<PlacedFeature> TWIN_COLUMN_BASE_KEY = registerKey("twin_column_base");
    public static final RegistryKey<PlacedFeature> TWIN_COLUMN_CAPITAL_KEY = registerKey("twin_column_capital");
    public static final RegistryKey<PlacedFeature> TWIN_COLUMNS_KEY = registerKey("twin_columns");
    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Architecture.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

