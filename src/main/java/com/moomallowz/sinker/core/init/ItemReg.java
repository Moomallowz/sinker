package com.moomallowz.sinker.core.init;

import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.core.items.BowlItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemReg {
	private ItemReg() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sinker.MODID);
	
	public static final RegistryObject<Item> WORM = ITEMS.register("worm", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FRIED_WORM = ITEMS.register("fried_worm", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).fast().build())));
	public static final RegistryObject<ForgeSpawnEggItem> WORM_SPAWN_EGG = ITEMS.register("worm_spawn_egg", () -> new ForgeSpawnEggItem(EntityReg.WORM, 0xd28787, 0x7e3e3e, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MUSSEL = ITEMS.register("mussel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SHUCKED_MUSSEL = ITEMS.register("shucked_mussel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.2f).build())));
	public static final RegistryObject<Item> BOILED_MUSSEL = ITEMS.register("boiled_mussel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(1.0f).build())));
	public static final RegistryObject<Item> CLAM_CHOWDER = ITEMS.register("clam_chowder", () -> new BowlItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).craftRemainder(Items.BOWL).stacksTo(1).food(new FoodProperties.Builder().nutrition(10).saturationMod(1.0f).effect(() -> new MobEffectInstance(MobEffects.LUCK, 600, 0), 1.0f).build())));
	public static final RegistryObject<Item> PEARL = ITEMS.register("pearl", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<SwordItem> ANCHOR = ITEMS.register("anchor", () -> new SwordItem(Tiers.IRON, 7, -3.3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.UNCOMMON)));
}
