package me.quartzwarrior.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.getHealth() == 20){
                player.giveExp(1);
            }else{
                player.setFoodLevel(20);
            }
        }else{
            Bukkit.getLogger().info("You need to be a player to execute this command.");
        }


        return false;
    }
}