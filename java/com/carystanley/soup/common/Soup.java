package com.carystanley.soup.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.carystanley.soup.common.item.SoupBase;

import net.minecraft.util.RegistryNamespaced;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

@Mod(modid = "carystanley_soup", name = "Soup", version = "1.0")

public class Soup {
	public static Item chickenNoodleSoup = (new SoupBase(9)).setUnlocalizedName("soup:chickenNoodleSoup").setTextureName("soup:chicken_noodle_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item carrotSoup = (new SoupBase(9)).setUnlocalizedName("soup:carrotSoup").setTextureName("soup:carrot_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item beefStew = (new SoupBase(9)).setUnlocalizedName("soup:beefStew").setTextureName("soup:beef_stew").setCreativeTab(CreativeTabs.tabFood);
	public static Item potatoSoup = (new SoupBase(3)).setUnlocalizedName("soup:potatoSoup").setTextureName("soup:potato_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item pumpkinSoup = (new SoupBase(1)).setUnlocalizedName("soup:pumpkinSoup").setTextureName("soup:pumpkin_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item wontonSoup = (new SoupBase(11)).setUnlocalizedName("soup:wontonSoup").setTextureName("soup:wonton_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item mulligatawnySoup = (new SoupBase(11)).setUnlocalizedName("soup:mulligatawnySoup").setTextureName("soup:mulligatawny_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item splitPeaSoup = (new SoupBase(1)).setUnlocalizedName("soup:splitPeaSoup").setTextureName("soup:split_pea_soup").setCreativeTab(CreativeTabs.tabFood);
	public static Item cactusSoup = (new SoupBase(1)).setUnlocalizedName("soup:cactusSoup").setTextureName("soup:cactus_soup").setCreativeTab(CreativeTabs.tabFood);

	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
        loadItems();
	}
	 
	@EventHandler
	public void init(FMLInitializationEvent event) {
		loadRecipes();
	}

	public void loadItems() {
		GameRegistry.registerItem(Soup.chickenNoodleSoup, "chicken_noodle_soup", "soup");    
		GameRegistry.registerItem(Soup.carrotSoup, "carrot_soup", "soup");    
		GameRegistry.registerItem(Soup.beefStew, "beef_stew", "soup");    
		GameRegistry.registerItem(Soup.potatoSoup, "potato_soup", "soup");    
		GameRegistry.registerItem(Soup.pumpkinSoup, "pumpkin_soup", "soup");    
		GameRegistry.registerItem(Soup.wontonSoup, "wonton_soup", "soup");    
		GameRegistry.registerItem(Soup.mulligatawnySoup, "mulligatawny_soup", "soup");    
		GameRegistry.registerItem(Soup.splitPeaSoup, "split_pea_soup", "soup");    
		GameRegistry.registerItem(Soup.cactusSoup, "cactus_soup", "soup");    
	}
	
	public void loadRecipes() {
		// Chicken Noodle Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.chickenNoodleSoup, 1), new Object[] {
			Items.bowl,
			Items.cooked_chicken,
			Items.wheat
		});

		// Carrot Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.carrotSoup, 1), new Object[] {
			Items.bowl,
			Items.carrot,
			Items.carrot
		});

		// Beef Stew Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.beefStew, 1), new Object[] {
			Items.bowl,
			Items.cooked_beef,
			Blocks.brown_mushroom
		});

		// Potato Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.potatoSoup, 1), new Object[] {
			Items.bowl,
			Items.potato,
			Items.potato
		});

		// Pumpkin Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.pumpkinSoup, 1), new Object[] {
			Items.bowl,
			Blocks.pumpkin,
			Blocks.pumpkin
		});

		// Wonton Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.wontonSoup, 1), new Object[] {
			Items.bowl,
			Items.wheat,
			Items.cooked_chicken
		});

		// Mulligatawny Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.mulligatawnySoup, 1), new Object[] {
			Items.bowl,
			Items.cooked_chicken,
			Items.apple
		});

		// Split Pea Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.splitPeaSoup, 1), new Object[] {
			Items.bowl,
			Items.wheat_seeds,
			Items.wheat_seeds
		});

		// Cactus Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.cactusSoup, 1), new Object[] {
			Items.bowl,
			Blocks.cactus,
			Blocks.cactus
		});
	}

}
