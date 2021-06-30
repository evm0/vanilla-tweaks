package me.teakivy.vanillatweaks.Packs.MoreMobHeads.Mobs;

import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.event.entity.EntityDeathEvent;

public class Donkey {
    public static void onDeath(EntityDeathEvent event) {
        if (!MobHeads.dropChance(event.getEntity().getKiller(), .2, .09)) return;

        event.getDrops().add(MobHeads.getHead("Donkey", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUyNWVlOTI3M2FkNTc5ZDQ0YmY0MDZmNmY2Mjk1NTg2NDgxZWExOThmZDU3MjA3NmNkMGM1ODgyZGE3ZTZjYyJ9fX0"));
    }
}
