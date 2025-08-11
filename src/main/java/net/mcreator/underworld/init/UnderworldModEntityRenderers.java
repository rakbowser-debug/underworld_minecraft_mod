/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.underworld.client.renderer.VampireCoreRenderer;
import net.mcreator.underworld.client.renderer.VampireBatRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnderworldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UnderworldModEntities.VAMPIRE_CORE.get(), VampireCoreRenderer::new);
		event.registerEntityRenderer(UnderworldModEntities.VAMPIRE_BAT.get(), VampireBatRenderer::new);
	}
}