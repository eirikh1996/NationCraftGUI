package io.github.eirikh1996.nationcraftgui.core

import io.github.eirikh1996.nationcraft.api.player.NCPlayer

object GUIEnabled : Iterable<NCPlayer> {
    val players = HashSet<NCPlayer>()

    override fun iterator(): Iterator<NCPlayer> {
        return players.iterator()
    }
}