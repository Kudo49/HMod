
package net.mcreator.bykudo.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.bykudo.itemgroup.HModToolsItemGroup;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class AluminiumAxeItem extends BykudoModElements.ModElement {
	@ObjectHolder("bykudo:aluminium_axe")
	public static final Item block = null;
	public AluminiumAxeItem(BykudoModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 16f;
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
		}.setRegistryName("aluminium_axe"));
	}
}
