package me.teakivy.teakstweaks.Packs.Survival.WorkstationHighlights;

import me.teakivy.teakstweaks.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Highlighter implements Listener {

    static Main main = Main.getPlugin(Main.class);

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntity().getScoreboardTags().contains("vt_glowing")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDeath(EntityDeathEvent event) {
        if (event.getEntity().getScoreboardTags().contains("vt_glowing")) {
            event.getDrops().clear();
        }
    }

    public static void glowingBlock(Location loc, int glowLength) {
        LivingEntity entity = (LivingEntity) loc.getWorld().spawnEntity(loc, EntityType.SHULKER);
        entity.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, glowLength, 0, true, false));
        entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, glowLength, 0, true, false));
        entity.setAI(false);
        entity.setInvulnerable(true);
        entity.addScoreboardTag("vt_glowing");


        Bukkit.getScheduler().scheduleSyncDelayedTask(main, () -> {
            entity.remove();
        }, (long) glowLength);
    }

    public void unregister() {
        HandlerList.unregisterAll(this);
    }

}
