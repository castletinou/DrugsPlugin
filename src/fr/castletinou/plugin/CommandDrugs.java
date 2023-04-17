package fr.castletinou.plugin;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class CommandDrugs implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {		
			Player player = (Player) sender;
			if (args.length < 1) return false;
			
			if (args[0].equalsIgnoreCase("admin")) {
				
				Inventory inv = Bukkit.createInventory(null, 18, "§8Drugs Menu");				
				
				inv.setItem(0, createPotion(Material.POTION, "§3§lSan Ku Kaï", "", "§7This potion give you §c§lStrength III§7 during §a§l15 seconds","§6Legendary", PotionType.STRENGTH));
				inv.setItem(1, createPotion(Material.POTION, "§9§kI§r§d§l MIH §r§9§kI", "", "§7This potion give you §b§lSpeed V§7 during §a§l30 seconds","§5Epic", PotionType.SPEED));
				inv.setItem(2, createPotion(Material.POTION, "§2§lPrestinox", "", "§7This potion give you §c§lStrength II§7, §b§lSpeed III§7 and §a§lHaste II§7 during §d§l30 seconds","§6Legendary", PotionType.REGEN));
				inv.setItem(3, createPotion(Material.POTION, "§e§lLucky Drug", "", "§7This potion give you a §a§lBonus§7 or a §4§lMalus§7 during §a§l30 seconds","§aCommon", PotionType.WEAKNESS));
				inv.setItem(4, createPotion(Material.POTION, "§b§lTrambolone", "", "§7This potion give you §aJump 20 §7during §a5 seconds §7be careful !","§9Rare", PotionType.JUMP));
				inv.setItem(5, createPotion(Material.POTION, "§9§kI§b§kI§r§9§l Mister Freeze §9§kI§b§kI", "", "§7This potion give you §9Freeze V §7but you're very §8resistant !", "§5Epic", PotionType.WATER));
				inv.setItem(6, createPotion(Material.POTION, "§c§ki§4§ki§r§4§l Berseker §4§ki§c§ki", "", "§7This potion give you a §5soul §7of §4viking","§6Legendary", PotionType.STRENGTH));
				inv.setItem(7, createSplashPotion(Material.POTION,"§6§lBusu§r §aCommon", "§rThis potion stun all the entities in", "§rits effect area for §c§l2 seconds§r.", "§aCommon", PotionType.SLOWNESS));
				inv.setItem(8, createSplashPotion(Material.POTION,"§6§lBusu§r §9Rare", "§rThis potion stun all the entities in", "§rits area of effect for §c§l5 seconds§r.", "§9Rare", PotionType.SLOWNESS));
				inv.setItem(9, createSplashPotion(Material.POTION,"§b§lBleacher", "§rThis potion §c§lclear the potions effects", "§rof any entities in its area of effect.", "§9Rare", PotionType.INVISIBILITY));
				inv.setItem(10, createSplashPotion(Material.POTION,"§2§lRotten Heal", "§rThis potion gives §2§ldebuffs", "§rto all entities in its area of effect.", "§5Epic", PotionType.POISON));
				inv.setItem(11, createPotion(Material.POTION,"§3§lSapho Juice", "§rThis potion give §b§lSpeed III§r  but also", "§r§7§lWeakness VI§r and §6§lMining Fatigue III§r.", "§aCommon", PotionType.SPEED));
				inv.setItem(12, createPotion(Material.POTION,"§a§lPlomik Soup", "§rThis potion give §a§lJump Boost XXX§r for a short time","§rbut also §2§lNausea III§r and §8§lBlindness III§r.", "§aCommon", PotionType.JUMP));
				inv.setItem(13, createSplashPotion(Material.POTION,"§d§lDouble Heal", "§rThis potion act as a Splash Potion of Healing", "§rbut heals §c§l10 hearts§r.", "§aCommon", PotionType.INSTANT_HEAL));
				inv.setItem(14, createPotion(Material.POTION,"§e§lAmbroisie", "","§rThis potion give §d§lRegen I§r, §8Resistance II §7 and full heal yourself", "§aCommon", PotionType.NIGHT_VISION));
				player.openInventory(inv);
			}
			
			return true;
		}

		return false;
	}
	
    public ItemStack createSplashPotion(Material material, String customName, String customLore, String customLore2, String customLore3, PotionType potType) {
        Potion potion = new Potion(1);
        potion.setSplash(true);
        potion.setLevel(1);
        potion.setType(potType);
        ItemStack it = new ItemStack(material, 1);
        potion.apply(it);
        ItemMeta itM = it.getItemMeta();
        itM.setDisplayName(customName);
        itM.setLore(Arrays.asList(customLore, customLore2,customLore3));
        itM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itM.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        it.setItemMeta(itM);
        return it;
    }
    public ItemStack createPotion(Material material, String customName, String customLore, String customLore2, String customLore3, PotionType potType) {
        Potion potion = new Potion(1);
        potion.setType(potType);
        ItemStack it = new ItemStack(material, 1);
        potion.apply(it);
        ItemMeta itM = it.getItemMeta();
        itM.setDisplayName(customName);
        itM.setLore(Arrays.asList(customLore, customLore2,customLore3));
        itM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itM.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        it.setItemMeta(itM);
        return it;
    }
	
}
