package ru.imv.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", player=" + player.getMusic().getSong() +
                '}';
    }
}//public class Computer
