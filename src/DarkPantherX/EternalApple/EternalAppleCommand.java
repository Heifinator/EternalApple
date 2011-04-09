package DarkPantherX.EternalApple;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;






public class EternalAppleCommand implements CommandExecutor{


	private EternalApple plugin;
	@SuppressWarnings("unused")
	private static Logger log;

	public EternalAppleCommand(EternalApple eternalApple) {
	this.plugin = eternalApple;
	EternalAppleCommand.log = EternalApple.log;
	
	}
	
	 public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		    String[] split = args;
		    String commandName = command.getName().toLowerCase();
		        if (sender instanceof Player) {
		            Player player = (Player) sender;
		           if (!plugin.getPermission(player, "EternalApple.give")) {
		        	   player.sendMessage(ChatColor.RED + "You are not good enough for the holy Apple!");
		          return true; 
		          }
		            if (commandName.equals("eternalapple")) {
		            	if (split.length == 0) {
		                 
		                	player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE));
		                	player.sendMessage(ChatColor.RED + "From the garden of Eden straight to you!");
		            	
		            		}
		            	}
		            

		        }
		        return true;
	
	
	 }
	 
}

