package fr.castletinou.plugin;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitTask;

import Task.TaskHealthChangeBleacher;
import Task.TaskHealthChangeRottenHeal;
import net.minecraft.server.v1_8_R3.Enchantment;

public class MyListeners implements Listener {

	public static List<Entity> player_list_RottenHeal = new ArrayList<Entity>();
	public static List<Entity> player_list_Bleacher = new ArrayList<Entity>();

	@EventHandler
	public void onPotionDrink(PlayerItemConsumeEvent event) {

		Player player = event.getPlayer();
		ItemStack item = event.getItem();
		String name = item.getItemMeta().getDisplayName();

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§9§kI§r§d§l MIH §r§9§kI")) {
			player.removePotionEffect(PotionEffectType.SPEED);
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 4));
			player.sendMessage("§l[Drugs] §bGiving 30s of Speed V ... Made in Heaven !");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§3§lSan Ku Kaï")) {
			player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0));
			player.sendMessage("§l[Drugs] §cGiving 15 s of Strength III !");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§c§ki§4§ki§r§4§l Berseker §4§ki§c§ki")) {
			player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 500, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 300, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 700, 0));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 2));
			player.sendMessage("§l[Drugs] §cYou're refused to enter in valhalla, don't die");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§2§lPrestinox")) {
			player.removePotionEffect(PotionEffectType.SPEED);
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 2, 1));
			player.sendMessage("§l[Drugs] §aGiving 30 s of Strength II , SpeedIII and HasteII !");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lTrambolone")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 20));
			player.sendMessage("§l[Drugs] §dGiving 5 s of Jump XX !");
		}
		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§9§kI§b§kI§r§9§l Mister Freeze §9§kI§b§kI")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 8));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 4));
			player.sendMessage("§l[Drugs] §9Giving 15 s of Freeze V and resi V ");
		}
		if (name == "§3§lSapho Juice" && Enchantment.getEffects() != null) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 600, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 120, 5));
			player.sendMessage(
					"§a[Drugs]§r Time to run ! Gave §b§lSpeed III§r, §7§lWeakness VI§r, and §6§lMining Fatigue III§r for §c§l30 seconds !");

		}
		if (name == "§a§lPlomik Soup" && Enchantment.getEffects() != null) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 29));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 400, 2));
			player.sendMessage(
					"§a[Drugs]§r Time to jump ! Gave §a§lJump Boost XXX§r, §2§lNausea III§r, and §8§lBlindness III§r !");
		}
		if (name == "§6§lDivine Nectar" && Enchantment.getEffects() != null) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 2, 20));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 0));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 120, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 2, 0));
			player.sendMessage("§a[Drugs]§r Your Food Bar has been regenerated !");
		}
		if (name == "§f§lPale Potion" && Enchantment.getEffects() != null) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 36000, 0));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 120, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 36000, 1));
			player.sendMessage("§a[Drugs]§r You are now completely §7§lInvisible§r !");
		}
		if (name == "§6§lSandy's Nap Time" && Enchantment.getEffects() != null) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 10));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 10));
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 1));
			player.sendMessage("§a[Drugs]§r Nap time !");
		}
		if (name == "§e§lLucky Drug" && Enchantment.getEffects() != null) {

			int randint = (int) (Math.random() * (3 + 1));

			if (randint == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 6));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 2, 1));
				player.sendMessage("§a[Drugs]§r §4§lBad Luck ...§r Gave you §8§lBlindness VI§r for §b30 seconds§r.");
			}

			if (randint == 1) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 7));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 2, 1));
				player.sendMessage("§a[Drugs]§r §4§lBad Luck ...§r Gave you §2§lNausea VII§r for §b30 seconds§r.");
			}

			if (randint == 2) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 4));
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 20));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 2, 1));
				player.sendMessage("§a[Drugs]§r §a§lLucky !§r Gave you §c§lHealth Boost IV§r for §b30 seconds§r.");
			}

			if (randint == 3) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 2, 1));
				player.sendMessage("§a[Drugs]§r §a§lLucky !§r Gave you §d§lRegeneration IV§r for §b30 seconds§r.");
			}
		}
		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lAmbroisie")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 2, 10));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 0));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2, 1));
			player.sendMessage("§l[Drugs] §aGiving 30 s of Regeneration I, 60 s of Resistance II.");
		}
	}

	@EventHandler
	public void onSplash(PotionSplashEvent event) {
		if (event.getEntity() != null) {
			if (event.getPotion() != null && event.getPotion().getItem().getItemMeta().getDisplayName() != null && event
					.getPotion().getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lBusu§r §aCommon")) {
				if (event.getAffectedEntities() != null) {
					List<Entity> list = new ArrayList<Entity>(event.getAffectedEntities());
					for (Entity i : list) {

						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 10));
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 3));
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 80, 3));

						if (i instanceof Player) {

							Player player = (Player) i;
							player.sendMessage("§a[Drugs]§r You've been stunned for §c§l2 seconds§r !");

						}
					}
				}
			}

			if (event.getPotion() != null && event.getPotion().getItem().getItemMeta().getDisplayName() != null && event
					.getPotion().getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lBusu§r §9Rare")) {
				if (event.getAffectedEntities() != null) {
					List<Entity> list = new ArrayList<Entity>(event.getAffectedEntities());
					for (Entity i : list) {

						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 10));
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 3));
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 140, 3));

						if (i instanceof Player) {
							Player player = (Player) i;
							player.sendMessage("§a[Drugs]§r You've been stunned for §c§l5 seconds§r !");

						}
					}
				}
			}

			if (event.getPotion() != null && event.getPotion().getItem().getItemMeta().getDisplayName() != null
					&& event.getPotion().getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lBleacher")) {

				if (event.getAffectedEntities() != null) {
					List<Entity> list = new ArrayList<Entity>(event.getAffectedEntities());
					for (Entity i : list) {
						for (PotionEffect effect : ((LivingEntity) i).getActivePotionEffects()) {
							((LivingEntity) i).removePotionEffect(effect.getType());
						}
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100, 1));
						if (i instanceof Player) {
							Player player = (Player) i;
							player.sendMessage("§a[Drugs]§r All your effects have been cleared !");
							player_list_Bleacher.add(player);
							@SuppressWarnings("unused")
							BukkitTask reset_health = new TaskHealthChangeBleacher(this).runTask(Main.getPlugin());
						}
					}
				}

			}

			if (event.getPotion() != null && event.getPotion().getItem().getItemMeta().getDisplayName() != null
					&& event.getPotion().getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2§lRotten Heal")) {
				if (event.getAffectedEntities() != null) {
					List<Entity> list = new ArrayList<Entity>(event.getAffectedEntities());
					for (Entity i : list) {
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 300, 1));
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 2));
						((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 120, 5));
						if (i instanceof Player) {
							Player player = (Player) i;
							player.sendMessage("§a[Drugs]§r You've been debuffed !");
							player_list_RottenHeal.add(player);
							player.setMaxHealth(16.0);
							player.setHealth(16.0);
							@SuppressWarnings("unused")
							BukkitTask reset_health = new TaskHealthChangeRottenHeal(this)
									.runTaskLater(Main.getPlugin(), 300L);
						}
					}
				}
			}

			if (event.getPotion() != null && event.getPotion().getItem().getItemMeta().getDisplayName() != null
					&& event.getPotion().getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d§lDouble Heal")) {
				if (event.getAffectedEntities() != null) {
					List<Entity> list = new ArrayList<Entity>(event.getAffectedEntities());
					for (Entity i : list) {
						if (i instanceof Player) {
							Player player = (Player) i;
							player.sendMessage("§a[Drugs]§r You've been double-healed !");
							((LivingEntity) i).addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 2));
						}
					}
				}
			}
		}
	}
}