package org.seanpaulhumphrey.architecture.sound;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Architecture.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Architecture.LOGGER.info("Registering Mod Sounds for " + Architecture.MOD_ID);
    }
}
