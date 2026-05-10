package org.seanpaulhumphrey.architecture.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.item.ModItems;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HALF_QUARTZ_PILLAR, RecipeCategory.DECORATIONS, ModBlocks.HALF_QUARTZ_PILLAR);

                createShaped(RecipeCategory.MISC, ModBlocks.HALF_QUARTZ_PILLAR)
                        .pattern("XXX")
                        .pattern("XQX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUARTZ_PILLAR, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6, RecipeCategory.DECORATIONS, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6);
                createShaped(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THIN_QUARTZ_BASE, RecipeCategory.DECORATIONS, ModBlocks.THIN_QUARTZ_BASE);
                createShaped(RecipeCategory.MISC, ModBlocks.THIN_QUARTZ_BASE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.THIN_QUARTZ_BASE, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THIN_QUARTZ_CAPITAL, RecipeCategory.DECORATIONS, ModBlocks.THIN_QUARTZ_CAPITAL);
                createShaped(RecipeCategory.MISC, ModBlocks.THIN_QUARTZ_CAPITAL)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.THIN_QUARTZ_CAPITAL, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THIN_QUARTZ_COLUMN, RecipeCategory.DECORATIONS, ModBlocks.THIN_QUARTZ_COLUMN);
                createShaped(RecipeCategory.MISC, ModBlocks.THIN_QUARTZ_COLUMN)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.THIN_QUARTZ_COLUMN, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_CAP_LEFT, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_CAP_LEFT);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_CAP_LEFT)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_CAP_LEFT, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT, RecipeCategory.DECORATIONS, ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT);
                createShaped(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TWIN_COLUMN_BASE, RecipeCategory.DECORATIONS, ModBlocks.TWIN_COLUMN_BASE);
                createShaped(RecipeCategory.MISC, ModBlocks.TWIN_COLUMN_BASE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TWIN_COLUMN_BASE, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TWIN_COLUMN_CAPITAL, RecipeCategory.DECORATIONS, ModBlocks.TWIN_COLUMN_CAPITAL);
                createShaped(RecipeCategory.MISC, ModBlocks.TWIN_COLUMN_CAPITAL)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TWIN_COLUMN_CAPITAL, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TWIN_COLUMNS, RecipeCategory.DECORATIONS, ModBlocks.TWIN_COLUMNS);
                createShaped(RecipeCategory.MISC, ModBlocks.TWIN_COLUMNS)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.TWIN_COLUMNS, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "Architecture Recipes";
    }
}
