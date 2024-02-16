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

        var musicPlayerRock = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayerRock.playMusic();
        context.close();
    }
}
