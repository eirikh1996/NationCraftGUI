package io.github.eirikh1996.nationcraftgui.bukkit.guis

import io.github.eirikh1996.nationcraft.api.NationCraftAPI
import io.github.eirikh1996.nationcraft.bukkit.NationCraft
import io.github.eirikh1996.nationcraft.core.commands.CommandRegistry
import io.github.eirikh1996.nationcraftgui.bukkit.NationCraftGUI
import io.github.eirikh1996.nationcraftgui.core.GUI
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryHolder
import org.yaml.snakeyaml.Yaml
import java.io.File
import java.io.FileInputStream

object MainGUI :  InventoryHolder, Listener, GUI {
    private val inventory = Bukkit.createInventory(this, 3)

    init {
        val data = Yaml().loadAs(FileInputStream(File(NationCraftGUI.instance.dataFolder.absolutePath + "/guis/MainGUI.yml")), Map::class.java)
        val defaultItem = Material.getMaterial(data.get("defaultItem") as String)
        for (command in CommandRegistry)
    }

    override fun getInventory(): Inventory {
        return inventory
    }

    @EventHandler
    fun onClick(event : InventoryClickEvent) {
        if (!event.isLeftClick || event.clickedInventory == null || !event.clickedInventory!!.equals(inventory)) {
            return
        }
        event.isCancelled = true

    }

}