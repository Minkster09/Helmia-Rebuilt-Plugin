package hr.helmiaRebuilt;

import hr.helmiaRebuilt.customChat.chatColors;
import hr.helmiaRebuilt.customSmithing.recipeRegister;
import hr.helmiaRebuilt.customSmithing.listeners.smithingTableClose;
import hr.helmiaRebuilt.customSmithing.listeners.smithingTableOpen;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodCrops.foodCropsListener;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodDishes.foodDishesListener;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodMeats.foodMeatsListener;
import hr.helmiaRebuilt.hrCommand.helmiarebuiltCommandCompleter;
import hr.helmiaRebuilt.hrCommand.helmiarebuiltCommand;
import hr.helmiaRebuilt.debugMenu.debugMenuMain.debugMenuUIListener;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.itemCatalogueMain.itemCatalogueMainListener;
import hr.helmiaRebuilt.itemRegistry.customItemManager;
import hr.helmiaRebuilt.customSmithing.listeners.smithingUIListener;
import hr.helmiaRebuilt.customSmithing.customRecipes;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class helmiaRebuiltFinal extends JavaPlugin {
    private final Map<String, customRecipes> recipes = new HashMap<>();
    private customItemManager customItemManager; // Declare the customItemManager
    public static helmiaRebuiltFinal plugin;

    @Override
    public void onEnable() {
        getLogger().info("Helmia Rebuilt Plugin Enabled - 'This plugin is not stinky' - Minky Stinky The Stinky");

        plugin = this;

        // Initialize customItemManager
        customItemManager = new customItemManager();
        customItemManager.initializeItems();
        new recipeRegister(recipes);

        // Register commands
        getCommand("helmiarebuilt").setExecutor(new helmiarebuiltCommand());
        getCommand("helmiarebuilt").setTabCompleter(new helmiarebuiltCommandCompleter());

        // Register events
        getServer().getPluginManager().registerEvents(new smithingUIListener(this), this);
        getServer().getPluginManager().registerEvents(new smithingTableOpen(),this);
        getServer().getPluginManager().registerEvents(new smithingTableClose(),this);
        getServer().getPluginManager().registerEvents(new debugMenuUIListener(this), this);
        getServer().getPluginManager().registerEvents(new itemCatalogueMainListener(this), this);
        getServer().getPluginManager().registerEvents(new foodCropsListener(this), this);
        getServer().getPluginManager().registerEvents(new foodDishesListener(this), this);
        getServer().getPluginManager().registerEvents(new foodMeatsListener(this), this);
        getServer().getPluginManager().registerEvents(new chatColors(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Helmia Rebuilt Plugin Disabled");
    }
    public Map<String, customRecipes> getRecipes() {
        return recipes;
    }
}
