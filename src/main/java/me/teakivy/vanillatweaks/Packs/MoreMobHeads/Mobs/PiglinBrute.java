package me.teakivy.vanillatweaks.Packs.MoreMobHeads.Mobs;

import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.event.entity.EntityDeathEvent;

public class PiglinBrute {
    public static void onDeath(EntityDeathEvent event) {
        if (!MobHeads.dropChance(event.getEntity().getKiller(), .1, .01)) return;

        event.getDrops().add(MobHeads.getHead("Piglin Brute", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQ4ODc5OWM4M2VjYjI5NDUyY2ViYTg5YzNjMDA5OTIxOTI3NGNlNWIyYmZiOGFkMGIzZWE0YzY1ZmFjNDYzMCJ9fX0"));
    }
}
