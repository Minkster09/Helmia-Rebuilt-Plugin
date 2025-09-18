package hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodMeats;

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

public class foodMeats {

    // Store the player's Item Catalogue UI using a HashMap
    private static final Map<Player, Inventory> foodMeatsMap = new HashMap<>();

    // Utility method to handle color codes
    public static String color(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    // Method to open the Item Catalogue UI for a player
    public static void openFoodMeats(Player player) {

        Inventory foodMeatsInv = Bukkit.createInventory(player, 54, "Food - Meats");

        ItemStack border = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setHideTooltip(true); // Hides the tooltip
        border.setItemMeta(borderMeta);

        // Define border slots for the UI
        int[] borderSlots = {
                45, 46, 47, 50, 51, 52, 53
        };
        for (int slot : borderSlots) {
            foodMeatsInv.setItem(slot, border);
        }

        // Add the "Close" button at slot 49
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(color("&cClose"));
        close.setItemMeta(closeMeta);
        foodMeatsInv.setItem(49, close);

        // Add the "Go Back" button at slot 48
        ItemStack backButton = new ItemStack(Material.ARROW);
        ItemMeta backButtonMeta = backButton.getItemMeta();
        backButtonMeta.setDisplayName(color("&aGo Back"));
        backButtonMeta.setLore(Arrays.asList(
                color("&7To Item Catalogue")
        ));
        backButton.setItemMeta(backButtonMeta);
        foodMeatsInv.setItem(48, backButton);


        // Store the Item Catalogue UI for the player in the map
        foodMeatsMap.put(player, foodMeatsInv);

        // Open the inventory for the player
        player.openInventory(foodMeatsInv);
    }
    // Method to check if the given inventory is the player's Item Catalogue UI
    public static boolean isFoodMeats(Inventory inventory) {
        return foodMeatsMap.containsValue(inventory);
    }
}