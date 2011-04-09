package DarkPantherX.EternalApple;

import java.util.logging.Logger;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;


public class EternalApple extends JavaPlugin{
	public static Logger log = Logger.getLogger("Minecraft");
	public static PermissionHandler permissions;
	
	
	 public void onDisable() {
			
		 System.out.println("Bye Bye Apple-Friend!");
		 }

		 public void onEnable() {
		 setupPermissions();
	
		
		 
		 
		 getCommand("eternalapple").setExecutor(new EternalAppleCommand(this));
		 			PluginDescriptionFile pdfFile = this.getDescription();
		 			System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
		 }
		 
		 
		 private void setupPermissions() {
			 Plugin test = this.getServer().getPluginManager().getPlugin("Permissions");

			
			 if (EternalApple.permissions == null) {
				 if (test != null) {
					 	EternalApple.permissions = ((Permissions)test).getHandler();
				 } else {
					 	log.info("Permission system not detected");
				 		}
			 }
		}
		 
		 public boolean getPermission(Player player, String permission) {
			 	if (permissions == null) return true;
			 	return permissions.has(player, permission);
		 }
		 
		 
		
			    }
		 
		
	
	
	
	
	
	

