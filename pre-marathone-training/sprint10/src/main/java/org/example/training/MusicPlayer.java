package org.example.training;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music music;

    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }
}
