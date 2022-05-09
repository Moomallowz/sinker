package com.moomallowz.sinker.common.setup;

import com.moomallowz.sinker.core.init.ItemReg;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
	
	public static void init(final FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			registerCompostables();
		});
	}

	public static void registerCompostables() {
		ComposterBlock.COMPOSTABLES.put(ItemReg.WORM.get(), 1.0F);
	}
}
