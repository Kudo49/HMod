
package net.mcreator.bykudo.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bykudo.item.SteelSwordItem;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class HModToolsItemGroup extends BykudoModElements.ModElement {
	public HModToolsItemGroup(BykudoModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabh_mod_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SteelSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
