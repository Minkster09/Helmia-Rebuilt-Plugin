package hr.helmiaRebuilt.customSmithing.listeners;

import hr.helmiaRebuilt.customSmithing.smithingUI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.entity.Player;

public class smithingTableOpen implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Server server = Bukkit.getServer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Block block = event.getClickedBlock();
            if (block.getType() == Material.SMITHING_TABLE) {
                event.setCancelled(true);
                smithingUI.openSmithingUI(player);
            }
        }
    }
}