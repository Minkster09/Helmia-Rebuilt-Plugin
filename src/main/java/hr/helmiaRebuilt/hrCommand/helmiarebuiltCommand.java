package hr.helmiaRebuilt.hrCommand;

import hr.helmiaRebuilt.debugMenu.debugMenuMain.debugMenuUI;
import hr.helmiaRebuilt.itemRegistry.customItemManager;
import hr.helmiaRebuilt.customSmithing.smithingUI;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

public class helmiarebuiltCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Ensure the command sender is a player
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
            return true;
        }

        Player player = (Player) sender;

        // Check for subcommands
        if (args.length > 0) {
            return switch (args[0].toLowerCase()) {
                case "item" -> handleItemCommand(player, args);
                case "smithingmenu" -> handleSmithingCommand(player);
                case "debugmenu" -> handleDebugMenuCommand(player);
                case "brewdata" -> handleBrewDataCommand(player);
                default -> {
                    player.sendMessage(ChatColor.RED + "Unknown Command");
                    yield true;
                }
            };
        } else {
            player.sendMessage(ChatColor.RED + "Usage: /hr <function>");
            return true;
        }
    }

    private boolean handleItemCommand(Player player, String[] args) {
        // Ensure correct usage
        if (args.length != 2) {
            player.sendMessage(ChatColor.RED + "Usage: /hr item <item-name>");
            return true;
        }

        String itemName = args[1].toLowerCase(); // Get the item name from the second argument

        // Fetch the custom item from the catalogue
        ItemStack customItem = customItemManager.getCustomItem(itemName);

        if (customItem == null) {
            player.sendMessage(ChatColor.RED + "That item does not exist.");
            return true;
        }

        // Give the item to the player
        player.getInventory().addItem(customItem);
        String customItemName = customItem.getItemMeta().getDisplayName();
        customItemName = ChatColor.stripColor(customItemName);
        player.sendMessage(ChatColor.GREEN + "You have received: " + ChatColor.GREEN + customItemName);
        return true;
    }

    private boolean handleSmithingCommand(Player player) {
        smithingUI.openSmithingUI(player);
        return true;
    }

    private boolean handleDebugMenuCommand(Player player) {
        debugMenuUI.openDebugMenuUI(player);
        return true;
    }

    private boolean handleBrewDataCommand(Player player) {
        NamespacedKey key = new NamespacedKey("brewery", "brewdata");

        ItemStack heldItem = player.getInventory().getItemInMainHand();

        // Check if the item is valid
        if (heldItem == null || !heldItem.hasItemMeta()) {
            player.sendMessage(ChatColor.RED + "This item has no brewdata.");
            return true;
        }

        ItemMeta meta = heldItem.getItemMeta();
        PersistentDataContainer container = meta.getPersistentDataContainer();

        // Check if the item has the required data
        if (container.has(key, PersistentDataType.BYTE_ARRAY)) {
            byte[] brewdata = container.get(key, PersistentDataType.BYTE_ARRAY);
            player.sendMessage(ChatColor.GREEN + "The brewdata for this item is:");
            player.sendMessage(Arrays.toString(brewdata));
        } else {
            player.sendMessage(ChatColor.RED + "This item has no brewdata.");
        }
        return true;
    }
}

