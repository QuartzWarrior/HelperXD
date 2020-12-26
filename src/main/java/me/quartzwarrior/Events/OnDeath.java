package me.quartzwarrior.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        event.setDeathMessage(ChatColor.RED + player.getDisplayName() + ChatColor.RESET + " died while using a " + ChatColor.ITALIC + player.getClientBrandName() + ChatColor.RESET + " client");
    }
}
