package ru.imv.tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class BeanApp {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        //Значение properties
        System.out.println("PlayerName: " + player.getName());
        System.out.println("volume: " + player.getVolume());

        //Проигрывание 10 случайных песен разных жанров музыки
        IntStream.range(0, 10).forEach(val -> player.playMusic());

        context.close();
    }

    private static MusicGenre getRandomMusicGenre() {
        MusicGenre[] genres = MusicGenre.values();
        return genres[(int) ((double) genres.length * Math.random())];
    }
}
