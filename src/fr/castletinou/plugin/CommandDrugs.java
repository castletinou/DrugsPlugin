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
			Player player = (Player) sender;
			if (args.length < 1) return false;
			if (args[0].equalsIgnoreCase("MIH")) {
				ItemStack custompotion = new ItemStack(Material.POTION, 1);
				ItemMeta customM = custompotion.getItemMeta();
				customM.setDisplayName("§9§kI§r§d§l MIH §r§9§kI");
				customM.setLore(Arrays.asList("", "§lThis potion give you §b§lSpeed V during §a§l30 seconds"));
				customM.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
				customM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				custompotion.setItemMeta(customM);

				player.getInventory().addItem(custompotion);

				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("Sankukai")) {
				ItemStack custompotion = new ItemStack(Material.POTION, 1);
				ItemMeta customM = custompotion.getItemMeta();
				customM.setDisplayName("§3§lSan Ku Kaï");
				customM.setLore(Arrays.asList("", "§lThis potion give you §c§lStrength III during §a§l15 seconds"));
				customM.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
				customM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				custompotion.setItemMeta(customM);

				player.getInventory().addItem(custompotion);

				player.updateInventory();
			}

			return true;
		}

		return false;
	}

}
