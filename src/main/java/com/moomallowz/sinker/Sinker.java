package com.moomallowz.sinker;

import com.moomallowz.sinker.common.setup.ModSetup;
import com.moomallowz.sinker.core.init.BlockReg;
import com.moomallowz.sinker.core.init.EntityReg;
import com.moomallowz.sinker.core.init.ItemReg;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Sinker.MODID)
public class Sinker {
	public static final String MODID = "sinker";
	
	public Sinker( ) {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(ModSetup::init);

		BlockReg.BLOCKS.register(modEventBus);
		ItemReg.ITEMS.register(modEventBus);
		EntityReg.ENTITIES.register(modEventBus);
	}
}

/*
TO DO:
Some kind of fishing vest?
Potentially bring back crates/lockboxes?
Unique junk items
Worms as bait
Maggots spawn when zombies die?
Some new decorative items
Fishing luck is influenced by time of day/weather
Hook into Aquaculture
More mussel foods
*/