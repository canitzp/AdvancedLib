package de.canitzp.advancedlib;

import de.canitzp.advancedlib.util.IMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
