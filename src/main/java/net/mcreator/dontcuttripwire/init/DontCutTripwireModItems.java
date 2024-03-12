
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dontcuttripwire.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dontcuttripwire.item.CutItem;
import net.mcreator.dontcuttripwire.DontCutTripwireMod;

public class DontCutTripwireModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DontCutTripwireMod.MODID);
	public static final RegistryObject<Item> CUT = REGISTRY.register("cut", () -> new CutItem());
}
