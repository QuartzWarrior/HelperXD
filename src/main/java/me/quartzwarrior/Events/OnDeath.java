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
        String Msg = event.getDeathMessage();
        event.setDeathMessage(Msg + " while using a " + ChatColor.ITALIC + player.getClientBrandName() + ChatColor.RESET + " client");
        player.sendMessage("Here are your death coords: " + player.getLocation().getBlockX() + ", " + player.getLocation().getBlockY() + ", " + player.getLocation().getBlockZ());
    }
}
