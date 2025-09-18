package hr.helmiaRebuilt.customSmithing.listeners;

import hr.helmiaRebuilt.customSmithing.smithingUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class smithingTableClose implements Listener {

    @EventHandler
    public void onSmithingTableClose(InventoryCloseEvent event) {
        Inventory inv = event.getInventory();
        if (smithingUI.isSmithingUI(event.getInventory())) {
            Player player = (Player) event.getPlayer();

            // Handle slot 10
            if (inv.getItem(10) != null) {
                ItemStack item1 = inv.getItem(10);
                if (player.getInventory().firstEmpty() != -1) {
                    // Add to player's inventory if there is space
                    player.getInventory().addItem(item1);
                } else {
                    // Drop on the ground if player's inventory is full
                    player.getWorld().dropItemNaturally(player.getLocation(), item1);
                }
            }

            // Handle slot 11
            if (inv.getItem(11) != null) {
                ItemStack item2 = inv.getItem(11);
                if (player.getInventory().firstEmpty() != -1) {
                    player.getInventory().addItem(item2);
                } else {
                    player.getWorld().dropItemNaturally(player.getLocation(), item2);
                }
            }

            // Handle slot 12
            if (inv.getItem(12) != null) {
                ItemStack item3 = inv.getItem(12);
                if (player.getInventory().firstEmpty() != -1) {
                    player.getInventory().addItem(item3);
                } else {
                    player.getWorld().dropItemNaturally(player.getLocation(), item3);
                }
            }
        }
    }
}