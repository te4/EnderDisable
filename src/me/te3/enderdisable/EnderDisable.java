package me.te3.enderdisable;


import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.entity.EntityType;

/**
 *
 * @author te3
 */
public class EnderDisable extends JavaPlugin implements Listener {
    
    /*public EnderDisable() {
        
    }*/
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onEndermanActivity(EntityChangeBlockEvent blockchange) {
        if (blockchange.getEntityType() == EntityType.ENDERMAN) {
            blockchange.setCancelled(true);
        }
    }
}