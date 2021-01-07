package me.quartzwarrior.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class OnSleep implements Listener {
    @EventHandler
    void onSleep(PlayerBedEnterEvent sleep){
        Player player = sleep.getPlayer();
        if (player.isSleeping()){
            if (player.getHealth() == 20){
                player.giveExp(1);
            }else{
                player.setHealth(player.getHealth() + 1);
            }


        }

    }
}
