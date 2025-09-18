package hr.helmiaRebuilt.customSmithing;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;

public class customRecipes {
    private final Map<Integer, ItemStack> ingredients;
    private final ItemStack result;

    public customRecipes(Map<Integer, ItemStack> ingredients, ItemStack result) {
        this.ingredients = ingredients;
        this.result = result;
    }

    public ItemStack getResult() {
        return result;
    }

    public Map<Integer, ItemStack> getIngredients() {
        return ingredients;
    }

    public boolean matches(Inventory inv) {
        // Check if the inventory has the correct ingredients
        for (Map.Entry<Integer, ItemStack> entry : ingredients.entrySet()) {
            int slot = entry.getKey();
            ItemStack requiredItem = entry.getValue();
            ItemStack currentItem = inv.getItem(slot);

            // Handle null requiredItem (empty slot in recipe)
            if (requiredItem == null) {
                if (currentItem != null && currentItem.getType() != null && !currentItem.getType().isAir()) {
                    return false; // Expected empty slot, but found an item
                }
                continue; // Continue checking other slots
            }

            // Check if currentItem is null or doesn't match the requiredItem
            if (currentItem == null || !isItemEqual(currentItem, requiredItem)) {
                return false; // Required item not found or does not match
            }

            // Check for stack size
            if (currentItem.getAmount() < requiredItem.getAmount()) {
                return false; // Not enough items in the current slot
            }
        }
        return true; // All required items matched
    }

    private boolean isItemEqual(ItemStack item, ItemStack requiredItem) {
        // If either item or requiredItem is null, return false (they can't be equal)
        if (item == null || requiredItem == null) {
            return false;
        }

        // Check if the material type is the same
        if (!item.getType().equals(requiredItem.getType())) {
            return false; // Different material
        }

        // Compare the metadata (display name, lore, etc.)
        ItemMeta itemMeta = item.getItemMeta();
        ItemMeta requiredMeta = requiredItem.getItemMeta();

        if (requiredMeta != null && itemMeta != null) {
            // Check display name
            if (requiredMeta.hasDisplayName() && !requiredMeta.getDisplayName().equals(itemMeta.getDisplayName())) {
                return false; // Display name doesn't match
            }

            // Check lore
            if (requiredMeta.hasLore() && !requiredMeta.getLore().equals(itemMeta.getLore())) {
                return false; // Lore doesn't match
            }

            // Check custom model data if present
            if (requiredMeta.hasCustomModelData() && requiredMeta.getCustomModelData() != itemMeta.getCustomModelData()) {
                return false; // Custom model data doesn't match
            }
        } else if (requiredMeta != null || itemMeta != null) {
            return false; // One has meta while the other doesn't
        }

        return true; // All checks passed
    }
}
