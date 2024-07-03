package io.github.chaoswaffle.createmath;

import io.github.chaoswaffle.createmath.item.ModItemGroups;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateMath implements ModInitializer {
	public static final String ID = "createmath";
	public static final String NAME = "Create: Math";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + NAME);

		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
	}
}