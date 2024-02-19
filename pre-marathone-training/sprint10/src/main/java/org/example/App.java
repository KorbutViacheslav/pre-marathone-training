package org.example;

import org.example.training.MusicPlayer;
import org.example.training.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Viacheslav Korbut
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
