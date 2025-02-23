package me.teakivy.teakstweaks.Packs.Experimental.ChunkLoaders;

import me.teakivy.teakstweaks.Main;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class Loader implements Listener {

    Main main = Main.getPlugin(Main.class);

    List<Location> loaded = new ArrayList<>();

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {
        Item item = event.getItemDrop();
        if (item.getItemStack().getType() == Material.NETHER_STAR) {
            new BukkitRunnable() {
                @Override
                public void run() {
                    Block block = item.getLocation().add(0, -1, 0).getBlock();
                    if (block.getType() == Material.LODESTONE) {
                        if (block.getChunk().isForceLoaded()) {
                            this.cancel();
                            return;
                        }
                        block.getLocation().getChunk().setForceLoaded(true);
                        AreaEffectCloud marker = (AreaEffectCloud) block.getWorld().spawnEntity(block.getLocation().add(.5, 1, .5), EntityType.AREA_EFFECT_CLOUD);
//
                        marker.setDuration(Integer.MAX_VALUE);
                        marker.setParticle(Particle.SUSPENDED);
                        marker.setWaitTime(0);
                        marker.setColor(Color.WHITE);
                        marker.setRadius(.001F);
                        marker.addScoreboardTag("vt_loaded");


                        if (main.getConfig().getBoolean("packs.chunk-loaders.show-particles")) {
                            marker.getWorld().spawnParticle(Particle.FLAME, item.getLocation(), 100, 0, 0, 0, .5);
                        }
                        item.remove();
                    }
                    if (event.getItemDrop().isDead() || event.getItemDrop().getItemStack().getAmount() != 1) this.cancel();
                }
            }.runTaskTimer(main, 1L, 20L);
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if (event.getBlock().getType() == Material.LODESTONE) {
            Block block = event.getBlock();
            for (Entity nearbyEntity : block.getWorld().getNearbyEntities(block.getLocation().add(.5, 1, .5), .1, .1, .1)) {
                if (nearbyEntity.getScoreboardTags().contains("vt_loaded") && nearbyEntity.getType() == EntityType.AREA_EFFECT_CLOUD) {
                    block.getLocation().getChunk().setForceLoaded(false);
                    nearbyEntity.remove();
                    return;
                }
            }
        }
    }

    public void unregister() {
        HandlerList.unregisterAll(this);
    }

}
