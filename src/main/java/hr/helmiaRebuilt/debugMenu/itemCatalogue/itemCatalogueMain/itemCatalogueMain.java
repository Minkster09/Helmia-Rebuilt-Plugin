package hr.helmiaRebuilt.debugMenu.itemCatalogue.itemCatalogueMain;

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

public class itemCatalogueMain {

    // Store the player's Item Catalogue UI using a HashMap
    private static final Map<Player, Inventory> itemCatalogueMap = new HashMap<>();

    // Utility method to handle color codes
    public static String color(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    // Method to open the Item Catalogue UI for a player
    public static void openItemCatalogueMain(Player player) {
        // Creates the UI
        Inventory itemCatalogueInv = Bukkit.createInventory(player, 54, "Item Catalogue");

        // Create a single border ItemStack to be reused
        ItemStack border = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setHideTooltip(true); // Hides the tooltip
        border.setItemMeta(borderMeta);

        // Define border slots for the UI
        int[] borderSlots = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45,
                46, 47, 50, 51, 52, 53
        };
        for (int slot : borderSlots) {
            itemCatalogueInv.setItem(slot, border);
        }

        // Add the "Close" button at slot 49
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(color("&cClose"));
        close.setItemMeta(closeMeta);
        itemCatalogueInv.setItem(49, close);

        // Add the "Go Back" button at slot 48
        ItemStack backButton = new ItemStack(Material.ARROW);
        ItemMeta backButtonMeta = backButton.getItemMeta();
        backButtonMeta.setDisplayName(color("&aGo Back"));
        backButtonMeta.setLore(Arrays.asList(
                color("&7To Debug Menu")
        ));
        backButton.setItemMeta(backButtonMeta);
        itemCatalogueInv.setItem(48, backButton);

        //Category Titles
        ItemStack foodsTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta foodsTitleMeta = foodsTitle.getItemMeta();
        foodsTitleMeta.setDisplayName(color("&a&lFoods"));
        foodsTitle.setItemMeta(foodsTitleMeta);
        itemCatalogueInv.setItem(10, foodsTitle);

        ItemStack alcoholTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta alcoholTitleMeta = alcoholTitle.getItemMeta();
        alcoholTitleMeta.setDisplayName(color("&a&lAlcohol"));
        alcoholTitle.setItemMeta(alcoholTitleMeta);
        itemCatalogueInv.setItem(11, alcoholTitle);

        ItemStack itemsTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta itemsTitleMeta = itemsTitle.getItemMeta();
        itemsTitleMeta.setDisplayName(color("&a&lItems"));
        itemsTitle.setItemMeta(itemsTitleMeta);
        itemCatalogueInv.setItem(12, itemsTitle);

        ItemStack clothingTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta clothingTitleMeta = clothingTitle.getItemMeta();
        clothingTitleMeta.setDisplayName(color("&a&lClothing"));
        clothingTitle.setItemMeta(clothingTitleMeta);
        itemCatalogueInv.setItem(13, clothingTitle);

        ItemStack armourTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta armourTitleMeta = armourTitle.getItemMeta();
        armourTitleMeta.setDisplayName(color("&a&lArmour"));
        armourTitle.setItemMeta(armourTitleMeta);
        itemCatalogueInv.setItem(14, armourTitle);

        ItemStack weaponsTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta weaponsTitleMeta = weaponsTitle.getItemMeta();
        weaponsTitleMeta.setDisplayName(color("&a&lWeapons"));
        weaponsTitle.setItemMeta(weaponsTitleMeta);
        itemCatalogueInv.setItem(15, weaponsTitle);

        ItemStack miscTitle = new ItemStack(Material.OAK_SIGN);
        ItemMeta miscTitleMeta = miscTitle.getItemMeta();
        miscTitleMeta.setDisplayName(color("&a&lMiscellaneous"));
        miscTitle.setItemMeta(miscTitleMeta);
        itemCatalogueInv.setItem(16, miscTitle);

        //Categories
        ItemStack crops = customItemManager.getCustomItem("rayyenara").clone();
        ItemMeta cropsMeta = crops.getItemMeta();
        cropsMeta.setDisplayName(color("&6&lFood - Crops"));
        cropsMeta.setLore(Arrays.asList(
                color("&eClick to Open!")
        ));
        crops.setItemMeta(cropsMeta);
        itemCatalogueInv.setItem(19, crops);

        ItemStack meats = customItemManager.getCustomItem("salted_venison").clone();
        ItemMeta meatsMeta = meats.getItemMeta();
        meatsMeta.setDisplayName(color("&6&lFood - Meats"));
        meatsMeta.setLore(Arrays.asList(
                color("&eClick to Open!")
        ));
        meats.setItemMeta(meatsMeta);
        itemCatalogueInv.setItem(28, meats);

        ItemStack dishes = customItemManager.getCustomItem("vhagaryan_loaf").clone();
        ItemMeta dishesMeta = dishes.getItemMeta();
        dishesMeta.setDisplayName(color("&6&lFood - Dishes"));
        dishesMeta.setLore(Arrays.asList(
                color("&eClick to Open!")
        ));
        dishes.setItemMeta(dishesMeta);
        itemCatalogueInv.setItem(37, dishes);

        // Store the Item Catalogue UI for the player in the map
        itemCatalogueMap.put(player, itemCatalogueInv);

        // Open the inventory for the player
        player.openInventory(itemCatalogueInv);
    }

    // Method to check if the given inventory is the player's Item Catalogue UI
    public static boolean isItemCatalogue(Inventory inventory) {
        return itemCatalogueMap.containsValue(inventory);
    }
}
