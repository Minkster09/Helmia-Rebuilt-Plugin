package hr.helmiaRebuilt.customSmithing;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class smithingUI {
    private static final Map<Player, Inventory> smithingUI = new HashMap<>();

    public static void openSmithingUI(Player player) {
        // Create the UI
        Inventory SmithingUI = Bukkit.createInventory(player, 27, "Smithing Table");

        // Create the border item
        ItemStack border = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setHideTooltip(true);
        border.setItemMeta(borderMeta);

        // Apply border to specific slots
        int[] borderSlots = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        for (int slot : borderSlots) {
            SmithingUI.setItem(slot, border);
        }

        // Store the player's smithing UI in the map
        smithingUI.put(player, SmithingUI);

        // Opens the menu
        player.openInventory(SmithingUI);
    }

    // Method to check if the inventory belongs to the Smithing UI
    public static boolean isSmithingUI(Inventory inventory) {
        return smithingUI.containsValue(inventory);
    }
}
