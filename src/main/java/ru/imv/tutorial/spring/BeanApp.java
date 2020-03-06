package ru.imv.tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playList();
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        context.close();
    }
}
