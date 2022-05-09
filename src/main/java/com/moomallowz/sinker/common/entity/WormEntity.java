package com.moomallowz.sinker.common.entity;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;

public class WormEntity extends Animal{
	
	   public WormEntity(EntityType<? extends Animal> entityType, Level level) {
		      super(entityType, level);
		   }
	   
	   @Override
	   protected void registerGoals() {
		   super.registerGoals();
		   this.goalSelector.addGoal(0, new RandomStrollGoal(this, 1.0D));
		   this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
	   }
	   
	   public static AttributeSupplier.Builder createAttributes() {
		   return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 1.0D).add(Attributes.MOVEMENT_SPEED, 0.15D);
	   }

	   @Override
	   public boolean canBreatheUnderwater() {
	      return true;
	   }

	   protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	        return SoundEvents.ENDERMITE_STEP;
	   }

	   protected SoundEvent getDeathSound() {
	        return SoundEvents.ENDERMITE_STEP;
	   }

	   protected void playStepSound(BlockPos pos, BlockState blockIn) {
	        this.playSound(SoundEvents.ENDERMITE_STEP, 0.15F, 1.0F);
	   }
	   
	   public static boolean canSpawn(EntityType<WormEntity> entity, LevelAccessor levelAccess, MobSpawnType spawnType, BlockPos pos, Random random) {
		   return Animal.checkAnimalSpawnRules(entity, levelAccess, spawnType, pos, random) && pos.getY() > 45 && levelAccess instanceof Level level && level.isRaining();
	   }
	   

	@Override
	public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob parent) {
		return null;
	}
}
