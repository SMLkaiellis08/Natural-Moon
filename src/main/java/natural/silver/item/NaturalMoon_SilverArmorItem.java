
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import natural.silver.procedures.Silver_armourProcedure;
import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

import java.util.Map;
import java.util.HashMap;

@NaturalmoonModElements.ModElement.Tag
public class NaturalMoon_SilverArmorItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:natural_moon_silver_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naturalmoon:natural_moon_silver_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("naturalmoon:natural_moon_silver_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("naturalmoon:natural_moon_silver_armor_boots")
	public static final Item boots = null;
	public NaturalMoon_SilverArmorItem(NaturalmoonModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SilveringotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "natural_moon_silver_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(NaturalMoonItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naturalmoon:textures/models/armor/silver_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Silver_armourProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("natural_moon_silver_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(NaturalMoonItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naturalmoon:textures/models/armor/silver_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Silver_armourProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("natural_moon_silver_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(NaturalMoonItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naturalmoon:textures/models/armor/silver_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Silver_armourProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("natural_moon_silver_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(NaturalMoonItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naturalmoon:textures/models/armor/silver_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Silver_armourProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("natural_moon_silver_armor_boots"));
	}
}
