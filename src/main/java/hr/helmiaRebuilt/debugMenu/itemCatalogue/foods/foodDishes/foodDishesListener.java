package hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodDishes;

import hr.helmiaRebuilt.debugMenu.itemCatalogue.itemCatalogueMain.itemCatalogueMain;
import hr.helmiaRebuilt.helmiaRebuiltFinal;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class foodDishesListener implements Listener {
    public foodDishesListener(helmiaRebuiltFinal helmiaRebuiltFinal) {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // Ensure the title matches exactly
        if (foodDishes.isFoodDishes(event.getInventory())) {
            Player player = (Player) event.getWhoClicked();
            Inventory inv = event.getInventory();
            event.setCancelled(true);

            if (event.getRawSlot() == 49){
                player.closeInventory();
            }
            if (event.getRawSlot() == 48){
                itemCatalogueMain.openItemCatalogueMain(player);
            }
            if (event.getRawSlot() == 19){
                //PH
            }

        }
    }
}
