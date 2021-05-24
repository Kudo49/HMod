
package net.mcreator.bykudo.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bykudo.block.BauxitOreBlock;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class HModOresAndMaterialsItemGroup extends BykudoModElements.ModElement {
	public HModOresAndMaterialsItemGroup(BykudoModElements instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabh_mod_ores_and_materials") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BauxitOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
