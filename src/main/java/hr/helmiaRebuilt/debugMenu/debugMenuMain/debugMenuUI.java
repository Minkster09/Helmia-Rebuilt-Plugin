package hr.helmiaRebuilt.debugMenu.debugMenuMain;

import hr.helmiaRebuilt.itemRegistry.customItemManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class debugMenuUI {

    // Store the player's debug menu using a HashMap
    private static final Map<Player, Inventory> debugMenuMap = new HashMap<>();

    // Utility method to handle color codes
    public static String color(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    // Method to open the Debug Menu for a player
    public static void openDebugMenuUI(Player player) {
        // Check if the player already has a debug menu in the map, otherwise create one
        Inventory debugMenuInv = Bukkit.createInventory(player, 54, "Debug Menu");

        // Create a single border ItemStack to be reused
        ItemStack border = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setHideTooltip(true);
        border.setItemMeta(borderMeta);

        // Set the border for all specified slots
        int[] borderSlots = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 26, 27, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
                48, 50, 51, 52, 53
        };
        for (int slot : borderSlots) {
            debugMenuInv.setItem(slot, border);
        }

        // Add the "Close" button at slot 49
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(color("&cClose"));
        close.setItemMeta(closeMeta);
        debugMenuInv.setItem(49, close);

        // Add the "Item Catalogue" button at slot 19
        ItemStack itemCatalogue = customItemManager.getCustomItem("rayyenara").clone();
        ItemMeta itemCatalogueMeta = itemCatalogue.getItemMeta();
        itemCatalogueMeta.setDisplayName(color("&6&lItem Catalogue"));
        itemCatalogueMeta.setLore(Arrays.asList(
                color("&eClick to Open!")));
        itemCatalogue.setItemMeta(itemCatalogueMeta);
        debugMenuInv.setItem(19, itemCatalogue);

        // Store the debug menu for the player in the map
        debugMenuMap.put(player, debugMenuInv);

        // Open the inventory for the player
        player.openInventory(debugMenuInv);
    }

    // Check if a given inventory is the player's Debug Menu
    public static boolean isDebugMenu(Inventory inventory) {
        return debugMenuMap.containsValue(inventory);
    }
}
