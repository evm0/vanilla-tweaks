package me.teakivy.vanillatweaks.Packs.CoordsHud;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class DisplayHud implements Listener {


    public static void showHud(Player player) {
        String display = ChatColor.GOLD + "XYZ: " + ChatColor.WHITE + Math.round(player.getLocation().getX()) + " " + Math.round(player.getLocation().getY()) + " " + Math.round(player.getLocation().getZ()) + "  " + ChatColor.GOLD + getDirection(player) + "      " + getWorldTime(player);
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(display));
    }


    public static String getDirection(Player player) {
        float direction = player.getLocation().getYaw();
        String directionString = "NA";

        if (direction <= -135 || direction >= 135) directionString = "N";
        if (direction <= 135 && direction >= 45) directionString = "W";
        if (direction >= -45 && direction <= 45) directionString = "S";
        if (direction <= -45 && direction >= -135) directionString = "E";

        return directionString;
    }

    public static String getWorldTime(Player player) {
        World world = player.getWorld();
        long ticks = world.getTime();
        int hours = Math.round(((ticks / 1000) + 6) % 24);
        int minutes = (int) Math.round((ticks % 1000 / 10) * 0.6);
        return String.format("%02d:%02d", hours, minutes);
    }

}
