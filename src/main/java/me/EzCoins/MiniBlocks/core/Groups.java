package me.EzCoins.MiniBlocks.core;

import me.EzCoins.MiniBlocks.MiniBlocks;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.EzCoins.MiniBlocks.utils.GUIHeads;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Groups {



    private Groups() {
    }

    public static final NestedItemGroup MAINMINIBLOCK = new NestedItemGroup(new NamespacedKey(MiniBlocks.getInstance(), "mainMiniBlocks"),
            new CustomItemStack(GUIHeads.MAIN_GROUP.getPlayerHead(), "&e迷你方块"));

    public static final ItemGroup BLOCKS = new SubItemGroup(
            new NamespacedKey(MiniBlocks.getInstance(), "MiniBlocksBlocks"), MAINMINIBLOCK,
            new CustomItemStack(GUIHeads.BLOCKS_GROUP.getPlayerHead(), "&7方块"), 1
    );

    public static final ItemGroup MACHINES = new SubItemGroup(
            new NamespacedKey(MiniBlocks.getInstance(), "MiniBlocksMachines"), MAINMINIBLOCK,
            new CustomItemStack(Material.FURNACE_MINECART, "&7机器"), 2
    );

    public static final ItemGroup SYNTHETIC = new SubItemGroup(
            new NamespacedKey(MiniBlocks.getInstance(), "MiniBlocksSynthetic"), MAINMINIBLOCK,
            new CustomItemStack(Material.PURPLE_DYE, "&7合成资源"), 3
    );


    public static void setup(MiniBlocks inst) {
    }

}