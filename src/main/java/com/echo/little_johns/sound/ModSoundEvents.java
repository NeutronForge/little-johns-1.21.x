package com.echo.little_johns.sound;

import com.echo.little_johns.LittleJohns;

import com.google.common.collect.ImmutableList;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.stream.IntStream;

public class ModSoundEvents extends SoundEvents {
    public static final RegistryEntry.Reference<SoundEvent> MORSMORDRE_CRAZY_DONKEY = registerReference("morsmordre_crazy_donkey.13");

    private static RegistryEntry<SoundEvent> register(Identifier id, Identifier soundId, float distanceToTravel) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId, distanceToTravel));
    }


    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Identifier.ofVanilla(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return registerReference(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }


    public static void registerSounds() {
        LittleJohns.LOGGER.info("Registering Sounds for " + LittleJohns.MOD_ID);
    }
}
