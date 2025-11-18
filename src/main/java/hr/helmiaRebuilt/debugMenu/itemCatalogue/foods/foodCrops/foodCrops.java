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
        //17 empty
        foodCropsInv.setItem(18, customItemManager.getCustomItem("pomegranate"));
        foodCropsInv.setItem(19, customItemManager.getCustomItem("hazelnut"));
        foodCropsInv.setItem(20, customItemManager.getCustomItem("radish"));
        //21 empty
        foodCropsInv.setItem(22, customItemManager.getCustomItem("blackberries"));
        foodCropsInv.setItem(23, customItemManager.getCustomItem("nettle"));
        foodCropsInv.setItem(24, customItemManager.getCustomItem("northern_sage"));
        foodCropsInv.setItem(25, customItemManager.getCustomItem("kaelons_tongue"));
        foodCropsInv.setItem(26, customItemManager.getCustomItem("everdew"));
        foodCropsInv.setItem(27, customItemManager.getCustomItem("poppy"));
        foodCropsInv.setItem(28, customItemManager.getCustomItem("rose_bush"));
        foodCropsInv.setItem(29, customItemManager.getCustomItem("dandelion"));
        foodCropsInv.setItem(30, customItemManager.getCustomItem("sunflower"));
        foodCropsInv.setItem(31, customItemManager.getCustomItem("cornflower"));
        foodCropsInv.setItem(32, customItemManager.getCustomItem("oxeye_daisy"));
        foodCropsInv.setItem(33, customItemManager.getCustomItem("azure_bluet"));
        foodCropsInv.setItem(34, customItemManager.getCustomItem("red_tulip"));
        foodCropsInv.setItem(35, customItemManager.getCustomItem("lilac"));
        foodCropsInv.setItem(36, customItemManager.getCustomItem("peony"));
        foodCropsInv.setItem(37, customItemManager.getCustomItem("orange_tulip"));
        foodCropsInv.setItem(38, customItemManager.getCustomItem("allium"));
        foodCropsInv.setItem(39, customItemManager.getCustomItem("pink_tulip"));
        foodCropsInv.setItem(40, customItemManager.getCustomItem("white_tulip"));
        foodCropsInv.setItem(41, customItemManager.getCustomItem("lily_of_the_valley"));
        foodCropsInv.setItem(42, customItemManager.getCustomItem("blue_orchid"));
        foodCropsInv.setItem(43, customItemManager.getCustomItem("wither_rose"));
        foodCropsInv.setItem(44, customItemManager.getCustomItem("torchflower"));

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