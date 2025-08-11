package net.mcreator.underworld.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.underworld.world.inventory.DelusionWoodSignGuiMenu;
import net.mcreator.underworld.init.UnderworldModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class DelusionWoodSignGuiScreen extends AbstractContainerScreen<DelusionWoodSignGuiMenu> implements UnderworldModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox textVar;
	Button button_ready;

	public DelusionWoodSignGuiScreen(DelusionWoodSignGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("underworld:textures/screens/delusion_wood_sign_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		textVar.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("underworld:textures/screens/enchanted_player_gui.png"), this.leftPos + -89, this.topPos + -98, 0, 0, 176, 166, 176, 166);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (textVar.isFocused())
			return textVar.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		textVar.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String textVarValue = textVar.getValue();
		super.resize(minecraft, width, height);
		textVar.setValue(textVarValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		textVar = new EditBox(this.font, this.leftPos + -61, this.topPos + -18, 118, 18, Component.translatable("gui.underworld.delusion_wood_sign_gui.textVar"));
		textVar.setMaxLength(8192);
		textVar.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "textVar", content, false);
		});
		this.addWidget(this.textVar);
		button_ready = Button.builder(Component.translatable("gui.underworld.delusion_wood_sign_gui.button_ready"), e -> {
		}).bounds(this.leftPos + -30, this.topPos + 12, 56, 20).build();
		this.addRenderableWidget(button_ready);
	}
}