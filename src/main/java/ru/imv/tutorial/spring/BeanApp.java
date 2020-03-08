package ru.imv.tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

        Music classicalMusic = context.getBean("classicalBean", ClassicalMusic.class);
        Music classicalMusic1 = context.getBean("classicalBean", ClassicalMusic.class);

        System.out.println("Playing0: " + classicalMusic.getSong());
        System.out.println("Playing1: " + classicalMusic1.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(11);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
