package org.example.training;

import org.springframework.stereotype.Component;

/**
 * Author: Viacheslav Korbut
 * Date: 20.02.2024
 */

public enum MusicGenre {
    ROCKMUSIC(RockMusic.class),
    POPMUSIC(PopMusic.class),
    CLASSICALMUSIC(ClassicalMusic.class);
    private final Class<? extends Music> musicClass;

    MusicGenre(Class<? extends Music> musicClass) {
        this.musicClass = musicClass;
    }

    public Class<? extends Music> getMusicClass() {
        return musicClass;
    }
}
