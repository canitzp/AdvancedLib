package de.canitzp.advancedlib.util;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author canitzp
 */
public interface IMod {

    @Mod.EventHandler
    void preInitialization(FMLPreInitializationEvent event);

    @Mod.EventHandler
    void initialization(FMLInitializationEvent event);

    @Mod.EventHandler
    void postInitialization(FMLPostInitializationEvent event);

}
