package hr.helmiaRebuilt.customSmithing;

import hr.helmiaRebuilt.itemRegistry.customItemManager;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class recipeRegister {
    private final Map<String, customRecipes> recipes;

    // Constructor accepting the recipes map
    public recipeRegister(Map<String, customRecipes> recipes) {
        this.recipes = recipes; // Set the passed map to the class variable
        registerRecipes(); // Call the method to register recipes
    }

    // Method to register the recipes
    private void registerRecipes() {

        //Slaggy Iron Ingot
        Map<Integer, ItemStack> iron_ingot_slaggy_ingredients = new HashMap<>();
        ItemStack iron_ingot_slaggy_ingredient_1 = customItemManager.getCustomItem("iron_bloom").clone();
        iron_ingot_slaggy_ingredients.put(10, iron_ingot_slaggy_ingredient_1);
        iron_ingot_slaggy_ingredients.put(11, null);
        ItemStack iron_ingot_slaggy_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_ingot_slaggy_ingredients.put(12, iron_ingot_slaggy_ingredient_3);
        ItemStack iron_ingot_slaggy_result = customItemManager.getCustomItem("iron_ingot_slaggy").clone();
        customRecipes iron_ingot_slaggy_recipe = new customRecipes(iron_ingot_slaggy_ingredients, iron_ingot_slaggy_result);
        recipes.put("iron_ingot_slaggy_recipe", iron_ingot_slaggy_recipe);

        Map<Integer, ItemStack> iron_ingot_slaggy_ingredients_2 = new HashMap<>();
        ItemStack iron_ingot_slaggy_ingredient_1_2 = customItemManager.getCustomItem("iron_bloom").clone();
        iron_ingot_slaggy_ingredients_2.put(11, iron_ingot_slaggy_ingredient_1_2);
        iron_ingot_slaggy_ingredients_2.put(10, null);
        ItemStack iron_ingot_slaggy_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_ingot_slaggy_ingredients_2.put(12, iron_ingot_slaggy_ingredient_3_2);
        ItemStack iron_ingot_slaggy_result_2 = customItemManager.getCustomItem("iron_ingot_slaggy").clone();
        customRecipes iron_ingot_slaggy_recipe_2 = new customRecipes(iron_ingot_slaggy_ingredients_2, iron_ingot_slaggy_result_2);
        recipes.put("iron_ingot_slaggy_recipe_2", iron_ingot_slaggy_recipe_2);

        //Iron Ingot
        Map<Integer, ItemStack> iron_ingot_ingredients = new HashMap<>();
        ItemStack iron_ingot_ingredient_1 = customItemManager.getCustomItem("iron_ingot_slaggy").clone();
        iron_ingot_ingredients.put(10, iron_ingot_ingredient_1);
        iron_ingot_ingredients.put(11, null);
        ItemStack iron_ingot_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_ingot_ingredients.put(12, iron_ingot_ingredient_3);
        ItemStack iron_ingot_result = customItemManager.getCustomItem("iron_ingot").clone();
        customRecipes iron_ingot_recipe = new customRecipes(iron_ingot_ingredients, iron_ingot_result);
        recipes.put("iron_ingot_recipe", iron_ingot_recipe);

        Map<Integer, ItemStack> iron_ingot_ingredients_2 = new HashMap<>();
        ItemStack iron_ingot_ingredient_1_2 = customItemManager.getCustomItem("iron_ingot_slaggy").clone();
        iron_ingot_ingredients_2.put(11, iron_ingot_ingredient_1_2);
        iron_ingot_ingredients_2.put(10, null);
        ItemStack iron_ingot_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_ingot_ingredients_2.put(12, iron_ingot_ingredient_3_2);
        ItemStack iron_ingot_result_2 = customItemManager.getCustomItem("iron_ingot").clone();
        customRecipes iron_ingot_recipe_2 = new customRecipes(iron_ingot_ingredients_2, iron_ingot_result_2);
        recipes.put("iron_ingot_recipe_2", iron_ingot_recipe_2);

        //Iron Stick
        Map<Integer, ItemStack> iron_stick_ingredients = new HashMap<>();
        ItemStack iron_stick_ingredient_1 = customItemManager.getCustomItem("iron_ingot_glowing").clone();
        iron_stick_ingredients.put(10, iron_stick_ingredient_1);
        iron_stick_ingredients.put(11, null);
        ItemStack iron_stick_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_stick_ingredients.put(12, iron_stick_ingredient_3);
        ItemStack iron_stick_result = customItemManager.getCustomItem("iron_stick").clone();
        customRecipes iron_stick_recipe = new customRecipes(iron_stick_ingredients, iron_stick_result);
        recipes.put("iron_stick_recipe", iron_stick_recipe);

        Map<Integer, ItemStack> iron_stick_ingredients_2 = new HashMap<>();
        ItemStack iron_stick_ingredient_1_2 = customItemManager.getCustomItem("iron_ingot_glowing").clone();
        iron_stick_ingredients_2.put(11, iron_stick_ingredient_1_2);
        iron_stick_ingredients_2.put(10, null);
        ItemStack iron_stick_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_stick_ingredients_2.put(12, iron_stick_ingredient_3_2);
        ItemStack iron_stick_result_2 = customItemManager.getCustomItem("iron_stick").clone();
        customRecipes iron_stick_recipe_2 = new customRecipes(iron_stick_ingredients_2, iron_stick_result_2);
        recipes.put("iron_stick_recipe_2", iron_stick_recipe_2);

        //Iron Strip
        Map<Integer, ItemStack> iron_strip_ingredients = new HashMap<>();
        ItemStack iron_strip_ingredient_1 = customItemManager.getCustomItem("iron_stick_glowing").clone();
        iron_strip_ingredients.put(10, iron_strip_ingredient_1);
        iron_strip_ingredients.put(11, null);
        ItemStack iron_strip_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_strip_ingredients.put(12, iron_strip_ingredient_3);
        ItemStack iron_strip_result = customItemManager.getCustomItem("iron_strip").clone();
        customRecipes iron_strip_recipe = new customRecipes(iron_strip_ingredients, iron_strip_result);
        recipes.put("iron_strip_recipe", iron_strip_recipe);

        Map<Integer, ItemStack> iron_strip_ingredients_2 = new HashMap<>();
        ItemStack iron_strip_ingredient_1_2 = customItemManager.getCustomItem("iron_stick_glowing").clone();
        iron_strip_ingredients_2.put(11, iron_strip_ingredient_1_2);
        iron_strip_ingredients_2.put(10, null);
        ItemStack iron_strip_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_strip_ingredients_2.put(12, iron_strip_ingredient_3_2);
        ItemStack iron_strip_result_2 = customItemManager.getCustomItem("iron_strip").clone();
        customRecipes iron_strip_recipe_2 = new customRecipes(iron_strip_ingredients_2, iron_strip_result_2);
        recipes.put("iron_strip_recipe_2", iron_strip_recipe_2);

        //Iron Rod
        Map<Integer, ItemStack> iron_rod_ingredients = new HashMap<>();
        ItemStack iron_rod_ingredient_1 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_rod_ingredients.put(10, iron_rod_ingredient_1);
        iron_rod_ingredients.put(11, null);
        ItemStack iron_rod_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_rod_ingredients.put(12, iron_rod_ingredient_3);
        ItemStack iron_rod_result = customItemManager.getCustomItem("iron_rod").clone();
        customRecipes iron_rod_recipe = new customRecipes(iron_rod_ingredients, iron_rod_result);
        recipes.put("iron_rod_recipe", iron_rod_recipe);

        Map<Integer, ItemStack> iron_rod_ingredients_2 = new HashMap<>();
        ItemStack iron_rod_ingredient_1_2 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_rod_ingredients_2.put(10, iron_rod_ingredient_1_2);
        iron_rod_ingredients_2.put(11, null);
        ItemStack iron_rod_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_rod_ingredients_2.put(12, iron_rod_ingredient_3_2);
        ItemStack iron_rod_result_2 = customItemManager.getCustomItem("iron_rod").clone();
        customRecipes iron_rod_recipe_2 = new customRecipes(iron_rod_ingredients_2, iron_rod_result_2);
        recipes.put("iron_rod_recipe_2", iron_rod_recipe_2);

        //Thin Iron Rod
        Map<Integer, ItemStack> iron_rod_thin_ingredients = new HashMap<>();
        ItemStack iron_rod_thin_ingredient_1 = customItemManager.getCustomItem("iron_rod_glowing").clone();
        iron_rod_thin_ingredients.put(10, iron_rod_thin_ingredient_1);
        iron_rod_thin_ingredients.put(11, null);
        ItemStack iron_rod_thin_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_rod_thin_ingredients.put(12, iron_rod_thin_ingredient_3);
        ItemStack iron_rod_thin_result = customItemManager.getCustomItem("iron_rod_thin").clone();
        customRecipes iron_rod_thin_recipe = new customRecipes(iron_rod_thin_ingredients, iron_rod_thin_result);
        recipes.put("iron_rod_thin_recipe", iron_rod_thin_recipe);

        Map<Integer, ItemStack> iron_rod_thin_ingredients_2 = new HashMap<>();
        ItemStack iron_rod_thin_ingredient_1_2 = customItemManager.getCustomItem("iron_rod_glowing").clone();
        iron_rod_thin_ingredients_2.put(11, iron_rod_thin_ingredient_1_2);
        iron_rod_thin_ingredients_2.put(10, null);
        ItemStack iron_rod_thin_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_rod_thin_ingredients_2.put(12, iron_rod_thin_ingredient_3_2);
        ItemStack iron_rod_thin_result_2 = customItemManager.getCustomItem("iron_rod_thin").clone();
        customRecipes iron_rod_thin_recipe_2 = new customRecipes(iron_rod_thin_ingredients_2, iron_rod_thin_result_2);
        recipes.put("iron_rod_thin_recipe_2", iron_rod_thin_recipe_2);

        //Iron Coil
        Map<Integer, ItemStack> iron_coil_ingredients = new HashMap<>();
        ItemStack iron_coil_ingredient_1 = customItemManager.getCustomItem("iron_rod_thin").clone();
        iron_coil_ingredients.put(10, iron_coil_ingredient_1);
        iron_coil_ingredients.put(11, null);
        ItemStack iron_coil_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_coil_ingredients.put(12, iron_coil_ingredient_3);
        ItemStack iron_coil_result = customItemManager.getCustomItem("iron_coil").clone();
        customRecipes iron_coil_recipe = new customRecipes(iron_coil_ingredients, iron_coil_result);
        recipes.put("iron_coil_recipe", iron_coil_recipe);

        Map<Integer, ItemStack> iron_coil_ingredients_2 = new HashMap<>();
        ItemStack iron_coil_ingredient_1_2 = customItemManager.getCustomItem("iron_rod_thin").clone();
        iron_coil_ingredients_2.put(11, iron_coil_ingredient_1_2);
        iron_coil_ingredients_2.put(10, null);
        ItemStack iron_coil_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_coil_ingredients_2.put(12, iron_coil_ingredient_3_2);
        ItemStack iron_coil_result_2 = customItemManager.getCustomItem("iron_coil").clone();
        customRecipes iron_coil_recipe_2 = new customRecipes(iron_coil_ingredients_2, iron_coil_result_2);
        recipes.put("iron_coil_recipe_2", iron_coil_recipe_2);

        //Chains
        Map<Integer, ItemStack> chains_ingredients = new HashMap<>();
        ItemStack chains_ingredient_1 = customItemManager.getCustomItem("iron_coil").clone();
        chains_ingredients.put(10, chains_ingredient_1);
        chains_ingredients.put(11, null);
        ItemStack chains_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        chains_ingredients.put(12, chains_ingredient_3);
        ItemStack chains_result = customItemManager.getCustomItem("chains").clone();
        chains_result.setAmount(4);
        customRecipes chains_recipe = new customRecipes(chains_ingredients, chains_result);
        recipes.put("chains_recipe", chains_recipe);

        Map<Integer, ItemStack> chains_ingredients_2 = new HashMap<>();
        ItemStack chains_ingredient_1_2 = customItemManager.getCustomItem("iron_coil").clone();
        chains_ingredients_2.put(11, chains_ingredient_1_2);
        chains_ingredients_2.put(10, null);
        ItemStack chains_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        chains_ingredients_2.put(12, chains_ingredient_3_2);
        ItemStack chains_result_2 = customItemManager.getCustomItem("chains").clone();
        chains_result_2.setAmount(4);
        customRecipes chains_recipe_2 = new customRecipes(chains_ingredients_2, chains_result_2);
        recipes.put("chains_recipe_2", chains_recipe_2);

        //Chainmail
        Map<Integer, ItemStack> chainmail_ingredients = new HashMap<>();
        ItemStack chainmail_ingredient_1 = customItemManager.getCustomItem("chains").clone();
        chainmail_ingredient_1.setAmount(8);
        chainmail_ingredients.put(10, chainmail_ingredient_1);
        chainmail_ingredients.put(11, null);
        ItemStack chainmail_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        chainmail_ingredients.put(12, chainmail_ingredient_3);
        ItemStack chainmail_result = customItemManager.getCustomItem("chainmail").clone();
        customRecipes chainmail_recipe = new customRecipes(chainmail_ingredients, chainmail_result);
        recipes.put("chainmail_recipe", chainmail_recipe);

        Map<Integer, ItemStack> chainmail_ingredients_2 = new HashMap<>();
        ItemStack chainmail_ingredient_1_2 = customItemManager.getCustomItem("chains").clone();
        chainmail_ingredient_1_2.setAmount(8);
        chainmail_ingredients_2.put(11, chainmail_ingredient_1_2);
        chainmail_ingredients_2.put(10, null);
        ItemStack chainmail_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        chainmail_ingredients_2.put(12, chainmail_ingredient_3_2);
        ItemStack chainmail_result_2 = customItemManager.getCustomItem("chainmail").clone();
        customRecipes chainmail_recipe_2 = new customRecipes(chainmail_ingredients_2, chainmail_result_2);
        recipes.put("chainmail_recipe_2", chainmail_recipe_2);

        //Reinforced Chainmail
        Map<Integer, ItemStack> reinforced_chainmail_ingredients = new HashMap<>();
        ItemStack reinforced_chainmail_ingredient_1 = customItemManager.getCustomItem("chains").clone();
        reinforced_chainmail_ingredient_1.setAmount(16);
        reinforced_chainmail_ingredients.put(10, reinforced_chainmail_ingredient_1);
        ItemStack reinforced_chainmail_ingredient_2 = customItemManager.getCustomItem("chains").clone();
        reinforced_chainmail_ingredient_2.setAmount(16);
        reinforced_chainmail_ingredients.put(11, reinforced_chainmail_ingredient_2);
        ItemStack reinforced_chainmail_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        reinforced_chainmail_ingredients.put(12, reinforced_chainmail_ingredient_3);
        ItemStack reinforced_chainmail_result = customItemManager.getCustomItem("reinforced_chainmail").clone();
        customRecipes reinforced_chainmail_recipe = new customRecipes(reinforced_chainmail_ingredients, reinforced_chainmail_result);
        recipes.put("reinforced_chainmail_recipe", reinforced_chainmail_recipe);

        //Chainmail Chestplate TBD

        //Smithing Tools
        Map<Integer, ItemStack> smithing_tools_ingredients = new HashMap<>();
        ItemStack smithing_tools_ingredient_1 = customItemManager.getCustomItem("iron_stick_glowing").clone();
        smithing_tools_ingredients.put(10, smithing_tools_ingredient_1);
        ItemStack smithing_tools_ingredient_2 = customItemManager.getCustomItem("shaft").clone();
        smithing_tools_ingredients.put(11, smithing_tools_ingredient_2);
        ItemStack smithing_tools_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        smithing_tools_ingredients.put(12, smithing_tools_ingredient_3);
        ItemStack smithing_tools_result = customItemManager.getCustomItem("smithing_tools").clone();
        smithing_tools_result.setAmount(8);
        customRecipes smithing_tools_recipe = new customRecipes(smithing_tools_ingredients, smithing_tools_result);
        recipes.put("smithing_tools_recipe", smithing_tools_recipe);

        Map<Integer, ItemStack> smithing_tools_ingredients_2 = new HashMap<>();
        ItemStack smithing_tools_ingredient_1_2 = customItemManager.getCustomItem("shaft").clone();
        smithing_tools_ingredients_2.put(10, smithing_tools_ingredient_1_2);
        ItemStack smithing_tools_ingredient_2_2 = customItemManager.getCustomItem("iron_stick_glowing").clone();
        smithing_tools_ingredients_2.put(11, smithing_tools_ingredient_2_2);
        ItemStack smithing_tools_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        smithing_tools_ingredients_2.put(12, smithing_tools_ingredient_3_2);
        ItemStack smithing_tools_result_2 = customItemManager.getCustomItem("smithing_tools").clone();
        smithing_tools_result_2.setAmount(8);
        customRecipes smithing_tools_recipe_2 = new customRecipes(smithing_tools_ingredients_2, smithing_tools_result_2);
        recipes.put("smithing_tools_recipe_2", smithing_tools_recipe_2);

        //Iron Axe Head
        Map<Integer, ItemStack> iron_axe_head_ingredients = new HashMap<>();
        ItemStack iron_axe_head_ingredient_1 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_axe_head_ingredients.put(10, iron_axe_head_ingredient_1);
        ItemStack iron_axe_head_ingredient_2 = customItemManager.getCustomItem("whetstone").clone();
        iron_axe_head_ingredients.put(11, iron_axe_head_ingredient_2);
        ItemStack iron_axe_head_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_axe_head_ingredients.put(12, iron_axe_head_ingredient_3);
        ItemStack iron_axe_head_result = customItemManager.getCustomItem("iron_axe_head").clone();
        customRecipes iron_axe_head_recipe = new customRecipes(iron_axe_head_ingredients, iron_axe_head_result);
        recipes.put("iron_axe_head_recipe", iron_axe_head_recipe);

        Map<Integer, ItemStack> iron_axe_head_ingredients_2 = new HashMap<>();
        ItemStack iron_axe_head_ingredient_1_2 = customItemManager.getCustomItem("whetstone").clone();
        iron_axe_head_ingredients_2.put(10, iron_axe_head_ingredient_1_2);
        ItemStack iron_axe_head_ingredient_2_2 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_axe_head_ingredients_2.put(11, iron_axe_head_ingredient_2_2);
        ItemStack iron_axe_head_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_axe_head_ingredients_2.put(12, iron_axe_head_ingredient_3_2);
        ItemStack iron_axe_head_result_2 = customItemManager.getCustomItem("iron_axe_head").clone();
        customRecipes iron_axe_head_recipe_2 = new customRecipes(iron_axe_head_ingredients_2, iron_axe_head_result_2);
        recipes.put("iron_axe_head_recipe_2", iron_axe_head_recipe_2);

        //Iron Voulge Head
        Map<Integer, ItemStack> iron_voulge_head_ingredients = new HashMap<>();
        ItemStack iron_voulge_head_ingredient_1 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_voulge_head_ingredients.put(10, iron_voulge_head_ingredient_1);
        ItemStack iron_voulge_head_ingredient_2 = customItemManager.getCustomItem("iron_blade_glowing").clone();
        iron_voulge_head_ingredients.put(11, iron_voulge_head_ingredient_2);
        ItemStack iron_voulge_head_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_voulge_head_ingredients.put(12, iron_voulge_head_ingredient_3);
        ItemStack iron_voulge_head_result = customItemManager.getCustomItem("iron_voulge_head").clone();
        customRecipes iron_voulge_head_recipe = new customRecipes(iron_voulge_head_ingredients, iron_voulge_head_result);
        recipes.put("iron_voulge_head_recipe", iron_voulge_head_recipe);

        Map<Integer, ItemStack> iron_voulge_head_ingredients_2 = new HashMap<>();
        ItemStack iron_voulge_head_ingredient_1_2 = customItemManager.getCustomItem("iron_blade_glowing").clone();
        iron_voulge_head_ingredients_2.put(10, iron_voulge_head_ingredient_1_2);
        ItemStack iron_voulge_head_ingredient_2_2 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_voulge_head_ingredients_2.put(11, iron_voulge_head_ingredient_2_2);
        ItemStack iron_voulge_head_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_voulge_head_ingredients_2.put(12, iron_voulge_head_ingredient_3_2);
        ItemStack iron_voulge_head_result_2 = customItemManager.getCustomItem("iron_voulge_head").clone();
        customRecipes iron_voulge_head_recipe_2 = new customRecipes(iron_voulge_head_ingredients_2, iron_voulge_head_result_2);
        recipes.put("iron_voulge_head_recipe_2", iron_voulge_head_recipe_2);

        //Bitheryk Iron Blade
        Map<Integer, ItemStack> iron_blade_bitheryk_ingredients = new HashMap<>();
        ItemStack iron_blade_bitheryk_ingredient_1 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_blade_bitheryk_ingredient_1.setAmount(5);
        iron_blade_bitheryk_ingredients.put(10, iron_blade_bitheryk_ingredient_1);
        ItemStack iron_blade_bitheryk_ingredient_2 = customItemManager.getCustomItem("iron_blade_glowing").clone();
        iron_blade_bitheryk_ingredient_2.setAmount(2);
        iron_blade_bitheryk_ingredients.put(11, iron_blade_bitheryk_ingredient_2);
        ItemStack iron_blade_bitheryk_ingredient_3 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_blade_bitheryk_ingredients.put(12, iron_blade_bitheryk_ingredient_3);
        ItemStack iron_blade_bitheryk_result = customItemManager.getCustomItem("iron_blade_bitheryk").clone();
        customRecipes iron_blade_bitheryk_recipe = new customRecipes(iron_blade_bitheryk_ingredients, iron_blade_bitheryk_result);
        recipes.put("iron_blade_bitheryk_recipe", iron_blade_bitheryk_recipe);

        Map<Integer, ItemStack> iron_blade_bitheryk_ingredients_2 = new HashMap<>();
        ItemStack iron_blade_bitheryk_ingredient_1_2 = customItemManager.getCustomItem("iron_blade_glowing").clone();
        iron_blade_bitheryk_ingredient_1_2.setAmount(2);
        iron_blade_bitheryk_ingredients_2.put(10, iron_blade_bitheryk_ingredient_1_2);
        ItemStack iron_blade_bitheryk_ingredient_2_2 = customItemManager.getCustomItem("iron_strip_glowing").clone();
        iron_blade_bitheryk_ingredient_2_2.setAmount(5);
        iron_blade_bitheryk_ingredients_2.put(11, iron_blade_bitheryk_ingredient_2_2);
        ItemStack iron_blade_bitheryk_ingredient_3_2 = customItemManager.getCustomItem("smithing_tools").clone();
        iron_blade_bitheryk_ingredients_2.put(12, iron_blade_bitheryk_ingredient_3_2);
        ItemStack iron_blade_bitheryk_result_2 = customItemManager.getCustomItem("iron_blade_bitheryk").clone();
        customRecipes iron_blade_bitheryk_recipe_2 = new customRecipes(iron_blade_bitheryk_ingredients_2, iron_blade_bitheryk_result_2);
        recipes.put("iron_blade_bitheryk_recipe_2", iron_blade_bitheryk_recipe_2);
    }
}
