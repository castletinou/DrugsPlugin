package Task;

import java.util.List;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import fr.castletinou.plugin.MyListeners;

public class TaskHealthChangeRottenHeal extends BukkitRunnable{
	
	MyListeners plugin;
	
	public TaskHealthChangeRottenHeal(MyListeners plugin) {
		this.plugin = plugin;
		}

	
	@Override
	public void run() {
		List<Entity> player_list = MyListeners.player_list_RottenHeal;
		for (Entity i : player_list) {
			Player player = (Player) i;
			player.setMaxHealth(20.0);
			}
		MyListeners.player_list_RottenHeal.clear();
			
	}
	
}