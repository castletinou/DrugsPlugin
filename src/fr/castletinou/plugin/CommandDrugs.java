package fr.castletinou.plugin;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CommandDrugs implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {		
			Player player = (Player) sender;
			if (args.length < 1) return false;
			
			if (args[0].equalsIgnoreCase("MIH")) {
				
				player.getInventory().addItem(getItem(Material.POTION, "§9§kI§r§d§l MIH §r§9§kI", "", "This potion give you §bSpeed V during §a30 seconds"));

				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("sankukai")) {

				player.getInventory().addItem(getItem(Material.POTION, "§3§lSan Ku Kaï", "", "This potion give you §cStrength III during §a15 seconds"));;

				player.updateInventory();
			}		
			if (args[0].equalsIgnoreCase("berseker")) {
				
				player.getInventory().addItem(getItem(Material.POTION, "§c§ki§4§ki§r§4§l Berseker §4§ki§c§ki", "", "This potion give you a soul of viking"));;
				
				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("LuckyDrug")) {
				
				player.getInventory().addItem(getItem(Material.POTION, "§e§lLucky Drug", "", "This potion give you a §aBonus §5or a §4Malus §5during §a30 seconds"));;
				
				player.updateInventory();
			}
			

			if (args[0].equalsIgnoreCase("prestinox")) {

				player.getInventory().addItem(getItem(Material.POTION, "§2§lPrestinox", "", "This potion give you §cStrength II, §bSpeedIII and §ahasteII §dduring 30 second"));;

				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("trambolone")) {

				player.getInventory().addItem(getItem(Material.POTION, "§b§lTrambolone", "", "This potion give you §aJump10 §rbe careful !"));;

				player.updateInventory();
			}
			if (args[0].equalsIgnoreCase("misterfreeze")) {

				player.getInventory().addItem(getItem(Material.POTION, "§9§kI§b§kI§r§9§l Mister Freeze §9§kI§b§kI", "", "This potion give you §9Freeze V but you're very resistant !"));;

				player.updateInventory();
			}
			
			if (args[0].equalsIgnoreCase("admin")) {
				
				Inventory inv = Bukkit.createInventory(null, 9, "§8Drugs Menu");				
				
				inv.setItem(0, getItem(Material.POTION, "§3§lSan Ku Kaï", "", "This potion give you §cStrength III during §a15 seconds"));
				inv.setItem(1, getItem(Material.POTION, "§9§kI§r§d§l MIH §r§9§kI", "", "This potion give you §bSpeed V during §a30 seconds"));
				inv.setItem(2, getItem(Material.POTION, "§2§lPrestinox", "", "This potion give you §cStrength II, §bSpeedIII and §ahasteII §dduring 30 second"));
				inv.setItem(3, getItem(Material.POTION, "§e§lLucky Drug", "", "This potion give you a §aBonus §5or a §4Malus §5during §a30 seconds"));
				inv.setItem(4, getItem(Material.POTION, "§b§lTrambolone", "", "This potion give you §aJump 20 §5during §a5 seconds §5be careful !"));
				inv.setItem(5, getItem(Material.POTION, "§9§kI§b§kI§r§9§l Mister Freeze §9§kI§b§kI", "", "This potion give you §9Freeze V §5but you're very §8resistant !"));
				inv.setItem(6, getItem(Material.POTION, "three chance", "", "3"));
				
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
		it.setItemMeta(itM);
		return it;
	}
	
	
}
