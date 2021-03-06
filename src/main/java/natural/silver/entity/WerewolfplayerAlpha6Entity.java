
package natural.silver.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import natural.silver.NaturalmoonModElements;

@NaturalmoonModElements.ModElement.Tag
public class WerewolfplayerAlpha6Entity extends NaturalmoonModElements.ModElement {
	public static EntityType entity = null;
	public WerewolfplayerAlpha6Entity(NaturalmoonModElements instance) {
		super(instance, 124);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire().size(0.6f, 0.8f))
						.build("werewolfplayer_alpha_6").setRegistryName("werewolfplayer_alpha_6");
		elements.entities.add(() -> entity);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(CustomEntity.class, renderManager -> {
			return new MobRenderer(renderManager, new ModelNaturalMoon_player_werewolf(), 0.7999999999999999f) {
				@Override
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("naturalmoon:textures/wolf1.png");
				}
			};
		});
	}
	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(3, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturalmoon:werewolf_live"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturalmoon:werewolf_hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof ArrowEntity)
				return false;
			if (source.getImmediateSource() instanceof PlayerEntity)
				return false;
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelNaturalMoon_player_werewolf extends EntityModel {
		private final RendererModel Werewolf;
		private final RendererModel Body;
		private final RendererModel lowerbody_r1;
		private final RendererModel upperbody_r1;
		private final RendererModel upperbody_r2;
		private final RendererModel neck_r1;
		private final RendererModel Tail1;
		private final RendererModel tail1_r1;
		private final RendererModel Tail2;
		private final RendererModel tail2_r1;
		private final RendererModel Head;
		private final RendererModel brow2_r1;
		private final RendererModel brow1_r1;
		private final RendererModel Ear1;
		private final RendererModel ear1_r1;
		private final RendererModel Ear2;
		private final RendererModel ear2_r1;
		private final RendererModel Jaw;
		private final RendererModel LArm;
		private final RendererModel claw_r1;
		private final RendererModel claw_r2;
		private final RendererModel claw_r3;
		private final RendererModel claw_r4;
		private final RendererModel claw_r5;
		private final RendererModel lefthand_r1;
		private final RendererModel leftarm_r1;
		private final RendererModel leftshoulder_r1;
		private final RendererModel RArm;
		private final RendererModel claw_r6;
		private final RendererModel claw_r7;
		private final RendererModel claw_r8;
		private final RendererModel claw_r9;
		private final RendererModel claw_r10;
		private final RendererModel righthand_r1;
		private final RendererModel rightarm_r1;
		private final RendererModel rightshoulder_r1;
		private final RendererModel LLeg;
		private final RendererModel claw_r11;
		private final RendererModel leftankle_r1;
		private final RendererModel leftknee_r1;
		private final RendererModel leftcalve_r1;
		private final RendererModel RLeg;
		private final RendererModel claw_r12;
		private final RendererModel rightankle_r1;
		private final RendererModel rightknee_r1;
		private final RendererModel rightcalve_r1;
		public ModelNaturalMoon_player_werewolf() {
			textureWidth = 128;
			textureHeight = 128;
			Werewolf = new RendererModel(this);
			Werewolf.setRotationPoint(0.0F, 24.0F, 5.0F);
			Body = new RendererModel(this);
			Body.setRotationPoint(-4.0F, -36.5F, -2.0F);
			Werewolf.addChild(Body);
			lowerbody_r1 = new RendererModel(this);
			lowerbody_r1.setRotationPoint(4.0F, 22.5F, 5.0F);
			Body.addChild(lowerbody_r1);
			setRotationAngle(lowerbody_r1, 0.3927F, 0.0F, 0.0F);
			lowerbody_r1.cubeList.add(new ModelBox(lowerbody_r1, 34, 0, -4.0F, -8.2492F, 0.8289F, 8, 9, 5, 0.0F, false));
			upperbody_r1 = new RendererModel(this);
			upperbody_r1.setRotationPoint(4.0F, 17.0F, 2.0F);
			Body.addChild(upperbody_r1);
			setRotationAngle(upperbody_r1, 0.3927F, 0.0F, 0.0F);
			upperbody_r1.cubeList.add(new ModelBox(upperbody_r1, 51, 28, -4.0F, -11.4839F, -0.3233F, 8, 4, 3, 0.0F, false));
			upperbody_r2 = new RendererModel(this);
			upperbody_r2.setRotationPoint(4.0F, 17.5F, 2.0F);
			Body.addChild(upperbody_r2);
			setRotationAngle(upperbody_r2, 0.3927F, 0.0F, 0.0F);
			upperbody_r2.cubeList.add(new ModelBox(upperbody_r2, 0, 0, -5.0F, -11.4839F, 0.6767F, 10, 13, 7, 0.0F, false));
			neck_r1 = new RendererModel(this);
			neck_r1.setRotationPoint(0.0F, 0.5F, 1.0F);
			Body.addChild(neck_r1);
			setRotationAngle(neck_r1, 0.4363F, 0.0F, 0.0F);
			neck_r1.cubeList.add(new ModelBox(neck_r1, 0, 20, -0.25F, 1.1114F, -3.6084F, 8, 11, 6, 0.0F, false));
			Tail1 = new RendererModel(this);
			Tail1.setRotationPoint(4.0F, 22.0F, 6.0F);
			Body.addChild(Tail1);
			tail1_r1 = new RendererModel(this);
			tail1_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
			Tail1.addChild(tail1_r1);
			setRotationAngle(tail1_r1, -0.7854F, 0.0F, 0.0F);
			tail1_r1.cubeList.add(new ModelBox(tail1_r1, 26, 14, -2.0F, -4.8284F, -0.3432F, 4, 4, 8, 0.0F, false));
			Tail2 = new RendererModel(this);
			Tail2.setRotationPoint(0.0F, 3.5F, 4.0F);
			Tail1.addChild(Tail2);
			tail2_r1 = new RendererModel(this);
			tail2_r1.setRotationPoint(0.0F, 2.2768F, 5.3086F);
			Tail2.addChild(tail2_r1);
			setRotationAngle(tail2_r1, -0.3927F, 0.0F, 0.0F);
			tail2_r1.cubeList.add(new ModelBox(tail2_r1, 16, 42, -1.5F, -3.5719F, -3.611F, 3, 3, 8, 0.0F, false));
			Head = new RendererModel(this);
			Head.setRotationPoint(4.0F, 6.25F, 1.8708F);
			Body.addChild(Head);
			Head.cubeList.add(new ModelBox(Head, 28, 28, -4.0F, -6.25F, -5.8708F, 8, 7, 7, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 37, -2.0F, -2.75F, -9.8708F, 4, 2, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 16, 42, -2.1F, -1.25F, -9.7708F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 36, 26, 0.9F, -1.5F, -8.6208F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 24, -1.9F, -1.5F, -8.6208F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 40, 26, 1.1F, -1.25F, -9.7708F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 56, -2.0F, 0.25F, -6.1208F, 4, 1, 3, 0.0F, false));
			brow2_r1 = new RendererModel(this);
			brow2_r1.setRotationPoint(2.3534F, -3.4847F, -8.3708F);
			Head.addChild(brow2_r1);
			setRotationAngle(brow2_r1, 0.0F, 0.0F, -0.1309F);
			brow2_r1.cubeList.add(new ModelBox(brow2_r1, 22, 20, -1.5165F, -1.5766F, 2.0F, 3, 1, 1, 0.0F, false));
			brow1_r1 = new RendererModel(this);
			brow1_r1.setRotationPoint(-2.25F, -3.25F, -9.3708F);
			Head.addChild(brow1_r1);
			setRotationAngle(brow1_r1, 0.0F, 0.0F, 0.1309F);
			brow1_r1.cubeList.add(new ModelBox(brow1_r1, 28, 26, -1.5788F, -1.8007F, 3.0F, 3, 1, 1, 0.0F, false));
			Ear1 = new RendererModel(this);
			Ear1.setRotationPoint(-3.0F, -5.25F, -5.8708F);
			Head.addChild(Ear1);
			ear1_r1 = new RendererModel(this);
			ear1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Ear1.addChild(ear1_r1);
			setRotationAngle(ear1_r1, -0.3927F, 0.0F, 0.0F);
			ear1_r1.cubeList.add(new ModelBox(ear1_r1, 0, 20, -1.0F, -4.3722F, 1.926F, 2, 3, 1, 0.0F, false));
			Ear2 = new RendererModel(this);
			Ear2.setRotationPoint(3.0F, -5.25F, -5.8708F);
			Head.addChild(Ear2);
			ear2_r1 = new RendererModel(this);
			ear2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Ear2.addChild(ear2_r1);
			setRotationAngle(ear2_r1, -0.3927F, 0.0F, 0.0F);
			ear2_r1.cubeList.add(new ModelBox(ear2_r1, 0, 0, -1.0F, -4.3722F, 1.926F, 2, 3, 1, 0.0F, false));
			Jaw = new RendererModel(this);
			Jaw.setRotationPoint(0.0F, 1.75F, -7.8708F);
			Head.addChild(Jaw);
			Jaw.cubeList.add(new ModelBox(Jaw, 62, 9, -2.0F, -1.5F, -2.25F, 4, 1, 5, 0.0F, false));
			Jaw.cubeList.add(new ModelBox(Jaw, 31, 33, -1.9F, -2.0F, -0.75F, 1, 1, 1, 0.0F, false));
			Jaw.cubeList.add(new ModelBox(Jaw, 31, 30, -1.75F, -1.75F, -2.15F, 1, 1, 1, 0.0F, false));
			Jaw.cubeList.add(new ModelBox(Jaw, 30, 20, 0.75F, -1.75F, -2.15F, 1, 1, 1, 0.0F, false));
			Jaw.cubeList.add(new ModelBox(Jaw, 27, 5, 0.9F, -2.0F, -0.75F, 1, 1, 1, 0.0F, false));
			LArm = new RendererModel(this);
			LArm.setRotationPoint(9.0F, 7.0F, 3.0F);
			Body.addChild(LArm);
			claw_r1 = new RendererModel(this);
			claw_r1.setRotationPoint(4.55F, 15.1642F, -8.4142F);
			LArm.addChild(claw_r1);
			setRotationAngle(claw_r1, -1.7802F, 0.0873F, 0.0F);
			claw_r1.cubeList.add(new ModelBox(claw_r1, 0, 37, 0.7384F, 0.2085F, -3.9821F, 1, 1, 3, 0.0F, false));
			claw_r2 = new RendererModel(this);
			claw_r2.setRotationPoint(4.45F, 14.9142F, -8.6642F);
			LArm.addChild(claw_r2);
			setRotationAngle(claw_r2, -1.7802F, 0.0436F, 0.0F);
			claw_r2.cubeList.add(new ModelBox(claw_r2, 16, 37, -0.1308F, 0.2001F, -3.9839F, 1, 1, 4, 0.0F, false));
			claw_r3 = new RendererModel(this);
			claw_r3.setRotationPoint(4.45F, 15.1642F, -8.6642F);
			LArm.addChild(claw_r3);
			setRotationAngle(claw_r3, -1.7802F, 0.0873F, 0.0F);
			claw_r3.cubeList.add(new ModelBox(claw_r3, 27, 0, -1.2616F, 0.2085F, -3.9821F, 1, 1, 4, 0.0F, false));
			claw_r4 = new RendererModel(this);
			claw_r4.setRotationPoint(4.35F, 15.1642F, -8.4142F);
			LArm.addChild(claw_r4);
			setRotationAngle(claw_r4, -1.7802F, 0.0873F, 0.0F);
			claw_r4.cubeList.add(new ModelBox(claw_r4, 0, 41, -2.2616F, 0.2085F, -3.9821F, 1, 1, 3, 0.0F, false));
			claw_r5 = new RendererModel(this);
			claw_r5.setRotationPoint(2.477F, 15.4481F, -10.7189F);
			LArm.addChild(claw_r5);
			setRotationAngle(claw_r5, -0.5236F, 0.0873F, 0.2618F);
			claw_r5.cubeList.add(new ModelBox(claw_r5, 0, 4, -1.0194F, -3.3195F, 1.5857F, 1, 2, 1, 0.0F, false));
			lefthand_r1 = new RendererModel(this);
			lefthand_r1.setRotationPoint(4.45F, 12.9142F, -8.4142F);
			LArm.addChild(lefthand_r1);
			setRotationAngle(lefthand_r1, -1.1781F, 0.0873F, 0.0F);
			lefthand_r1.cubeList.add(new ModelBox(lefthand_r1, 48, 66, -2.2616F, -4.2199F, -2.1629F, 4, 4, 4, 0.0F, false));
			leftarm_r1 = new RendererModel(this);
			leftarm_r1.setRotationPoint(4.25F, 6.5F, -3.0F);
			LArm.addChild(leftarm_r1);
			setRotationAngle(leftarm_r1, -0.7854F, 0.0F, 0.0F);
			leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 38, 42, -2.0F, -3.8787F, 0.1213F, 4, 10, 4, 0.0F, false));
			leftshoulder_r1 = new RendererModel(this);
			leftshoulder_r1.setRotationPoint(0.6569F, -0.5F, -3.0F);
			LArm.addChild(leftshoulder_r1);
			setRotationAngle(leftshoulder_r1, 0.0F, 0.0F, -0.3927F);
			leftshoulder_r1.cubeList.add(new ModelBox(leftshoulder_r1, 50, 14, -1.683F, -1.5391F, 1.0F, 4, 10, 4, 0.0F, false));
			RArm = new RendererModel(this);
			RArm.setRotationPoint(-1.0F, 7.0F, 3.0F);
			Body.addChild(RArm);
			claw_r6 = new RendererModel(this);
			claw_r6.setRotationPoint(-4.8F, 15.1642F, -8.4142F);
			RArm.addChild(claw_r6);
			setRotationAngle(claw_r6, -1.789F, -0.0873F, 0.0F);
			claw_r6.cubeList.add(new ModelBox(claw_r6, 42, 14, -1.7384F, 0.2227F, -4.0059F, 1, 1, 3, 0.0F, false));
			claw_r7 = new RendererModel(this);
			claw_r7.setRotationPoint(-4.7F, 14.9142F, -8.6642F);
			RArm.addChild(claw_r7);
			setRotationAngle(claw_r7, -1.789F, -0.0436F, 0.0F);
			claw_r7.cubeList.add(new ModelBox(claw_r7, 66, 23, -0.8692F, 0.2143F, -4.0078F, 1, 1, 4, 0.0F, false));
			claw_r8 = new RendererModel(this);
			claw_r8.setRotationPoint(-4.7F, 15.1642F, -8.4142F);
			RArm.addChild(claw_r8);
			setRotationAngle(claw_r8, -1.789F, -0.0873F, 0.0F);
			claw_r8.cubeList.add(new ModelBox(claw_r8, 55, 0, 0.2616F, 0.2227F, -4.0059F, 1, 1, 4, 0.0F, false));
			claw_r9 = new RendererModel(this);
			claw_r9.setRotationPoint(-4.6F, 15.4142F, -8.4142F);
			RArm.addChild(claw_r9);
			setRotationAngle(claw_r9, -1.789F, -0.0873F, 0.0F);
			claw_r9.cubeList.add(new ModelBox(claw_r9, 30, 42, 1.2616F, 0.2227F, -4.0059F, 1, 1, 3, 0.0F, false));
			claw_r10 = new RendererModel(this);
			claw_r10.setRotationPoint(-2.727F, 15.4481F, -10.4689F);
			RArm.addChild(claw_r10);
			setRotationAngle(claw_r10, -0.5236F, -0.0873F, -0.2618F);
			claw_r10.cubeList.add(new ModelBox(claw_r10, 22, 22, 0.0194F, -3.3195F, 1.5857F, 1, 2, 1, 0.0F, false));
			righthand_r1 = new RendererModel(this);
			righthand_r1.setRotationPoint(-4.7F, 12.9142F, -8.4142F);
			RArm.addChild(righthand_r1);
			setRotationAngle(righthand_r1, -1.1781F, -0.0873F, 0.0F);
			righthand_r1.cubeList.add(new ModelBox(righthand_r1, 66, 15, -1.7384F, -4.2199F, -2.1629F, 4, 4, 4, 0.0F, false));
			rightarm_r1 = new RendererModel(this);
			rightarm_r1.setRotationPoint(-4.5F, 7.5F, -3.0F);
			RArm.addChild(rightarm_r1);
			setRotationAngle(rightarm_r1, -0.7854F, 0.0F, 0.0F);
			rightarm_r1.cubeList.add(new ModelBox(rightarm_r1, 0, 47, -2.0F, -4.5858F, -0.5858F, 4, 10, 4, 0.0F, false));
			rightshoulder_r1 = new RendererModel(this);
			rightshoulder_r1.setRotationPoint(-1.0F, -0.5F, -3.0F);
			RArm.addChild(rightshoulder_r1);
			setRotationAngle(rightshoulder_r1, 0.0F, 0.0F, 0.3927F);
			rightshoulder_r1.cubeList.add(new ModelBox(rightshoulder_r1, 50, 52, -2.317F, -1.5391F, 1.0F, 4, 10, 4, 0.0F, false));
			LLeg = new RendererModel(this);
			LLeg.setRotationPoint(4.0F, -15.4F, 4.4F);
			Werewolf.addChild(LLeg);
			LLeg.cubeList.add(new ModelBox(LLeg, 32, 60, -2.0F, 12.4F, -5.4F, 4, 2, 6, 0.0F, false));
			claw_r11 = new RendererModel(this);
			claw_r11.setRotationPoint(-0.1F, 15.4F, -9.4F);
			LLeg.addChild(claw_r11);
			setRotationAngle(claw_r11, -0.3927F, 0.0F, 0.0F);
			claw_r11.cubeList.add(new ModelBox(claw_r11, 27, 0, -2.0F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
			claw_r11.cubeList.add(new ModelBox(claw_r11, 28, 28, 1.2F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
			claw_r11.cubeList.add(new ModelBox(claw_r11, 28, 31, -0.4F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
			leftankle_r1 = new RendererModel(this);
			leftankle_r1.setRotationPoint(0.0F, 14.9F, -3.4F);
			LLeg.addChild(leftankle_r1);
			setRotationAngle(leftankle_r1, -0.3927F, 0.0F, 0.0F);
			leftankle_r1.cubeList.add(new ModelBox(leftankle_r1, 13, 67, -2.0F, -8.0719F, 0.389F, 4, 6, 3, 0.0F, false));
			leftknee_r1 = new RendererModel(this);
			leftknee_r1.setRotationPoint(0.0F, 4.15F, -4.9F);
			LLeg.addChild(leftknee_r1);
			setRotationAngle(leftknee_r1, -0.3927F, 0.0F, 0.0F);
			leftknee_r1.cubeList.add(new ModelBox(leftknee_r1, 60, 0, -1.0F, -0.0719F, 2.389F, 2, 3, 6, 0.0F, false));
			leftcalve_r1 = new RendererModel(this);
			leftcalve_r1.setRotationPoint(0.0F, 5.4F, -4.4F);
			LLeg.addChild(leftcalve_r1);
			setRotationAngle(leftcalve_r1, -0.3927F, 0.0F, 0.0F);
			leftcalve_r1.cubeList.add(new ModelBox(leftcalve_r1, 54, 38, -2.0F, -8.0719F, 0.389F, 4, 10, 4, 0.0F, false));
			RLeg = new RendererModel(this);
			RLeg.setRotationPoint(-4.25F, -15.4F, 4.5F);
			Werewolf.addChild(RLeg);
			RLeg.cubeList.add(new ModelBox(RLeg, 60, 60, -1.75F, 12.4F, -5.5F, 4, 2, 6, 0.0F, false));
			claw_r12 = new RendererModel(this);
			claw_r12.setRotationPoint(1.75F, 15.4F, -9.5F);
			RLeg.addChild(claw_r12);
			setRotationAngle(claw_r12, -0.3927F, 0.0F, 0.0F);
			claw_r12.cubeList.add(new ModelBox(claw_r12, 33, 0, -2.0F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
			claw_r12.cubeList.add(new ModelBox(claw_r12, 16, 37, -0.4F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
			claw_r12.cubeList.add(new ModelBox(claw_r12, 22, 37, -3.6F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
			rightankle_r1 = new RendererModel(this);
			rightankle_r1.setRotationPoint(0.25F, 14.9F, -3.5F);
			RLeg.addChild(rightankle_r1);
			setRotationAngle(rightankle_r1, -0.3927F, 0.0F, 0.0F);
			rightankle_r1.cubeList.add(new ModelBox(rightankle_r1, 67, 49, -2.0F, -8.0719F, 0.389F, 4, 6, 3, 0.0F, false));
			rightknee_r1 = new RendererModel(this);
			rightknee_r1.setRotationPoint(0.25F, 4.15F, -5.0F);
			RLeg.addChild(rightknee_r1);
			setRotationAngle(rightknee_r1, -0.3927F, 0.0F, 0.0F);
			rightknee_r1.cubeList.add(new ModelBox(rightknee_r1, 0, 61, -1.0F, -0.0719F, 2.389F, 2, 3, 6, 0.0F, false));
			rightcalve_r1 = new RendererModel(this);
			rightcalve_r1.setRotationPoint(0.25F, 5.4F, -4.5F);
			RLeg.addChild(rightcalve_r1);
			setRotationAngle(rightcalve_r1, -0.3927F, 0.0F, 0.0F);
			rightcalve_r1.cubeList.add(new ModelBox(rightcalve_r1, 16, 53, -2.0F, -8.0719F, 0.389F, 4, 10, 4, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Werewolf.render(f5);
		}

		public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4, float f5) {
			super.setRotationAngles(e, f, f1, f2, f3, f4, f5);
			this.LLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
