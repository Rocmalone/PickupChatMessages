package com.github.rocmalone;

import org.bukkit.plugin.java.JavaPlugin;

public class PickupChatMessages extends JavaPlugin {
	
	private final Listen l = new Listen();
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(l, this);
		//getCommand("bm togglechat").setExecutor(new ChatToggleCommand());
	}
	
	@Override
	public void onDisable() {
		
		
	}
}
