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
        if (smithingUI.isSmithingUI(event.getInventory())) {
            Player player = (Player) event.getWhoClicked();
            Inventory inv = event.getInventory();

            // List of unmovable slots (add the result slot, 16, as unmovable when it contains flint)
            int[] unmovableSlots = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

            // Check if the clicked slot is unmovable
            for (int slot : unmovableSlots) {
                if (event.getSlot() == slot) {
                    if (event.getSlot() == event.getRawSlot()) {
                        event.setCancelled(true);
                        return; // Exit if the clicked slot is unmovable
                    }
                }
            }

            // Prevent moving flint from the result slot unless it's a valid result item
            if (event.getRawSlot() == 16) {
                ItemStack resultItem = inv.getItem(16);
                if (resultItem != null && resultItem.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Result Item")) {
                    event.setCancelled(true); // Prevent taking flint
                    return;
                }
                if (resultItem != null) {
                    // Check if the player's inventory is full
                    if (player.getInventory().firstEmpty() != -1) {
                        player.getInventory().addItem(resultItem);
                        consumeIngredients(inv, resultItem); // Consume the ingredients used for crafting
                    } else {
                        player.getWorld().dropItemNaturally(player.getLocation(), resultItem); // Drop on the ground if inventory is full
                        consumeIngredients(inv, resultItem); // Consume the ingredients used for crafting
                    }
                    inv.setItem(16, ResultItemPH); // Immediately replace with flint after the item is taken
                }
                event.setCancelled(true); // Prevent taking the result item directly by clicking
                return;
            }
            // Check crafting whenever an item is clicked
            checkCrafting(inv);
        }
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        if (smithingUI.isSmithingUI(event.getInventory())) {
            Inventory inv = event.getInventory();
            inv.setItem(16, ResultItemPH); // Set the default flint in the result slot when inventory is opened
            // Use a repeating task to check crafting
            Bukkit.getScheduler().runTaskTimer(plugin, () -> checkCrafting(inv), 0, 1); // Check every tick (20 times a second)
        }
    }

    private void checkCrafting(Inventory inv) {
        // Check all registered recipes for a match using the entire inventory
        for (customRecipes recipe : plugin.getRecipes().values()) {
            if (recipe.matches(inv)) { // Ensure this matches method uses the inventory
                inv.setItem(16, recipe.getResult()); // Place result in the result slot
                return; // Exit after finding a valid recipe
            }
        }
        inv.setItem(16, ResultItemPH); // Set flint in the result slot if no valid recipe
    }

    private void consumeIngredients(Inventory inv, ItemStack result) {
        for (customRecipes recipe : plugin.getRecipes().values()) {
            if (recipe.getResult().isSimilar(result)) {
                Map<Integer, ItemStack> ingredients = recipe.getIngredients();
                boolean allIngredientsConsumed = true; // Track if all ingredients were consumed

                for (Map.Entry<Integer, ItemStack> entry : ingredients.entrySet()) {
                    int slot = entry.getKey();
                    ItemStack requiredItem = entry.getValue();
                    ItemStack currentItem = inv.getItem(slot);

                    // Skip if the required item is null (empty slot in recipe)
                    if (requiredItem == null) {
                        continue;
                    }

                    if (currentItem != null && currentItem.getType() != Material.AIR) {
                        int newAmount = currentItem.getAmount() - requiredItem.getAmount();

                        // Ensure the required amount is available
                        if (newAmount < 0) {
                            allIngredientsConsumed = false; // Not enough items
                            break; // Exit if not enough items
                        } else if (newAmount == 0) {
                            inv.setItem(slot, null); // Remove item if amount goes to 0
                        } else {
                            currentItem.setAmount(newAmount); // Update item amount
                        }
                    } else {
                        allIngredientsConsumed = false; // Ingredient not found
                        break; // Exit if the item was not found
                    }
                }

                // If all ingredients were consumed correctly
                if (allIngredientsConsumed) {
                    break; // Exit after consuming the ingredients
                }
            }
        }
    }
}