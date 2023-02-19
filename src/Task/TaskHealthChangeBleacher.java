package Task;

import java.util.List;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import fr.castletinou.plugin.MyListeners;

public class TaskHealthChangeBleacher extends BukkitRunnable{
	
	MyListeners plugin;
	
	public TaskHealthChangeBleacher(MyListeners plugin) {
		this.plugin = plugin;
		}

	
	@Override
	public void run() {
		List<Entity> player_list = MyListeners.player_list_Bleacher;
		for (Entity i : player_list) {
			Player player = (Player) i;
			player.setMaxHealth(20.0);
			}
		MyListeners.player_list_Bleacher.clear();
			
	}
	
}