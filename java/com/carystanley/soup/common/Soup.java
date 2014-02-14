package com.carystanley.soup.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
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
        public static final RegistryNamespaced itemRegistry = GameData.itemRegistry;

	public static Item chickenNoodleSoup = (new SoupBase(9)).setUnlocalizedName("chickenNoodleSoup").setTextureName("soup:chicken_noodle_soup");
	public static Item carrotSoup = (new SoupBase(9)).setUnlocalizedName("carrotSoup").setTextureName("soup:carrot_soup");
	public static Item beefStew = (new SoupBase(9)).setUnlocalizedName("beefStew").setTextureName("soup:beef_stew");
	public static Item potatoSoup = (new SoupBase(3)).setUnlocalizedName("potatoSoup").setTextureName("soup:potato_soup");
	public static Item pumpkinSoup = (new SoupBase(1)).setUnlocalizedName("pumpkinSoup").setTextureName("soup:pumpkin_soup");
	public static Item wontonSoup = (new SoupBase(11)).setUnlocalizedName("wontonSoup").setTextureName("soup:wonton_soup");
	public static Item mulligatawnySoup = (new SoupBase(11)).setUnlocalizedName("mulligatawnySoup").setTextureName("soup:mulligatawny_soup");
	public static Item splitPeaSoup = (new SoupBase(1)).setUnlocalizedName("splitPeaSoup").setTextureName("soup:split_pea_soup");
	public static Item cactusSoup = (new SoupBase(1)).setUnlocalizedName("cactusSoup").setTextureName("soup:cactus_soup");

	public void init(FMLInitializationEvent event) {
                loadItems();
		loadRecipes();
		loadLang();
	}

	public void loadItems() {
		itemRegistry.addObject(5670, "chicken_noodle_soup", Soup.chickenNoodleSoup);    
		itemRegistry.addObject(5671, "carrot_soup", Soup.carrotSoup);    
		itemRegistry.addObject(5672, "beef_stew", Soup.beefStew);    
		itemRegistry.addObject(5673, "potato_soup", Soup.potatoSoup);    
		itemRegistry.addObject(5674, "pumpkin_soup", Soup.pumpkinSoup);    
		itemRegistry.addObject(5675, "wonton_soup", Soup.wontonSoup);    
		itemRegistry.addObject(5676, "mulligatawny_soup", Soup.mulligatawnySoup);    
		itemRegistry.addObject(5677, "split_pea_soup", Soup.splitPeaSoup);    
		itemRegistry.addObject(5678, "cactus_soup", Soup.cactusSoup);    
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
	
	public void loadLang() {
		LanguageRegistry.addName(Soup.chickenNoodleSoup, "Chicken Noodle Soup");
		LanguageRegistry.addName(Soup.carrotSoup, "Carrot Soup");
		LanguageRegistry.addName(Soup.beefStew, "Beef Stew");
		LanguageRegistry.addName(Soup.potatoSoup, "Potato Soup");
		LanguageRegistry.addName(Soup.pumpkinSoup, "Pumpkin Soup");
		LanguageRegistry.addName(Soup.wontonSoup, "Wonton Soup");
		LanguageRegistry.addName(Soup.mulligatawnySoup, "Mulligatawny Soup");
		LanguageRegistry.addName(Soup.splitPeaSoup, "Split Pea Soup");
		LanguageRegistry.addName(Soup.cactusSoup, "Cactus Soup");
	}

}
