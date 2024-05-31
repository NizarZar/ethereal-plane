package com.nizar.etherealplane;

import com.nizar.etherealplane.block.CustomBlocks;
import com.nizar.etherealplane.item.CustomItems;
import com.nizar.etherealplane.item.CustomTabGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EtherealPlane implements ModInitializer {

	public static final String MOD_ID = "etherealplane";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CustomTabGroups.registerItemGroups();
		CustomBlocks.registerModBlocks();
		CustomItems.registerItemsList();

	}
}