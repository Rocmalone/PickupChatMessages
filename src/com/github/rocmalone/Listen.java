package com.github.rocmalone;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

/**
 * 
 * @author Rocmalone
 */

public class Listen implements Listener {
    
	@EventHandler
    public void onBlockPickup(PlayerPickupItemEvent event) {
		Player p = event.getPlayer();
		Item i = event.getItem();
		ItemStack i2 = i.getItemStack();
		int amt = i2.getAmount();
		String sAmt = "" + amt;
		String i3 = i2.toString();
		i3 = i3.replace("ItemStack{", "");
		i3 = i3.replace("x " + sAmt + "}", "");

		p.sendMessage("§2You received: §f" + sAmt + " " + i3);
	}
}