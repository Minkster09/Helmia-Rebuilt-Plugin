package hr.helmiaRebuilt.customSmithing.listeners;

import hr.helmiaRebuilt.customSmithing.customRecipes;
import hr.helmiaRebuilt.helmiaRebuiltFinal;
import hr.helmiaRebuilt.customSmithing.smithingUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class smithingUIListener implements Listener {
    private final helmiaRebuiltFinal plugin;
    private final ItemStack ResultItemPH;

    public smithingUIListener(helmiaRebuiltFinal plugin) {
        this.plugin = plugin;
        this.ResultItemPH = new ItemStack(Material.FLINT); // Default flint item
        ItemMeta ResultItemPHMeta = ResultItemPH.getItemMeta();

        // Set display name
        ResultItemPHMeta.setDisplayName(ChatColor.WHITE + "Result Item");

        // Create and set lore
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_GRAY + "Place items in the 3 smithing");
        lore.add(ChatColor.DARK_GRAY + "slots to smith an item!");
        ResultItemPHMeta.setLore(lore);

        // Set custom model data
        ResultItemPHMeta.setCustomModelData(1);

        // Apply the modified ItemMeta back to the ItemStack
        ResultItemPH.setItemMeta(ResultItemPHMeta);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!smithingUI.isSmithingUI(event.getInventory())) return;

        Player player = (Player) event.getWhoClicked();
        Inventory inv = event.getInventory();

        // List of unmovable slots
        int[] unmovableSlots = {0,1,2,3,4,5,6,7,8,9,13,14,15,17,18,19,20,21,22,23,24,25,26};

        for (int slot : unmovableSlots) {
            if (event.getSlot() == slot && event.getSlot() == event.getRawSlot()) {
                event.setCancelled(true);
                return;
            }
        }

        // Prevent moving flint from the result slot if it's placeholder
        if (event.getRawSlot() == 16) {
            ItemStack resultItem = inv.getItem(16);
            if (resultItem != null && resultItem.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Result Item")) {
                event.setCancelled(true); // Prevent taking flint placeholder
                return;
            }
            if (resultItem != null) {
                // Give or drop the result
                if (player.getInventory().firstEmpty() != -1) {
                    player.getInventory().addItem(resultItem);
                } else {
                    player.getWorld().dropItemNaturally(player.getLocation(), resultItem);
                }
                // CONSUME ingredients using recipe-aware consume (fixes swapped-slot bugs)
                consumeIngredients(inv, resultItem);
                inv.setItem(16, ResultItemPH); // Replace with placeholder
            }
            event.setCancelled(true);
            return;
        }

        // Re-check crafting shortly after any click in the UI (keeps result updated)
        Bukkit.getScheduler().runTaskLater(plugin, () -> checkCrafting(inv), 1L);
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        if (!smithingUI.isSmithingUI(event.getInventory())) return;

        Inventory inv = event.getInventory();
        inv.setItem(16, ResultItemPH);
        // Use a repeating task to check crafting (every 5 ticks)
        Bukkit.getScheduler().runTaskTimer(plugin, () -> checkCrafting(inv), 0, 5);
    }

    private void checkCrafting(Inventory inv) {
        for (customRecipes recipe : plugin.getRecipes().values()) {
            if (recipe.matches(inv)) {
                inv.setItem(16, recipe.getResult());
                return;
            }
        }
        inv.setItem(16, ResultItemPH);
    }

    private void consumeIngredients(Inventory inv, ItemStack result) {
        for (customRecipes recipe : plugin.getRecipes().values()) {
            if (recipe.getResult().isSimilar(result)) {
                // Let recipe handle correct-slot consumption (handles swapped 10/11 and also consumes slot 12)
                recipe.consume(inv);
                break;
            }
        }
    }
}
