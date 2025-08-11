/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.underworld.client.model.ModelVampire_bat;
import net.mcreator.underworld.client.model.ModelVampire_Humanoid_Entity;
import net.mcreator.underworld.client.model.ModelShade_of_VampireCore;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UnderworldModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelVampire_bat.LAYER_LOCATION, ModelVampire_bat::createBodyLayer);
		event.registerLayerDefinition(ModelShade_of_VampireCore.LAYER_LOCATION, ModelShade_of_VampireCore::createBodyLayer);
		event.registerLayerDefinition(ModelVampire_Humanoid_Entity.LAYER_LOCATION, ModelVampire_Humanoid_Entity::createBodyLayer);
	}
}