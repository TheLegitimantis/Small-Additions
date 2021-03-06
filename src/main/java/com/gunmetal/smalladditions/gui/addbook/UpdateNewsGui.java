package com.gunmetal.smalladditions.gui.addbook;

import com.gunmetal.smalladditions.gui.GuiBase;
import com.gunmetal.smalladditions.util.ColorUtils;
import com.gunmetal.smalladditions.util.Constants;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/** This class is one of the GUIs of the Additionomicon. <br>
 *  Functionally, it is very similar to AddBookGui. <br>
 *  If you need to know how the methods in this class work, refer to AddBookGui.java.
 *  
 * @author Lucas Crow / Gunmetal_Gears
 *
 */
public class UpdateNewsGui extends GuiBase {
	protected int centerX = screenHeight / 2;
	protected int centerY = screenHeight / 2;
	
	@Override
	public void initGui() {
		this.buttonList.clear();
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.drawDefaultBackground();
		this.mc.renderEngine.bindTexture(new ResourceLocation(Constants.MODID + ":" + "textures/gui/addbook.png"));
		drawTexturedModalRect(centerX, centerY, 0, 0, 256, 256); 
		this.drawCenteredString(mc.fontRendererObj, "Update News", centerX + 128, centerY + 16, ColorUtils.WHITE);		
		super.drawScreen(0, 0, TICKS);		
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
//	@Override
//	public void actionPerformed(GuiButton button) {
//		switch (button.id) {
//		case 0: //update news
//			//this.mc.thePlayer.closeScreen();
//			this.mc.displayGuiScreen(new AddBookGui());
//			break;
//		case 1:
//			//do something with button id 1 here
//		case 2:
//			//button 2
//		case 3: 
//			//etc...
//		}
//	}
}
