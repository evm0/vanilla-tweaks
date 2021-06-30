package me.teakivy.vanillatweaks.Packs.SpectatorConduitPower;

import me.teakivy.vanillatweaks.Main;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.potion.PotionEffectType;

public class ConduitPower implements Listener {

    Main main = Main.getPlugin(Main.class);

    @EventHandler
    public void changeGameMode(PlayerGameModeChangeEvent event) {
        if (!main.getConfig().getBoolean("packs.spectator-conduit-power.enabled")) return;
        Player player = event.getPlayer();
        if (player.getGameMode().equals(GameMode.SPECTATOR)) {
            if (player.hasPotionEffect(PotionEffectType.CONDUIT_POWER)) {
                player.removePotionEffect(PotionEffectType.CONDUIT_POWER);
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD.toString() + ChatColor.BOLD + "VT" + ChatColor.GRAY + "] " + ChatColor.RED + "Conduit Power removed because of Game Mode change");
            }
        }
    }
}
