package me.teakivy.teakstweaks.Packs.Utilities.SpectatorNightVision;

import me.teakivy.teakstweaks.Main;
import me.teakivy.teakstweaks.Utils.MessageHandler;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.potion.PotionEffectType;

public class NightVision implements Listener {

    Main main = Main.getPlugin(Main.class);

    @EventHandler
    public void changeGameMode(PlayerGameModeChangeEvent event) {
        if (!main.getConfig().getBoolean("packs.spectator-night-vision.enabled")) return;
        Player player = event.getPlayer();
        if (player.getGameMode().equals(GameMode.SPECTATOR)) {
            if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                player.sendMessage(MessageHandler.getMessage("pack.spectator-conduit-power.game-mode-change"));
            }
        }
    }

    public void unregister() {
        HandlerList.unregisterAll(this);
    }

}
