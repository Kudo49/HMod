
package net.mcreator.bykudo.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bykudo.item.SteelArmorItem;
import net.mcreator.bykudo.BykudoModElements;

@BykudoModElements.ModElement.Tag
public class HModArmorsItemGroup extends BykudoModElements.ModElement {
	public HModArmorsItemGroup(BykudoModElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabh_mod_armors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SteelArmorItem.body, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
