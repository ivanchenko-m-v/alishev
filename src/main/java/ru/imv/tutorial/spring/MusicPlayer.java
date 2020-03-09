package ru.imv.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private Music music;

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    //
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    public Music getMusic() {
        return music;
    }

}
