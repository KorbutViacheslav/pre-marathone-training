package org.example;

import org.example.training.Music;
import org.example.training.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Viacheslav Korbut
 */
public class App {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music rockMusic = context.getBean("rockMusic", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayerRock = new MusicPlayer(rockMusic);
        MusicPlayer musicPlayerClassical = new MusicPlayer(classicalMusic);
        musicPlayerRock.playMusic();
        musicPlayerClassical.playMusic();
        context.close();
    }
}
