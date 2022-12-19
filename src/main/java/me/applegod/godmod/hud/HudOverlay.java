package me.applegod.godmod.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

import java.awt.*;

public class HudOverlay {

    public static final IGuiOverlay HUD_OVERLAY = ((gui, poseStack, partialTick, screenWidth, screenHeight) -> {

        int x = screenWidth / 2;
        int y = screenHeight;

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(255, 119, 249, 160);
        GuiComponent.drawString(poseStack, Minecraft.getInstance().font, "GodMod", 3, 3, 0x77F9C6);

        // GuiComponent.drawString(Font.getFont("Comic Sans MS"));


    });

}
