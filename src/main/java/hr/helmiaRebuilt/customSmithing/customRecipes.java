package hr.helmiaRebuilt.customSmithing;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class customRecipes {
    private final Map<Integer, ItemStack> ingredients;
    private final ItemStack result;

    public customRecipes(Map<Integer, ItemStack> ingredients, ItemStack result) {
        this.ingredients = ingredients;
        this.result = result;
    }

    public ItemStack getResult() {
        return result == null ? null : result.clone();
    }

    public Map<Integer, ItemStack> getIngredients() {
        return ingredients;
    }

    /**
     * Returns true if this recipe matches the given inventory.
     * (Uses getIngredientToInventorySlotMapping under the hood.)
     */
    public boolean matches(Inventory inv) {
        return getIngredientToInventorySlotMapping(inv) != null;
    }

    /**
     * If the recipe matches this inventory, returns a mapping from recipe-slot -> actual inventory-slot.
     * Example: {10->10, 11->11, 12->12} for normal orientation
     *          {10->11, 11->10, 12->12} for swapped orientation
     * Returns null if the recipe doesn't match.
     */
    public Map<Integer, Integer> getIngredientToInventorySlotMapping(Inventory inv) {
        // required items per recipe slots (may be null meaning "expected empty")
        ItemStack required10 = ingredients.get(10);
        ItemStack required11 = ingredients.get(11);
        ItemStack required12 = ingredients.get(12);

        // actual inventory stacks
        ItemStack stack10 = inv.getItem(10);
        ItemStack stack11 = inv.getItem(11);
        ItemStack stack12 = inv.getItem(12);

        // Check slot 12 (fixed) first
        if (!slotMatchesRequirement(stack12, required12) || !amountSufficient(stack12, required12)) {
            return null; // slot 12 must match exactly (and have enough amount if required)
        }

        // Check normal orientation: 10->10 and 11->11
        boolean normal10 = slotMatchesRequirement(stack10, required10) && amountSufficient(stack10, required10);
        boolean normal11 = slotMatchesRequirement(stack11, required11) && amountSufficient(stack11, required11);

        if (normal10 && normal11) {
            Map<Integer, Integer> mapping = new HashMap<>();
            mapping.put(10, 10);
            mapping.put(11, 11);
            mapping.put(12, 12);
            return mapping;
        }

        // Check swapped orientation: 10->11 and 11->10
        boolean swapped10 = slotMatchesRequirement(stack10, required11) && amountSufficient(stack10, required11);
        boolean swapped11 = slotMatchesRequirement(stack11, required10) && amountSufficient(stack11, required10);

        if (swapped10 && swapped11) {
            Map<Integer, Integer> mapping = new HashMap<>();
            mapping.put(10, 11); // recipe slot 10 comes from inventory slot 11
            mapping.put(11, 10); // recipe slot 11 comes from inventory slot 10
            mapping.put(12, 12);
            return mapping;
        }

        return null; // no valid orientation found
    }

    /**
     * Consume required ingredient amounts from the inventory according to matching orientation.
     * If there is no match right now, does nothing.
     */
    public void consume(Inventory inv) {
        Map<Integer, Integer> mapping = getIngredientToInventorySlotMapping(inv);
        if (mapping == null) return; // nothing to consume

        for (Map.Entry<Integer, ItemStack> entry : ingredients.entrySet()) {
            int recipeSlot = entry.getKey();
            ItemStack required = entry.getValue();
            if (required == null) continue; // nothing required for this slot

            Integer invSlot = mapping.get(recipeSlot);
            if (invSlot == null) continue; // defensive

            ItemStack current = inv.getItem(invSlot);
            if (current == null) continue; // nothing to remove (shouldn't happen if matched)

            int newAmount = current.getAmount() - required.getAmount();
            if (newAmount <= 0) {
                inv.setItem(invSlot, null);
            } else {
                ItemStack clone = current.clone();
                clone.setAmount(newAmount);
                inv.setItem(invSlot, clone);
            }
        }
    }

    /* ---------- helper utilities ---------- */

    // If required == null => expects empty slot (allowed). Otherwise check isSimilar.
    private boolean slotMatchesRequirement(ItemStack provided, ItemStack required) {
        if (required == null) {
            return provided == null || provided.getType().isAir();
        }
        if (provided == null) return false;
        return provided.isSimilar(required);
    }

    // Amount check: if required == null => OK. Else provided must have >= required amount.
    private boolean amountSufficient(ItemStack provided, ItemStack required) {
        if (required == null) return true;
        if (provided == null) return false;
        return provided.getAmount() >= required.getAmount();
    }
}
