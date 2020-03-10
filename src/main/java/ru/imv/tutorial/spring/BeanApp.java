package ru.imv.tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class BeanApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        //10 случайных песен разных жанров
        //IntStream.range(0, 10).forEach(i -> player.playMusic(getRandomMusicGenre()));
        //Значение properties
        System.out.println("PlayerName: " + player.getName());
        System.out.println("volume: " + player.getVolume());
        //Scope
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);


        context.close();
    }

    private static MusicGenre getRandomMusicGenre() {
        MusicGenre[] genres = MusicGenre.values();
        return genres[(int) ((double) genres.length * Math.random())];
    }
}
