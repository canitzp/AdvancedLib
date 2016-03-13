package de.canitzp.advancedlib;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.canitzp.advancedlib.util.IMod;

/**
 * @author canitzp
 */
@Mod(modid = AdvancedLib.MODID, name = AdvancedLib.NAME, version = AdvancedLib.VERSION)
public class AdvancedLib implements IMod {

    public static final String MODID = "advancedlib";
    public static final String NAME = "@MODNAME@";
    public static final String VERSION = "@VERSION@";

    @Mod.EventHandler
    @Override
    public void preInitialization(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    @Override
    public void initialization(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    @Override
    public void postInitialization(FMLPostInitializationEvent event) {

    }

}
