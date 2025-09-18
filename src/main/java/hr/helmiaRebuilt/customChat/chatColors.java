package hr.helmiaRebuilt.customChat;

import hr.helmiaRebuilt.colorUtilities.colorUtilities;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatColors implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        // Get the raw message from the player
        String rawMessage = event.getMessage();

        // Use HexColorUtil to parse the colors
        String formattedMessage = colorUtilities.parseColors(rawMessage);

        // Check if the parsed message contains any visible content
        if (formattedMessage == null || formattedMessage.replaceAll("§.", "").trim().isEmpty()) {
            // Cancel the event to prevent sending a blank or color-only message
            event.setCancelled(true);
            return;
        }

        // Format the final chat message with the player's name
        event.setFormat(event.getPlayer().getName() + ": " + formattedMessage);
    }
}



