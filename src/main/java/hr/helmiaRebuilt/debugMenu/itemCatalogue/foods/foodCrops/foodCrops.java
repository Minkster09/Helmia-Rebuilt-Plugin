package hr.helmiaRebuilt.debugMenu.itemCatalogue.foods.foodCrops;

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

public class foodCrops {

    // Store the player's Item Catalogue UI using a HashMap
    private static final Map<Player, Inventory> foodCropsMap = new HashMap<>();

    // Utility method to handle color codes
    public static String color(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    // Method to open the Item Catalogue UI for a player
    public static void openFoodCrops(Player player) {

        Inventory foodCropsInv = Bukkit.createInventory(player, 54, "Food - Crops");

        ItemStack border = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setHideTooltip(true); // Hides the tooltip
        border.setItemMeta(borderMeta);

        // Define border slots for the UI
        int[] borderSlots = {
                45, 46, 47, 50, 51, 52, 53
        };
            for (int slot : borderSlots) {
                foodCropsInv.setItem(slot, border);
            }

        // Add the "Close" button at slot 49
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(color("&cClose"));
        close.setItemMeta(closeMeta);
        foodCropsInv.setItem(49, close);

        // Add the "Go Back" button at slot 48
        ItemStack backButton = new ItemStack(Material.ARROW);
        ItemMeta backButtonMeta = backButton.getItemMeta();
        backButtonMeta.setDisplayName(color("&aGo Back"));
        backButtonMeta.setLore(Arrays.asList(
                color("&7To Item Catalogue")));
        backButton.setItemMeta(backButtonMeta);
        foodCropsInv.setItem(48, backButton);

        foodCropsInv.setItem(0, customItemManager.getCustomItem("rayyenara"));
        foodCropsInv.setItem(1, customItemManager.getCustomItem("honeyjuice"));
        foodCropsInv.setItem(2, customItemManager.getCustomItem("sourmouth"));
        foodCropsInv.setItem(3, customItemManager.getCustomItem("northmans_heart"));
        foodCropsInv.setItem(4, customItemManager.getCustomItem("hvaekan_berries"));
        foodCropsInv.setItem(5, customItemManager.getCustomItem("wheat"));
        foodCropsInv.setItem(6, customItemManager.getCustomItem("potato"));
        foodCropsInv.setItem(7, customItemManager.getCustomItem("carrot"));
        foodCropsInv.setItem(8, customItemManager.getCustomItem("pumpkin"));
        foodCropsInv.setItem(9, customItemManager.getCustomItem("garlic"));
        foodCropsInv.setItem(10, customItemManager.getCustomItem("lettuce"));
        foodCropsInv.setItem(11, customItemManager.getCustomItem("cauliflower"));
        foodCropsInv.setItem(12, customItemManager.getCustomItem("leek"));
        foodCropsInv.setItem(13, customItemManager.getCustomItem("green_grapes"));
        foodCropsInv.setItem(14, customItemManager.getCustomItem("beetroot"));
        foodCropsInv.setItem(15, customItemManager.getCustomItem("brown_mushroom"));
        foodCropsInv.setItem(16, customItemManager.getCustomItem("red_mushroom"));

        // Store the Item Catalogue UI for the player in the map
        foodCropsMap.put(player, foodCropsInv);

        // Open the inventory for the player
        player.openInventory(foodCropsInv);
    }
    // Method to check if the given inventory is the player's Item Catalogue UI
    public static boolean isFoodCrops(Inventory inventory) {
        return foodCropsMap.containsValue(inventory);
    }
}