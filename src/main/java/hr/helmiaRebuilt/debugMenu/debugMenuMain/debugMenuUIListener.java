package hr.helmiaRebuilt.debugMenu.debugMenuMain;

import hr.helmiaRebuilt.helmiaRebuiltFinal;
import hr.helmiaRebuilt.debugMenu.itemCatalogue.itemCatalogueMain.itemCatalogueMain;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class debugMenuUIListener implements Listener {
    public debugMenuUIListener(helmiaRebuiltFinal helmiaRebuiltFinal) {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // Ensure the title matches exactly
        if (debugMenuUI.isDebugMenu(event.getInventory())) {
            Player player = (Player) event.getWhoClicked();
            Inventory inv = event.getInventory();
            event.setCancelled(true);

            if (event.getRawSlot() == 49){
                player.closeInventory();
            }
            if (event.getRawSlot() == 19){
                itemCatalogueMain.openItemCatalogueMain(player);
            }

        }
    }
}
