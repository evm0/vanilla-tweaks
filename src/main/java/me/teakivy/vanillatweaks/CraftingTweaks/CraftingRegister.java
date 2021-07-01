package me.teakivy.vanillatweaks.CraftingTweaks;

import me.teakivy.vanillatweaks.CraftingTweaks.Recipes.*;
import me.teakivy.vanillatweaks.Main;

public class CraftingRegister {

    static Main main = Main.getPlugin(Main.class);

    public static void register() {
        if (main.getConfig().getBoolean("crafting-tweaks.back-to-blocks.enabled"))
            BackToBlocks.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.double-slabs.enabled"))
            DoubleSlabs.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.dropper-to-dispenser.enabled"))
            DropperToDispenser.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.rotten-flesh-to-leather.enabled"))
            RottenFleshToLeather.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.charcoal-to-black-dye.enabled"))
            CharcoalToBlackDye.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.coal-to-black-dye.enabled"))
            CoalToBlackDye.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.sandstone-dyeing.enabled"))
            SandstoneDyeing.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.universal-dyeing.enabled"))
            UniversalDyeing.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.straight-to-shapeless.enabled"))
            StraightToShapeless.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.blackstone-cobblestone.enabled"))
            BlackstoneCobblestone.registerRecipes();
        if (main.getConfig().getBoolean("crafting-tweaks.powder-to-glass.enabled"))
            PowderToGlass.registerRecipes();

    }

}
