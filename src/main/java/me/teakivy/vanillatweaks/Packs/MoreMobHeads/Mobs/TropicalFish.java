package me.teakivy.vanillatweaks.Packs.MoreMobHeads.Mobs;

import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.event.entity.EntityDeathEvent;

public class TropicalFish {
    public static void onDeath(EntityDeathEvent event) {
        if (!MobHeads.dropChance(event.getEntity().getKiller(), .1, .01)) return;

        event.getDrops().add(MobHeads.getHead("Tropical Fish", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRhMGM4NGRjM2MwOTBkZjdiYWZjNDM2N2E5ZmM2Yzg1MjBkYTJmNzNlZmZmYjgwZTkzNGQxMTg5ZWFkYWM0MSJ9fX0"));
    }
}
