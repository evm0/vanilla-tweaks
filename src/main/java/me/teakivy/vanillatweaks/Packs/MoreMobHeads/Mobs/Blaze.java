package me.teakivy.vanillatweaks.Packs.MoreMobHeads.Mobs;

import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.event.entity.EntityDeathEvent;

public class Blaze {

    public static void onDeath(EntityDeathEvent event) {
        if (!MobHeads.dropChance(event.getEntity().getKiller(), .005, .0005)) return;

        event.getDrops().add(MobHeads.getHead("Blaze", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVlMjNkYzdhMTBjNmE4N2VmOTM3NDU0YzBlOTRlZDQyYzIzYWE2NDFhOTFlZDg0NzBhMzA0MmQwNWM1MmM1MiJ9fX0"));
    }

}
