package com.betteritemidentification;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("betteritemidentification")
public interface BetterItemIdentificationConfig extends Config
{
	@ConfigSection(
		name = "Categories",
		description = "The categories of items to identify.",
		position = 99
	)
	String identificationSection = "identification";

	@ConfigItem(
		keyName = "identificationType",
		name = "Identification type",
		position = -4,
		description = "How much to show of the item name."
	)
	default BetterItemIdentificationMode identificationType()
	{
		return BetterItemIdentificationMode.SHORT;
	}

	@ConfigItem(
		keyName = "textColor",
		name = "Color",
		position = -3,
		description = "The color of the identification text."
	)
	default Color textColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		keyName = "showHerbSeeds",
		name = "Seeds (herb)",
		description = "Show identification on herb seeds.",
		section = identificationSection
	)
	default boolean showHerbSeeds()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showAllotmentSeeds",
		name = "Seeds (allotment)",
		description = "Show identification on allotment seeds.",
		section = identificationSection
	)
	default boolean showAllotmentSeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showFlowerSeeds",
		name = "Seeds (flower)",
		description = "Show identification on flower seeds.",
		section = identificationSection
	)
	default boolean showFlowerSeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showFruitTreeSeeds",
		name = "Seeds (fruit tree)",
		description = "Show identification on fruit tree seeds.",
		section = identificationSection
	)
	default boolean showFruitTreeSeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showTreeSeeds",
		name = "Seeds (tree)",
		description = "Show identification on tree seeds.",
		section = identificationSection
	)
	default boolean showTreeSeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showSpecialSeeds",
		name = "Seeds (special)",
		description = "Show identification on special seeds.",
		section = identificationSection
	)
	default boolean showSpecialSeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showBerrySeeds",
		name = "Seeds (berry)",
		description = "Show identification on berry seeds.",
		section = identificationSection
	)
	default boolean showBerrySeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showHopSeeds",
		name = "Seeds (hops)",
		description = "Show identification on hops seeds.",
		section = identificationSection
	)
	default boolean showHopsSeeds()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showCoralFrags",
		name = "Coral Frags",
		description = "Show identification on coral frags.",
		section = identificationSection
	)
	default boolean showCoralFrags()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showSacks",
		name = "Sacks",
		description = "Show identification on sacks.",
		section = identificationSection
	)
	default boolean showSacks()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showHerbs",
		name = "Herbs",
		description = "Show identification on herbs.",
		section = identificationSection
	)
	default boolean showHerbs()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showLogs",
		name = "Logs",
		description = "Show identification on logs.",
		section = identificationSection
	)
	default boolean showLogs()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showPyreLogs",
		name = "Logs (pyre)",
		description = "Show identification on pyre logs.",
		section = identificationSection
	)
	default boolean showPyreLogs()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showPlanks",
		name = "Planks",
		description = "Show identification on planks.",
		section = identificationSection
	)
	default boolean showPlanks()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showRepairKits",
		name = "Repair Kits",
		description = "Show identification on repair kits.",
		section = identificationSection
	)
	default boolean showRepairKits()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showYarn",
		name = "Yarn",
		description = "Show identification on yarns.",
		section = identificationSection
	)
	default boolean showYarn()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showCloth",
		name = "Cloth",
		description = "Show identification on bolts of cloth.",
		section = identificationSection
	)
	default boolean showCloth()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showSaplings",
		name = "Saplings",
		description = "Show identification on saplings and seedlings.",
		section = identificationSection
	)
	default boolean showSaplings()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showComposts",
		name = "Composts",
		description = "Show identification on composts.",
		section = identificationSection
	)
	default boolean showComposts()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showOres",
		name = "Ores",
		description = "Show identification on ores.",
		section = identificationSection
	)
	default boolean showOres()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showBars",
		name = "Bars",
		description = "Show identification on bars.",
		section = identificationSection
	)
	default boolean showBars()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showGems",
		name = "Gems",
		description = "Show identification on gems.",
		section = identificationSection
	)
	default boolean showGems()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showPotions",
		name = "Potions",
		description = "Show identification on potions.",
		section = identificationSection
	)
	default boolean showPotions()
	{
		return false;
	}

	@ConfigItem(
			keyName = "showUnfPotions",
			name = "Unfinished Potions",
			description = "Show identification on unfinished potions.",
			section = identificationSection
	)
	default boolean showUnfPotions()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showButterflyMothJars",
		name = "Butterfly & Moth jars",
		description = "Show identification on Butterfly and Moth jars",
		section = identificationSection
	)
	default boolean showButterflyMothJars()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showImplingJars",
		name = "Impling jars",
		description = "Show identification on impling jars.",
		section = identificationSection
	)
	default boolean showImplingJars()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showTablets",
		name = "Tablets",
		description = "Show identification on tablets.",
		section = identificationSection
	)
	default boolean showTablets()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showTeleportScrolls",
		name = "Teleport scrolls",
		description = "Show identification on teleport scrolls.",
		section = identificationSection
	)
	default boolean showTeleportScrolls()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showJewellery",
		name = "Jewellery (unenchanted)",
		description = "Show identification on unenchanted jewellery.",
		section = identificationSection
	)
	default boolean showJewellery()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showEnchantedJewellery",
		name = "Jewellery (enchanted)",
		description = "Show identification on enchanted jewellery.",
		section = identificationSection
	)
	default boolean showEnchantedJewellery()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showWines",
		name = "Wines",
		description = "Show identification on jugs of wine.",
		section = identificationSection
	)
	default boolean showWines()
	{
		return false;
	}
}
