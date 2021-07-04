package io.github.eirikh1996.nationcraftgui.bukkit

import io.github.eirikh1996.nationcraft.bukkit.NationCraft
import org.bukkit.plugin.java.JavaPlugin

class NationCraftGUI : JavaPlugin() {
    lateinit var nationCraftPlugin : NationCraft

    override fun onEnable() {
        val ncraft = server.pluginManager.getPlugin("NationCraft")
        if (ncraft !is NationCraft || !ncraft.isEnabled) {
            logger.severe("Required dependency NationCraft was either not found or is disabled")
            server.pluginManager.disablePlugin(this)
            return
        }
        nationCraftPlugin = ncraft
    }

    override fun onLoad() {
        instance = this
    }

    companion object {
        lateinit var instance : NationCraftGUI
    }
}