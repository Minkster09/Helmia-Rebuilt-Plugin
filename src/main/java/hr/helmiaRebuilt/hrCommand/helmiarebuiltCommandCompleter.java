package hr.helmiaRebuilt.hrCommand;

import hr.helmiaRebuilt.itemRegistry.customItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class helmiarebuiltCommandCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        List<String> completions = new ArrayList<>();

        // Ensure the command sender is a player
        if (!(sender instanceof Player)) {
            return completions; // Only players can use this command
        }

        if (args.length == 1) {
            completions.add("item");
            completions.add("smithingmenu");
            completions.add("debugmenu");
            completions.add("brewdata");

        } else if (args.length == 2) {
            // Fetch custom items for completion
            if (args[0].equalsIgnoreCase("item")) { // Only show items if the first argument is "item"
                for (String customItemName : customItemManager.getCustomItems().keySet()) {
                    // If the custom item name starts with the current input, add it to completions
                    if (customItemName.startsWith(args[1].toLowerCase())) {
                        completions.add(customItemName);
                    }
                }
            }
        }
        return completions;
    }
}
