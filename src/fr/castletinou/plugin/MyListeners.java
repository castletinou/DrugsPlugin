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
    }
}