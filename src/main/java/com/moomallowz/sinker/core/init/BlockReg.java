package com.moomallowz.sinker.core.init;

import com.moomallowz.sinker.Sinker;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockReg {
	private BlockReg() {}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sinker.MODID);
	
	public static final RegistryObject<Block> WORM_BLOCK = BLOCKS.register("worm_block", () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.COLOR_GRAY).strength(0.5f).requiresCorrectToolForDrops()));
}
