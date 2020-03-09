package ru.imv.tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

        Computer comp = context.getBean("computer", Computer.class);
        System.out.println(comp);
//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
//        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
//        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        Music jazzMusic = context.getBean("jazzMusic", JazzMusic.class);
//        System.out.println(rockMusic.getSong());
//        System.out.println(classicalMusic.getSong());
//        System.out.println(jazzMusic.getSong());

        context.close();
    }
}
