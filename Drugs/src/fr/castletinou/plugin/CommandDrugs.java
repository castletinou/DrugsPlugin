package fr.castletinou.plugin;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CommandDrugs implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {
			if (args.length == 0 || args.length == 1) {
				Player player = (Player) sender;
				
				if (args[0].equalsIgnoreCase("MIH")) {
					ItemStack custompotion = new ItemStack(Material.POTION, 1);	
					ItemMeta customM = custompotion.getItemMeta();
					customM.setDisplayName("§9§kI§r§d§l MIH §r§9§kI");
					customM.setLore(Arrays.asList("","§lThis potion give you §b§lSpeed V during §a§l30 seconds"));
					customM.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
					customM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					custompotion.setItemMeta(customM);
					
					player.getInventory().addItem(custompotion);
					
					
					player.updateInventory();
					

				}

			
				if (args[0].equalsIgnoreCase("kbstick")) {
					
					player.sendMessage("Gave §a[1]§r §c§l[Knockback Stick]§r to §bplayer§r.");
					
					ItemStack kb_stick = new ItemStack(Material.STICK);
					ItemMeta customMeta = kb_stick.getItemMeta();
					customMeta.setDisplayName("§c§k§oa§r §1§lKnockback Stick §c§k§oa§r");
					customMeta.setLore(Arrays.asList("This stick makes ","kings and queens fall."));
					customMeta.addEnchant(Enchantment.KNOCKBACK, 3, true);
					customMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					kb_stick.setItemMeta(customMeta);
					player.getInventory().addItem(kb_stick);
					
					player.updateInventory();
				}

				return true;
			}

		}
		return false;
	}

}
