package name.minecraft_jacky_mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftJackyMod implements ModInitializer {
	public static final String MOD_ID = "minecraft_jacky_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraft_jacky_mod");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}