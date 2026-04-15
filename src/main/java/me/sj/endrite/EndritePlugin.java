package me.sj.endrite;

import org.bukkit.plugin.java.JavaPlugin;

public final class EndritePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Endrite Enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Endrite Disabled");
    }
}
