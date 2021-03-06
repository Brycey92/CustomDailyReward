package com.meteor.dailyreward.config;

import java.util.Set;

import com.meteor.dailyreward.lib.LibMisc;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ConfigGuiFactory implements IModGuiFactory {

	 @Override
	 public void initialize(Minecraft minecraftInstance){

	 }

	 @Override
	 public Set<RuntimeOptionCategoryElement> runtimeGuiCategories(){
		 return null;
	 }

	 @Override
	 public boolean hasConfigGui(){
		return true;
	 }

	 @Override
	 public GuiScreen createConfigGui(GuiScreen parentScreen){
		 return new GuiConfig(parentScreen, new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), LibMisc.MOD_ID, false, false, LibMisc.MOD_ID, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
	 }
}
