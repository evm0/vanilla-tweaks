package me.teakivy.vanillatweaks.Packs.MoreMobHeads.Mobs;

import me.teakivy.vanillatweaks.Packs.MoreMobHeads.MobHeads;
import org.bukkit.event.entity.EntityDeathEvent;

public class Spider {
        public static void onDeath(EntityDeathEvent event) {
            if (!MobHeads.dropChance(event.getEntity().getKiller(), .005, .001)) return;

            event.getDrops().add(MobHeads.getHead("Spider", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBjNDEwMDQ1Y2QzNzQ5YzNhOGVkODU2ZGY0MTFmNmMzM2U5YThhNmY5ZTU3ZTUyMTYwOGE4YWQ4ZWQ2ZWIzNyJ9fX0"));
        }
}
