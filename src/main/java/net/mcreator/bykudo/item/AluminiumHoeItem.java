
package net.mcreator.bykudo.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.bykudo.itemgroup.HModToolsItemGroup;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class AluminiumHoeItem extends BykudoModElements.ModElement {
	@ObjectHolder("bykudo:aluminium_hoe")
	public static final Item block = null;
	public AluminiumHoeItem(BykudoModElements instance) {
		super(instance, 88);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, 0, -3f, new Item.Properties().group(HModToolsItemGroup.tab)) {
		}.setRegistryName("aluminium_hoe"));
	}
}
