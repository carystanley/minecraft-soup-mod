package com.carystanley.soup.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.carystanley.soup.common.item.SoupBase;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "carystanley_soup", name = "Soup", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Soup {

	public static Item chickenNoodleSoup = (new SoupBase(5670, 9)).setUnlocalizedName("chickenNoodleSoup").setTextureName("soup:chicken_noodle_soup");
	public static Item carrotSoup = (new SoupBase(5671, 9)).setUnlocalizedName("carrotSoup").setTextureName("soup:carrot_soup");
	public static Item beefStew = (new SoupBase(5672, 9)).setUnlocalizedName("beefStew").setTextureName("soup:beef_stew");
	public static Item potatoSoup = (new SoupBase(5673, 3)).setUnlocalizedName("potatoSoup").setTextureName("soup:potato_soup");
	public static Item pumpkinSoup = (new SoupBase(5674, 1)).setUnlocalizedName("pumpkinSoup").setTextureName("soup:pumpkin_soup");
	public static Item wontonSoup = (new SoupBase(5675, 11)).setUnlocalizedName("wontonSoup").setTextureName("soup:wonton_soup");
	public static Item mulligatawnySoup = (new SoupBase(5676, 11)).setUnlocalizedName("mulligatawnySoup").setTextureName("soup:mulligatawny_soup");
	public static Item splitPeaSoup = (new SoupBase(5677, 1)).setUnlocalizedName("splitPeaSoup").setTextureName("soup:split_pea_soup");
	public static Item cactusSoup = (new SoupBase(5678, 1)).setUnlocalizedName("cactusSoup").setTextureName("soup:cactus_soup");

	@Init
	public void load(FMLInitializationEvent event) {
		loadRecipes();
		loadLang();
	}
	
	public void loadRecipes() {
		// Chicken Noodle Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.chickenNoodleSoup, 1), new Object[] {
			Item.bowlEmpty,
			Item.chickenCooked,
			Item.wheat
		});

		// Carrot Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.carrotSoup, 1), new Object[] {
			Item.bowlEmpty,
			Item.carrot,
			Item.carrot
		});

		// Beef Stew Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.beefStew, 1), new Object[] {
			Item.bowlEmpty,
			Item.beefCooked,
			Block.mushroomBrown
		});

		// Potato Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.potatoSoup, 1), new Object[] {
			Item.bowlEmpty,
			Item.potato,
			Item.potato
		});

		// Pumpkin Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.pumpkinSoup, 1), new Object[] {
			Item.bowlEmpty,
			Block.pumpkin,
			Block.pumpkin
		});

		// Wonton Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.wontonSoup, 1), new Object[] {
			Item.bowlEmpty,
			Item.wheat,
			Item.porkCooked
		});

		// Mulligatawny Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.mulligatawnySoup, 1), new Object[] {
			Item.bowlEmpty,
			Item.chickenCooked,
			Item.appleRed
		});

		// Split Pea Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.splitPeaSoup, 1), new Object[] {
			Item.bowlEmpty,
			Item.seeds,
			Item.seeds
		});

		// Cactus Soup Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Soup.cactusSoup, 1), new Object[] {
			Item.bowlEmpty,
			Block.cactus,
			Block.cactus
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
