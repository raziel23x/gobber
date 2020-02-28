package com.kwpugh.gobber2.items.seeds;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemCustomSeed extends BlockNamedItem
{

	public ItemCustomSeed(String name, Block crop, Properties builder)
	{
        super(crop, builder);

        this.setRegistryName("gobber2:gobber2_seed");       
    }
	
    public List<ModelResourceLocation> getVariants() {
        return Lists.newArrayList(new ModelResourceLocation("gobber2:gobber2_seed", "inventory"));
    }
    
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.BLUE + "Plant on Farmland to grow Gobber Plant"));
	} 
}