package org.seanpaulhumphrey.architecture.recipe;

import org.seanpaulhumphrey.architecture.*;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.seanpaulhumphrey.architecture.block.custom.*;

public class ModRecipes {
    public static final RecipeSerializer<HalfQuartzPillarRecipe> HALF_QUARTZ_PILLAR_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "half_quartz_pillar"),
                    new HalfQuartzPillarRecipe.Serializer());
    public static final RecipeType<HalfQuartzPillarRecipe> HALF_QUARTZ_PILLAR_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "half_quartz_pillar"), new RecipeType<HalfQuartzPillarRecipe>() {
                @Override
                public String toString() {
                    return "half_quartz_pillar";
                }
            });
    public static final RecipeSerializer<QuartzPillarRecipe> QUARTZ_PILLAR_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quartz_pillar"),
                    new QuartzPillarRecipe.Serializer());
    public static final RecipeType<QuartzPillarRecipe> QUARTZ_PILLAR_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quartz_pillar"), new RecipeType<QuartzPillarRecipe>() {
                @Override
                public String toString() {
                    return "quartz_pillar";
                }
            });
public static final RecipeSerializer<QuadWindowTopArch11Recipe> QUAD_WINDOW_TOP_ARCH_1_1_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_1"),
            new QuadWindowTopArch11Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch11Recipe> QUAD_WINDOW_TOP_ARCH_1_1_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_1"), new RecipeType<QuadWindowTopArch11Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_1_1";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch12Recipe> QUAD_WINDOW_TOP_ARCH_1_2_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_2"),
            new QuadWindowTopArch12Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch12Recipe> QUAD_WINDOW_TOP_ARCH_1_2_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_2"), new RecipeType<QuadWindowTopArch12Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_1_2";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch13Recipe> QUAD_WINDOW_TOP_ARCH_1_3_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_3"),
            new QuadWindowTopArch13Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch13Recipe> QUAD_WINDOW_TOP_ARCH_1_3_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_3"), new RecipeType<QuadWindowTopArch13Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_1_3";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch14Recipe> QUAD_WINDOW_TOP_ARCH_1_4_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_4"),
            new QuadWindowTopArch14Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch14Recipe> QUAD_WINDOW_TOP_ARCH_1_4_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_4"), new RecipeType<QuadWindowTopArch14Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_1_4";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch15Recipe> QUAD_WINDOW_TOP_ARCH_1_5_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_5"),
            new QuadWindowTopArch15Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch15Recipe> QUAD_WINDOW_TOP_ARCH_1_5_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_5"), new RecipeType<QuadWindowTopArch15Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_1_5";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch16Recipe> QUAD_WINDOW_TOP_ARCH_1_6_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_6"),
            new QuadWindowTopArch16Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch16Recipe> QUAD_WINDOW_TOP_ARCH_1_6_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_1_6"), new RecipeType<QuadWindowTopArch16Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_1_6";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch21Recipe> QUAD_WINDOW_TOP_ARCH_2_1_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_1"),
            new QuadWindowTopArch21Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch21Recipe> QUAD_WINDOW_TOP_ARCH_2_1_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_1"), new RecipeType<QuadWindowTopArch21Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_2_1";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch22Recipe> QUAD_WINDOW_TOP_ARCH_2_2_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_2"),
            new QuadWindowTopArch22Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch22Recipe> QUAD_WINDOW_TOP_ARCH_2_2_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_2"), new RecipeType<QuadWindowTopArch22Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_2_2";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch23Recipe> QUAD_WINDOW_TOP_ARCH_2_3_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_3"),
            new QuadWindowTopArch23Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch23Recipe> QUAD_WINDOW_TOP_ARCH_2_3_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_3"), new RecipeType<QuadWindowTopArch23Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_2_3";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch24Recipe> QUAD_WINDOW_TOP_ARCH_2_4_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_4"),
            new QuadWindowTopArch24Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch24Recipe> QUAD_WINDOW_TOP_ARCH_2_4_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_4"), new RecipeType<QuadWindowTopArch24Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_2_4";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch25Recipe> QUAD_WINDOW_TOP_ARCH_2_5_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_5"),
            new QuadWindowTopArch25Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch25Recipe> QUAD_WINDOW_TOP_ARCH_2_5_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_5"), new RecipeType<QuadWindowTopArch25Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_2_5";
                }
            });
    

public static final RecipeSerializer<QuadWindowTopArch26Recipe> QUAD_WINDOW_TOP_ARCH_2_6_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_6"),
            new QuadWindowTopArch26Recipe.Serializer());
    public static final RecipeType<QuadWindowTopArch26Recipe> QUAD_WINDOW_TOP_ARCH_2_6_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "quad_window_top_arch_2_6"), new RecipeType<QuadWindowTopArch26Recipe>() {
                @Override
                public String toString() {
                    return "quad_window_top_arch_2_6";
                }
            });
    

public static final RecipeSerializer<ThinQuartzBaseRecipe> THIN_QUARTZ_BASE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "thin_quartz_base"),
            new ThinQuartzBaseRecipe.Serializer());
    public static final RecipeType<ThinQuartzBaseRecipe> THIN_QUARTZ_BASE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "thin_quartz_base"), new RecipeType<ThinQuartzBaseRecipe>() {
                @Override
                public String toString() {
                    return "thin_quartz_base";
                }
            });
    

public static final RecipeSerializer<ThinQuartzCapitalRecipe> THIN_QUARTZ_CAPITAL_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "thin_quartz_capital"),
            new ThinQuartzCapitalRecipe.Serializer());
    public static final RecipeType<ThinQuartzCapitalRecipe> THIN_QUARTZ_CAPITAL_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "thin_quartz_capital"), new RecipeType<ThinQuartzCapitalRecipe>() {
                @Override
                public String toString() {
                    return "thin_quartz_capital";
                }
            });
    

public static final RecipeSerializer<ThinQuartzColumnRecipe> THIN_QUARTZ_COLUMN_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "thin_quartz_column"),
            new ThinQuartzColumnRecipe.Serializer());
    public static final RecipeType<ThinQuartzColumnRecipe> THIN_QUARTZ_COLUMN_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "thin_quartz_column"), new RecipeType<ThinQuartzColumnRecipe>() {
                @Override
                public String toString() {
                    return "thin_quartz_column";
                }
            });
    

public static final RecipeSerializer<TripleWindowCapLeftRecipe> TRIPLE_WINDOW_CAP_LEFT_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_cap_left"),
            new TripleWindowCapLeftRecipe.Serializer());
    public static final RecipeType<TripleWindowCapLeftRecipe> TRIPLE_WINDOW_CAP_LEFT_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_cap_left"), new RecipeType<TripleWindowCapLeftRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_cap_left";
                }
            });
    

public static final RecipeSerializer<TripleWindowLeftBottomRecipe> TRIPLE_WINDOW_LEFT_BOTTOM_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_left_bottom"),
            new TripleWindowLeftBottomRecipe.Serializer());
    public static final RecipeType<TripleWindowLeftBottomRecipe> TRIPLE_WINDOW_LEFT_BOTTOM_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_left_bottom"), new RecipeType<TripleWindowLeftBottomRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_left_bottom";
                }
            });
    

public static final RecipeSerializer<TripleWindowMiddleBottomRecipe> TRIPLE_WINDOW_MIDDLE_BOTTOM_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_middle_bottom"),
            new TripleWindowMiddleBottomRecipe.Serializer());
    public static final RecipeType<TripleWindowMiddleBottomRecipe> TRIPLE_WINDOW_MIDDLE_BOTTOM_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_middle_bottom"), new RecipeType<TripleWindowMiddleBottomRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_middle_bottom";
                }
            });
    

public static final RecipeSerializer<TripleWindowMiddleLeftRecipe> TRIPLE_WINDOW_MIDDLE_LEFT_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_middle_left"),
            new TripleWindowMiddleLeftRecipe.Serializer());
    public static final RecipeType<TripleWindowMiddleLeftRecipe> TRIPLE_WINDOW_MIDDLE_LEFT_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_middle_left"), new RecipeType<TripleWindowMiddleLeftRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_middle_left";
                }
            });
    

public static final RecipeSerializer<TripleWindowMiddleMiddleRecipe> TRIPLE_WINDOW_MIDDLE_MIDDLE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_middle_middle"),
            new TripleWindowMiddleMiddleRecipe.Serializer());
    public static final RecipeType<TripleWindowMiddleMiddleRecipe> TRIPLE_WINDOW_MIDDLE_MIDDLE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_middle_middle"), new RecipeType<TripleWindowMiddleMiddleRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_middle_middle";
                }
            });
    

public static final RecipeSerializer<TripleWindowRightBottomRecipe> TRIPLE_WINDOW_RIGHT_BOTTOM_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_right_bottom"),
            new TripleWindowRightBottomRecipe.Serializer());
    public static final RecipeType<TripleWindowRightBottomRecipe> TRIPLE_WINDOW_RIGHT_BOTTOM_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_right_bottom"), new RecipeType<TripleWindowRightBottomRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_right_bottom";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArch11Recipe> TRIPLE_WINDOW_TOP_ARCH_1_1_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_1"),
            new TripleWindowTopArch11Recipe.Serializer());
    public static final RecipeType<TripleWindowTopArch11Recipe> TRIPLE_WINDOW_TOP_ARCH_1_1_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_1"), new RecipeType<TripleWindowTopArch11Recipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_1_1";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArch12Recipe> TRIPLE_WINDOW_TOP_ARCH_1_2_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_2"),
            new TripleWindowTopArch12Recipe.Serializer());
    public static final RecipeType<TripleWindowTopArch12Recipe> TRIPLE_WINDOW_TOP_ARCH_1_2_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_2"), new RecipeType<TripleWindowTopArch12Recipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_1_2";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArch13Recipe> TRIPLE_WINDOW_TOP_ARCH_1_3_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_3"),
            new TripleWindowTopArch13Recipe.Serializer());
    public static final RecipeType<TripleWindowTopArch13Recipe> TRIPLE_WINDOW_TOP_ARCH_1_3_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_1_3"), new RecipeType<TripleWindowTopArch13Recipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_1_3";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArch22Recipe> TRIPLE_WINDOW_TOP_ARCH_2_2_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_2"),
            new TripleWindowTopArch22Recipe.Serializer());
    public static final RecipeType<TripleWindowTopArch22Recipe> TRIPLE_WINDOW_TOP_ARCH_2_2_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_2"), new RecipeType<TripleWindowTopArch22Recipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_2_2";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArch23Recipe> TRIPLE_WINDOW_TOP_ARCH_2_3_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_3"),
            new TripleWindowTopArch23Recipe.Serializer());
    public static final RecipeType<TripleWindowTopArch23Recipe> TRIPLE_WINDOW_TOP_ARCH_2_3_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_2_3"), new RecipeType<TripleWindowTopArch23Recipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_2_3";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArchLeftRecipe> TRIPLE_WINDOW_TOP_ARCH_LEFT_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_left"),
            new TripleWindowTopArchLeftRecipe.Serializer());
    public static final RecipeType<TripleWindowTopArchLeftRecipe> TRIPLE_WINDOW_TOP_ARCH_LEFT_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_left"), new RecipeType<TripleWindowTopArchLeftRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_left";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopArchMiddleRecipe> TRIPLE_WINDOW_TOP_ARCH_MIDDLE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_middle"),
            new TripleWindowTopArchMiddleRecipe.Serializer());
    public static final RecipeType<TripleWindowTopArchMiddleRecipe> TRIPLE_WINDOW_TOP_ARCH_MIDDLE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_arch_middle"), new RecipeType<TripleWindowTopArchMiddleRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_arch_middle";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopCapMiddleRecipe> TRIPLE_WINDOW_TOP_CAP_MIDDLE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_middle"),
            new TripleWindowTopCapMiddleRecipe.Serializer());
    public static final RecipeType<TripleWindowTopCapMiddleRecipe> TRIPLE_WINDOW_TOP_CAP_MIDDLE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_middle"), new RecipeType<TripleWindowTopCapMiddleRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_cap_middle";
                }
            });
    

public static final RecipeSerializer<TripleWindowTopCapRightRecipe> TRIPLE_WINDOW_TOP_CAP_RIGHT_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_right"),
            new TripleWindowTopCapRightRecipe.Serializer());
    public static final RecipeType<TripleWindowTopCapRightRecipe> TRIPLE_WINDOW_TOP_CAP_RIGHT_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "triple_window_top_cap_right"), new RecipeType<TripleWindowTopCapRightRecipe>() {
                @Override
                public String toString() {
                    return "triple_window_top_cap_right";
                }
            });
    

public static final RecipeSerializer<TwinColumnBaseRecipe> TWIN_COLUMN_BASE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "twin_column_base"),
            new TwinColumnBaseRecipe.Serializer());
    public static final RecipeType<TwinColumnBaseRecipe> TWIN_COLUMN_BASE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "twin_column_base"), new RecipeType<TwinColumnBaseRecipe>() {
                @Override
                public String toString() {
                    return "twin_column_base";
                }
            });
    

public static final RecipeSerializer<TwinColumnCapitalRecipe> TWIN_COLUMN_CAPITAL_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "twin_column_capital"),
            new TwinColumnCapitalRecipe.Serializer());
    public static final RecipeType<TwinColumnCapitalRecipe> TWIN_COLUMN_CAPITAL_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "twin_column_capital"), new RecipeType<TwinColumnCapitalRecipe>() {
                @Override
                public String toString() {
                    return "twin_column_capital";
                }
            });
    

public static final RecipeSerializer<TwinColumnsRecipe> TWIN_COLUMNS_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "twin_columns"),
            new TwinColumnsRecipe.Serializer());
    public static final RecipeType<TwinColumnsRecipe> TWIN_COLUMNS_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "twin_columns"), new RecipeType<TwinColumnsRecipe>() {
                @Override
                public String toString() {
                    return "twin_columns";
                }
            });
    
    public static void registerRecipes() {
        Architecture.LOGGER.info("Registering Custom Recipes for " + Architecture.MOD_ID);
    }
}
