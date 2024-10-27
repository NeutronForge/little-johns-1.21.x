package com.echo.little_johns.block.jukebox;

import com.echo.little_johns.sound.ModSoundEvents;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs extends JukeboxSongs {
    RegistryKey<JukeboxSong> MORSMORDRE_CRAZY_DONKEY = of("morsmordre_crazy_donkey");




    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.ofVanilla(id));
    }

    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput)
        );
    }




    static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, MORSMORDRE_CRAZY_DONKEY, ModSoundEvents.MORSMORDRE_CRAZY_DONKEY, 218, 15);
    }



}
