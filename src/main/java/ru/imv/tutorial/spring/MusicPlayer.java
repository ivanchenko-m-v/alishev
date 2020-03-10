package ru.imv.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${musicPlayer.name}")
    String name;
    @Value("${musicPlayer.volume}")
    int volume;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
