
package net.mcreator.bykudo.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bykudo.itemgroup.HModToolsItemGroup;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class AluminiumShovelItem extends BykudoModElements.ModElement {
	@ObjectHolder("bykudo:aluminium_shovel")
	public static final Item block = null;
	public AluminiumShovelItem(BykudoModElements instance) {
		super(instance, 87);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AluminiumPlateItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(HModToolsItemGroup.tab)) {
		}.setRegistryName("aluminium_shovel"));
	}
}
