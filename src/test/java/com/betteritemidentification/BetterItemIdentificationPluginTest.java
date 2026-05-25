package com.betteritemidentification;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BetterItemIdentificationPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BetterItemIdentificationPlugin.class);
		RuneLite.main(args);
	}
}