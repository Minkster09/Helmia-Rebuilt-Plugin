package hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodCrops;

import hr.helmiaRebuilt.debugMenu.itemCatalogue.itemCatalogueMain.itemCatalogueMain;
import hr.helmiaRebuilt.helmiaRebuiltFinal;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class foodCropsListener implements Listener {
    public foodCropsListener(helmiaRebuiltFinal helmiaRebuiltFinal) {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // Ensure the title matches exactly
        if (foodCrops.isFoodCrops(event.getInventory())) {
            Player player = (Player) event.getWhoClicked();
            Inventory inv = event.getInventory();
            event.setCancelled(true);
            int[] itemSlots = {
                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44
            };
            if (event.getSlot() == event.getRawSlot()) {
                for (int slot : itemSlots) {
                    if (slot == event.getSlot()) {
                        ItemStack item = inv.getItem(slot);
                        player.getInventory().addItem(item);
                        return;
                    }
                }
            }

            if (event.getRawSlot() == 49){
                player.closeInventory();
            }
            if (event.getRawSlot() == 48){
                itemCatalogueMain.openItemCatalogueMain(player);
            }
        }
    }
}
