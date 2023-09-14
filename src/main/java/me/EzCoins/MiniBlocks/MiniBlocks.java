package me.EzCoins.MiniBlocks;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.EzCoins.MiniBlocks.core.Groups;
import me.EzCoins.MiniBlocks.itemsetup.ItemSetup;
import me.EzCoins.MiniBlocks.utils.CustomHead;
import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public final class MiniBlocks extends AbstractAddon implements SlimefunAddon {

    public static MiniBlocks plugin;

    public MiniBlocks(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
            "SlimefunGuguProject", "MiniBlocks", "master", "auto-update");
    }

    public MiniBlocks() {
        super("SlimefunGuguProject", "MiniBlocks", "master", "auto-update");
    }

    public static MiniBlocks getInstance() {
        return plugin;
    }

    @Override
    protected void enable() {
        plugin = this;
        getLogger().info("------------------------");
        getLogger().info("|         MiniBlocks ~ EzCoins          |");
        getLogger().info("------------------------");

        CustomHead.setupHead();


        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "MiniBlocks", "master");
        }

        int pluginId = 15867;
        Metrics metrics = new Metrics(this, pluginId);

        Groups.setup(this);
        ItemSetup.setup(this);
    }

    @Override
    public void disable() {
        getLogger().info("正在禁用插件...");
    }

}


