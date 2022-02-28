package com.moomallowz.sinker;

import com.moomallowz.sinker.core.init.BlockReg;
import com.moomallowz.sinker.core.init.EntityReg;
import com.moomallowz.sinker.core.init.ItemReg;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Sinker.MODID)
public class Sinker {
	public static final String MODID = "sinker";
	
	public Sinker( ) {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockReg.BLOCKS.register(bus);
		ItemReg.ITEMS.register(bus);
		EntityReg.ENTITIES.register(bus);
	}
}

/*
TO DO:
Some kind of fishing vest?
Potentially bring back crates/lockboxes?
Unique junk items
Worms and beetles as bait
Maggots spawn when zombies die?
Some new decorative items
Fishing luck is influenced by time of day/weather
Pearls brewable into luck potions
Funny advancements/funny easter eggs
Hook into Aquaculture
New mussel-based food items
*/