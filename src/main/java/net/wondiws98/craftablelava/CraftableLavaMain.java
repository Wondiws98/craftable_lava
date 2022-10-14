package net.wondiws98.craftablelava;

import net.fabricmc.api.ModInitializer;
import net.wondiws98.craftablelava.item.LavaCrucible;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftableLavaMain implements ModInitializer {

	public static final String MOD_ID = "craftablelava";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LavaCrucible.registerLavaCrucible();
	}
}
