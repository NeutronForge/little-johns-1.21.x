package com.echo.little_johns;

import com.echo.little_johns.block.ModBlocks;
import com.echo.little_johns.item.ModItems;
import com.echo.little_johns.screen.ModScreenHandlers;
import com.echo.little_johns.sound.ModSoundEvents;
import com.echo.little_johns.stat.ModStats;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LittleJohns implements ModInitializer {
	public static final String MOD_ID = "little_johns";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSoundEvents.registerSounds();
		ModStats.registerModStats();
		ModScreenHandlers.registerScreenHandlers();
	}
}