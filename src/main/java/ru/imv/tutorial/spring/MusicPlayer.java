package ru.imv.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music classicalMusic;
    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;
    @Autowired
    @Qualifier("jazzMusic")
    private Music jazzMusic;

    public void playMusic(MusicGenre genre) {
        Music music;
        switch (genre){
            case CLASSICAL:
                music=classicalMusic;
                break;
            case ROCK:
                music=rockMusic;
                break;
            case JAZZ:
                music=jazzMusic;
                break;
            default:
                throw new RuntimeException("Undefined music genre");
        }
        System.out.println("Playing: " + music.getRandomSong());
    }
}
