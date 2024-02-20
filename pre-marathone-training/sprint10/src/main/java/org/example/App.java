package org.example;

import org.example.training.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

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
