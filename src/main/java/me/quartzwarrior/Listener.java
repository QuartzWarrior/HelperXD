package me.quartzwarrior;

import me.quartzwarrior.Commands.Feed;
import me.quartzwarrior.Commands.GodMode;
import me.quartzwarrior.Events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Listener extends JavaPlugin implements org.bukkit.event.Listener {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("HelperXD is starting...");
        getServer().getPluginManager().registerEvents(new OnSleep(), this);
        getServer().getPluginManager().registerEvents(new MineDebris(), this);
        getServer().getPluginManager().registerEvents(new MineDiamond(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getCommand("godmode").setExecutor(new GodMode());
        getCommand("feed").setExecutor(new Feed());
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("HelperXD has stopped");
    }
}
