package me.teakivy.teakstweaks.Packs.Mobs.MoreMobHeads;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.teakivy.teakstweaks.Main;
import me.teakivy.teakstweaks.Packs.Mobs.MoreMobHeads.Mobs.*;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class MobHeads implements Listener {

    static Main main = Main.getPlugin(Main.class);

    static Map<EntityType, Method> mobs = new HashMap<>();
    static {
        try {
            Class<?>[] args = new Class[1];
            args[0] = EntityDeathEvent.class;

            mobs.put(EntityType.AXOLOTL, Axolotl.class.getMethod("onDeath", args));
            mobs.put(EntityType.BAT, Bat.class.getMethod("onDeath", args));
            mobs.put(EntityType.BEE, Bee.class.getMethod("onDeath", args));
            mobs.put(EntityType.BLAZE, Blaze.class.getMethod("onDeath", args));
            mobs.put(EntityType.CAT, Cat.class.getMethod("onDeath", args));
            mobs.put(EntityType.CAVE_SPIDER, CaveSpider.class.getMethod("onDeath", args));
            mobs.put(EntityType.CHICKEN, Chicken.class.getMethod("onDeath", args));
            mobs.put(EntityType.COD, Cod.class.getMethod("onDeath", args));
            mobs.put(EntityType.COW, Cow.class.getMethod("onDeath", args));
            mobs.put(EntityType.CREEPER, Creeper.class.getMethod("onDeath", args));
            mobs.put(EntityType.DOLPHIN, Dolphin.class.getMethod("onDeath", args));
            mobs.put(EntityType.DONKEY, Donkey.class.getMethod("onDeath", args));
            mobs.put(EntityType.DROWNED, Drowned.class.getMethod("onDeath", args));
            mobs.put(EntityType.ELDER_GUARDIAN, ElderGuardian.class.getMethod("onDeath", args));
            mobs.put(EntityType.ENDER_DRAGON, EnderDragon.class.getMethod("onDeath", args));
            mobs.put(EntityType.ENDERMAN, Enderman.class.getMethod("onDeath", args));
            mobs.put(EntityType.ENDERMITE, Endermite.class.getMethod("onDeath", args));
            mobs.put(EntityType.EVOKER, Evoker.class.getMethod("onDeath", args));
            mobs.put(EntityType.FOX, Fox.class.getMethod("onDeath", args));
            mobs.put(EntityType.GHAST, Ghast.class.getMethod("onDeath", args));
            mobs.put(EntityType.GLOW_SQUID, GlowSquid.class.getMethod("onDeath", args));
            mobs.put(EntityType.GOAT, Goat.class.getMethod("onDeath", args));
            mobs.put(EntityType.GUARDIAN, Guardian.class.getMethod("onDeath", args));
            mobs.put(EntityType.HOGLIN, Hoglin.class.getMethod("onDeath", args));
            mobs.put(EntityType.HORSE, Horse.class.getMethod("onDeath", args));
            mobs.put(EntityType.HUSK, Husk.class.getMethod("onDeath", args));
            mobs.put(EntityType.ILLUSIONER, Illusioner.class.getMethod("onDeath", args));
            mobs.put(EntityType.IRON_GOLEM, IronGolem.class.getMethod("onDeath", args));
            mobs.put(EntityType.LLAMA, Llama.class.getMethod("onDeath", args));
            mobs.put(EntityType.MAGMA_CUBE, MagmaCube.class.getMethod("onDeath", args));
            mobs.put(EntityType.MUSHROOM_COW, Mooshroom.class.getMethod("onDeath", args));
            mobs.put(EntityType.MULE, Mule.class.getMethod("onDeath", args));
            mobs.put(EntityType.OCELOT, Ocelot.class.getMethod("onDeath", args));
            mobs.put(EntityType.PANDA, Panda.class.getMethod("onDeath", args));
            mobs.put(EntityType.PARROT, Parrot.class.getMethod("onDeath", args));
            mobs.put(EntityType.PHANTOM, Phantom.class.getMethod("onDeath", args));
            mobs.put(EntityType.PIG, Pig.class.getMethod("onDeath", args));
            mobs.put(EntityType.PIGLIN, Piglin.class.getMethod("onDeath", args));
            mobs.put(EntityType.PIGLIN_BRUTE, PiglinBrute.class.getMethod("onDeath", args));
            mobs.put(EntityType.PILLAGER, Pillager.class.getMethod("onDeath", args));
            mobs.put(EntityType.POLAR_BEAR, PolarBear.class.getMethod("onDeath", args));
            mobs.put(EntityType.PUFFERFISH, Pufferfish.class.getMethod("onDeath", args));
            mobs.put(EntityType.RABBIT, Rabbit.class.getMethod("onDeath", args));
            mobs.put(EntityType.RAVAGER, Ravager.class.getMethod("onDeath", args));
            mobs.put(EntityType.SALMON, Salmon.class.getMethod("onDeath", args));
            mobs.put(EntityType.SHULKER, Shulker.class.getMethod("onDeath", args));
            mobs.put(EntityType.SILVERFISH, Silverfish.class.getMethod("onDeath", args));
            mobs.put(EntityType.SKELETON_HORSE, SkeletonHorse.class.getMethod("onDeath", args));
            mobs.put(EntityType.SLIME, Slime.class.getMethod("onDeath", args));
            mobs.put(EntityType.SNOWMAN, SnowGolem.class.getMethod("onDeath", args));
            mobs.put(EntityType.SPIDER, Spider.class.getMethod("onDeath", args));
            mobs.put(EntityType.SQUID, Squid.class.getMethod("onDeath", args));
            mobs.put(EntityType.STRAY, Stray.class.getMethod("onDeath", args));
            mobs.put(EntityType.STRIDER, Strider.class.getMethod("onDeath", args));
            mobs.put(EntityType.TRADER_LLAMA, TraderLlama.class.getMethod("onDeath", args));
            mobs.put(EntityType.TROPICAL_FISH, TropicalFish.class.getMethod("onDeath", args));
            mobs.put(EntityType.TURTLE, Turtle.class.getMethod("onDeath", args));
            mobs.put(EntityType.VEX, Vex.class.getMethod("onDeath", args));
            mobs.put(EntityType.VILLAGER, Villager.class.getMethod("onDeath", args));
            mobs.put(EntityType.VINDICATOR, Vindicator.class.getMethod("onDeath", args));
            mobs.put(EntityType.WANDERING_TRADER, WanderingTrader.class.getMethod("onDeath", args));
            mobs.put(EntityType.WITCH, Witch.class.getMethod("onDeath", args));
            mobs.put(EntityType.WITHER, Wither.class.getMethod("onDeath", args));
            mobs.put(EntityType.WOLF, Wolf.class.getMethod("onDeath", args));
            mobs.put(EntityType.ZOGLIN, Zoglin.class.getMethod("onDeath", args));
            mobs.put(EntityType.ZOMBIE_HORSE, ZombieHorse.class.getMethod("onDeath", args));
            mobs.put(EntityType.ZOMBIE_VILLAGER, ZombieVillager.class.getMethod("onDeath", args));
            mobs.put(EntityType.ZOMBIFIED_PIGLIN, ZombifiedPiglin.class.getMethod("onDeath", args));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void onMobDeath(EntityDeathEvent event) throws InvocationTargetException, IllegalAccessException {
        if (event.getEntity().getKiller() == null) return;
        if (!main.getConfig().getBoolean("packs.more-mob-heads.enabled")) return;

        EntityType entity = event.getEntity().getType();

        try {
            mobs.get(event.getEntity().getType()).invoke(event);
        } catch (NoSuchFieldError e) {
            /* Older versions of minecraft may not have all the mobs. */
        }
    }

    public static ItemStack getHead(String name, String texture) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta headMeta = (SkullMeta) head.getItemMeta();

        GameProfile profile = new GameProfile(UUID.fromString("fdb5599c-1b14-440e-82df-d69719703d21"), name);
        profile.getProperties().put("textures", new Property("textures", texture));
        Field field;
        try {
            field = headMeta.getClass().getDeclaredField("profile");
            field.setAccessible(true);
            field.set(headMeta, profile);
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException x) {
            x.printStackTrace();
        }

        head.setItemMeta(headMeta);
        return head;
    }

    public static boolean dropChance(Player player, double[] chances) {
        double chance = chances[0];
        double lootingBonus = chances[1];
        Random rand = new Random();
        if (player == null) return false;
        if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
            for (int i = 0; i < player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_MOBS); i++) {
                chance = chance + lootingBonus;
            }
        } else {
            if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
                for (int i = 0; i < player.getInventory().getItemInOffHand().getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_MOBS); i++) {
                    chance = chance + lootingBonus;
                }
            }
        }
        if (chance > 1) chance = 1;
        double num = rand.nextDouble();
        return num < chance;
    }

    public void unregister() {
        HandlerList.unregisterAll(this);
    }
}
