
package net.mcreator.bykudo.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bykudo.itemgroup.HModOresAndMaterialsItemGroup;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class SteelDustItem extends BykudoModElements.ModElement {
	@ObjectHolder("bykudo:steel_dust")
	public static final Item block = null;
	public SteelDustItem(BykudoModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(HModOresAndMaterialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("steel_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
