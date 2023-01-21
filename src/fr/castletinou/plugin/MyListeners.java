package fr.castletinou.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MyListeners implements Listener {
	@EventHandler
	public void onPotionDrink(PlayerItemConsumeEvent event) {
        
		Player player = event.getPlayer();
		ItemStack item = event.getItem();


		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§9§kI§r§d§l MIH §r§9§kI")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 4));
			player.sendMessage("§l[Drugs] §bGiving 30s of Speed V ... Made in Heaven !");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§3§lSan Ku Kaï")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 2));
			player.sendMessage("§l[Drugs] §cGiving 15 s of Strength III !");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§c§ki§4§ki§r§4§l Berseker §4§ki§c§ki")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 300, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 2));
			player.sendMessage("§l[Drugs] §cGiving 15 s of Strength III !");
		}

		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§2§lPrestinox")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 1));
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


		if (item.getType() == Material.POTION && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
				&& item.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lLucky Drug")) {

			int randint = (int) (Math.random() * (3 + 1));

			if (randint == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 6));
				player.sendMessage("§4§lBad Luck ...§r Gave you §8§lBlindness VI§r for §b30 seconds§r.");
			}

			if (randint == 1) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 7));
				player.sendMessage("§4§lBad Luck ...§r Gave you §2§lNausea VII§r for §b30 seconds§r.");
			}

			if (randint == 2) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 5));
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 20));
				player.sendMessage("§a§lLucky !§r Gave you §c§lHealth Boost V§r for §b30 seconds§r.");
			}

			if (randint == 3) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 3));
				player.sendMessage("§a§lLucky !§r Gave you §d§lRegeneration IV§r for §b30 seconds§r.");
			}
		}
	}
}