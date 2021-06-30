package me.teakivy.vanillatweaks.Commands;

import me.teakivy.vanillatweaks.Main;
import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class testCommand implements CommandExecutor {

    Main main = Main.getPlugin(Main.class);

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("test")) {
            double chance = .1;
//            if (main.getConfig().getBoolean("test-mode")) return true;
            Random rand = new Random();
            double num = rand.nextDouble();
            if (num < chance) sender.sendMessage("true: " + num);
            else sender.sendMessage("false: " + num);
        }
        return false;
    }
}
