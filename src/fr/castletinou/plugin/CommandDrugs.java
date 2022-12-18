package fr.castletinou.plugin;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CommandDrugs implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {		
			Player player = (Player) sender;
			if (args.length < 1) return false;
			
			if (args[0].equalsIgnoreCase("MIH")) {
				
				player.getInventory().addItem(getItem(Material.POTION, "§9§kI§r§d§l MIH §r§9§kI", "", "§lThis potion give you §b§lSpeed V during §a§l30 seconds"));

				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("Sankukai")) {

				player.getInventory().addItem(getItem(Material.POTION, "§3§lSan Ku Kaï", "", "§lThis potion give you §c§lStrength III during §a§l15 seconds"));;

				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("admin")) {
				
				Inventory inv = Bukkit.createInventory(null, 9, "§8Drugs Menu");				
				
				inv.setItem(0, getItem(Material.POTION, "§3§lSan Ku Kaï", "", "§lThis potion give you §c§lStrength III during §a§l15 seconds"));
				inv.setItem(1, getItem(Material.POTION, "§9§kI§r§d§l MIH §r§9§kI", "", "§lThis potion give you §b§lSpeed V during §a§l30 seconds"));
				player.openInventory(inv);
				
				
			}

			return true;
		}

		return false;
	}
	public ItemStack getItem(Material material, String customName, String customLore, String customLore2) {
		ItemStack it = new ItemStack(material, 1);
		ItemMeta itM = it.getItemMeta();
		itM.setDisplayName(customName);
		itM.setLore(Arrays.asList(customLore, customLore2));
		itM.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		itM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		it.setItemMeta(itM);
		return it;
		
		
		
		
	}
	
	
}
