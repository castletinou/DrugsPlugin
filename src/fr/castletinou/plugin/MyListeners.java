package fr.castletinou.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.minecraft.server.v1_8_R3.Enchantment;

public class MyListeners implements Listener {
	@EventHandler
    public void onPotionDrink(PlayerItemConsumeEvent event) {
		
        Player player = event.getPlayer();
        ItemStack item = event.getItem();
        String name = item.getItemMeta().getDisplayName();
        
        
        if (name == "§9§kI§r§d§l MIH §r§9§kI" && Enchantment.getEffects() != null) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 4));
            player.sendMessage("§l[Drugs] §bGiving 30s of speed V ... Made in Heaven !");
        }
        if (name == "§3§lSan Ku Kaï" && Enchantment.getEffects() != null) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 2));
            player.sendMessage("§l[Drugs] §cGiving 15 s of strength III !");
        }
        if (name == "§e§lLucky Drug" && Enchantment.getEffects() != null) {
        	
			int randint = (int)(Math.random() * (3 + 1));
			
			if (randint == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS ,600 ,6));
				player.sendMessage("§4§lBad Luck ...§r Gave you §8§lBlindness VI§r for §b30 seconds§r.");
			}
			
			if (randint == 1) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION ,600 ,7));
				player.sendMessage("§4§lBad Luck ...§r Gave you §2§lNausea VII§r for §b30 seconds§r.");
			}
			
			if (randint == 2) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST,600 ,5));
				player.sendMessage("§a§lLucky !§r Gave you §c§lHealth Boost V§r for §b30 seconds§r.");
			}
			
			if (randint == 3) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,600 ,3));
				player.sendMessage("§a§lLucky !§r Gave you §d§lRegeneration VI§r for §b30 seconds§r.");
			}
        }
    }
}