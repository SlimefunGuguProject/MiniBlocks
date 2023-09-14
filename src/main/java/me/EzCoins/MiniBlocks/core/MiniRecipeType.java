package me.EzCoins.MiniBlocks.core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.EzCoins.MiniBlocks.MiniBlocks;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MiniRecipeType {

    private MiniRecipeType() {}

    public static final RecipeType BlockReducer =
            new RecipeType(new NamespacedKey(MiniBlocks.plugin, "BLOCKREDUCER"),
                    new SlimefunItemStack(
                            "BLOCKREDUCER",
                            Material.STONECUTTER,
                            "&9方块缩小器"),
                            "",
                            "&7将方块转换为",
                            "&7小型版本。");

}
