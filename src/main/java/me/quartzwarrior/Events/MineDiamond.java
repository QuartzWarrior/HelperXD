package me.quartzwarrior.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


public class MineDiamond implements Listener {
    @EventHandler
    void mineDiamond(BlockBreakEvent breakEvent){
        boolean item = breakEvent.getBlock().getType() == Material.DIAMOND_ORE;
        Player player = breakEvent.getPlayer();
        if (item){
            Bukkit.broadcastMessage(ChatColor.RED + player.getDisplayName() + ChatColor.RESET + " mined a" + ChatColor.ITALIC + ChatColor.BLUE + " Diamond");
        }

    }
}
