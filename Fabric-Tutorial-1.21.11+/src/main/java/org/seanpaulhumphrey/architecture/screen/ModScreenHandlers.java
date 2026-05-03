package org.seanpaulhumphrey.architecture.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.screen.custom.PillarScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PillarScreenHandler> PILLAR_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Architecture.MOD_ID, "pillar_screen_handler"),
                    new ExtendedScreenHandlerType<>(PillarScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        Architecture.LOGGER.info("Registering Screen Handlers for " + Architecture.MOD_ID);
    }
}
