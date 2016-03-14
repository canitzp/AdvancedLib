package de.canitzp.advancedlib.util;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
