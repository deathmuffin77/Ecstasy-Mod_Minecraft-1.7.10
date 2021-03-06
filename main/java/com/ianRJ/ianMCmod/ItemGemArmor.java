package com.ianRJ.ianMCmod.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemGemArmor extends ItemArmor {

	public ItemGemArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(this.armorType == 2)
		{
		return "irjm:textures/models/armor/gemLayer2.png";
	}
		return "irjm:textures/models/armor/gemLayer1.png";
	}
}
