package io.github.eirikh1996.nationcraftgui.bukkit.commands

import io.github.eirikh1996.nationcraft.api.player.NCPlayer
import io.github.eirikh1996.nationcraft.api.player.PlayerManager
import io.github.eirikh1996.nationcraftgui.bukkit.guis.MainGUI
import io.github.eirikh1996.nationcraftgui.core.GUIEnabled
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player

object NationCraftGUICommand : TabExecutor {
    val guiEnabled = HashSet<NCPlayer>()
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (!command.name.equals("nationcraftgui", true)) {
            return false
        }
        if (sender is Player) {
            val ncp = PlayerManager.getInstance().getPlayer(sender)
            if (args.size == 0) {
                if (GUIEnabled.players.contains(ncp)) {
                    sender.openInventory(MainGUI.inventory)
                }
            }
        }

        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): MutableList<String> {
        TODO("Not yet implemented")
    }

    private fun openGui(p : NCPlayer) {

    }
}