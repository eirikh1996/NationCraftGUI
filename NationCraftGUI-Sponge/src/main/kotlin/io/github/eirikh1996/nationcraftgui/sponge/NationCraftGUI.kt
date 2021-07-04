package io.github.eirikh1996.nationcraftgui.sponge

import org.spongepowered.api.plugin.Dependency
import org.spongepowered.api.plugin.Plugin

@Plugin(
    id = "nationcraftgui",
    name = "NationCraftGUI",
    version = "1.0",
    dependencies = [
        Dependency(id = "nationcraft")
    ]
)
class NationCraftGUI {
}