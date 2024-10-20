package com.noobnuby.plugin

import com.noobnuby.plugin.command.Steam
import com.noobnuby.plugin.handler.ButtonClick
import net.projecttl.p.x32.api.Plugin
import net.projecttl.p.x32.api.command.commandHandler

class Main : Plugin() {
	override fun onLoad() {

		logger.info("Enable Steam plugin!")

		addHandler(ButtonClick)
		addHandler(commandHandler { handler ->
			handler.addCommand(Steam)
		})
	}

	override fun destroy() {
		logger.info("Disable Steam plugin")
	}
}

