package org.example.training;

import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private final List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
        for (MusicGenre genre : MusicGenre.values()) {
            try {
                Class<? extends Music> musicClass = genre.getMusicClass();
                Constructor<? extends Music> constructor = musicClass.getConstructor();
                Music music = constructor.newInstance();
                musicList.add(music);
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                     InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusic() {
        Music m = musicList.get(new Random().nextInt(musicList.size()));
        System.out.println(m.getSong());
    }
}
