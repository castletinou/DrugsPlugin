package fr.castletinou.plugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Plugin plugin;
	public static Main instance;
	
	@Override
	public void onEnable() {
		System.out.println("[Drugs] Le plugin s'allume !");
		plugin = this;
		getCommand("drugs").setExecutor(new CommandDrugs());
		getServer().getPluginManager().registerEvents(new MyListeners(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("[Drugs] Le plugin s'éteint");
	
	}
	
	public static Plugin getPlugin() {
	    return plugin;
	  }
}