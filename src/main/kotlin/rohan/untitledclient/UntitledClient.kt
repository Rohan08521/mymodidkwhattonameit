package rohan.untitledclient

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object UntitledClient : ModInitializer {
    private val logger = LoggerFactory.getLogger("untitled-client")

	override fun onInitialize() {

		logger.info("Hello Fabric world!")
	}
}