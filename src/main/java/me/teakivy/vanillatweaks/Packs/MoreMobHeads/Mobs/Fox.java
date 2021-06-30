package me.teakivy.vanillatweaks.Packs.MoreMobHeads.Mobs;

import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.event.entity.EntityDeathEvent;

public class Fox {
    public static void onDeath(EntityDeathEvent event) {
        org.bukkit.entity.Fox fox = (org.bukkit.entity.Fox) event.getEntity();
        if (fox.getFoxType() == org.bukkit.entity.Fox.Type.RED)
            if (!MobHeads.dropChance(event.getEntity().getKiller(), .10, .004)) return;
        else if (!MobHeads.dropChance(event.getEntity().getKiller(), .20, .004)) return;

        if (fox.getFoxType() == org.bukkit.entity.Fox.Type.RED)
            event.getDrops().add(MobHeads.getHead("Fox", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDdlMDA0MzExMWJjNTcwOTA4NTYyNTkxNTU1NzFjNzkwNmU3MDcwNDZkZjA0MWI4YjU3MjcwNGM0NTFmY2Q4MiJ9fX0"));
        else event.getDrops().add(MobHeads.getHead("Snow Fox", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDE0MzYzNzdlYjRjNGI0ZTM5ZmIwZTFlZDg4OTlmYjYxZWUxODE0YTkxNjliOGQwODcyOWVmMDFkYzg1ZDFiYSJ9fX0"));
    }
}
