package com.moomallowz.sinker.core.init;

import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.core.items.BowlItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemReg {
	private ItemReg() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sinker.MODID);
	
	public static final RegistryObject<Item> WORM = ITEMS.register("worm", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FRIED_WORM = ITEMS.register("fried_worm", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(2.0f).build())));
	public static final RegistryObject<ForgeSpawnEggItem> WORM_SPAWN_EGG = ITEMS.register("worm_spawn_egg", () -> new ForgeSpawnEggItem(EntityReg.WORM, 0xd28787, 0x7e3e3e, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MUSSEL = ITEMS.register("mussel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SHUCKED_MUSSEL = ITEMS.register("shucked_mussel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(4.0f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.2f).build())));
	public static final RegistryObject<Item> BOILED_MUSSEL = ITEMS.register("boiled_mussel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(6.0f).build())));
	public static final RegistryObject<Item> CLAM_CHOWDER = ITEMS.register("clam_chowder", () -> new BowlItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).craftRemainder(Items.BOWL).stacksTo(1).food(new FoodProperties.Builder().nutrition(10).saturationMod(12.0f).effect(() -> new MobEffectInstance(MobEffects.LUCK, 600, 0), 1.0f).build())));
	public static final RegistryObject<Item> WHITE_PEARL = ITEMS.register("white_pearl", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLACK_PEARL = ITEMS.register("black_pearl", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PINK_PEARL = ITEMS.register("pink_pearl", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
