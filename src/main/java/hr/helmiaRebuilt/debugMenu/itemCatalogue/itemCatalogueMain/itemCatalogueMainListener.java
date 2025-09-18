package hr.helmiaRebuilt.debugMenu.itemCatalogue.itemCatalogueMain;

import hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodCrops.foodCrops;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodDishes.foodDishes;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodMeats.foodMeats;
import hr.helmiaRebuilt.helmiaRebuiltFinal;
import hr.helmiaRebuilt.debugMenu.debugMenuMain.debugMenuUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class itemCatalogueMainListener implements Listener {
    public itemCatalogueMainListener(helmiaRebuiltFinal helmiaRebuiltFinal) {}

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // Ensure the title matches exactly
        if (itemCatalogueMain.isItemCatalogue(event.getInventory())) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getRawSlot() == 49){
                player.closeInventory();
            }
            if (event.getRawSlot() == 48){
                debugMenuUI.openDebugMenuUI(player);
            }
            if (event.getRawSlot() == 19){
                foodCrops.openFoodCrops(player);
            }
            if (event.getRawSlot() == 28){
                foodMeats.openFoodMeats(player);
            }
            if (event.getRawSlot() == 37){
                foodDishes.openFoodDishes(player);
            }

        }
    }
}
