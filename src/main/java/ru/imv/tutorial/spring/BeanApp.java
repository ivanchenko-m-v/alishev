package ru.imv.tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();

        context.close();
    }
}
