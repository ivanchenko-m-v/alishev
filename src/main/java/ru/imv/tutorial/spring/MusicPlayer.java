package ru.imv.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicGenres;

    @Value("${musicPlayer.name}")
    String name;
    @Value("${musicPlayer.volume}")
    int volume;

    public MusicPlayer(List<Music> musicGenres) {
        this.musicGenres = musicGenres;
    }

    public void playMusic() {
        if (this.musicGenres == null || this.musicGenres.isEmpty()) {
            return;
        }
        System.out.println("Playing: " + getRandomMusicGenre().getRandomSong());
    }

    private Music getRandomMusicGenre() {
        return musicGenres.get((int) (Math.random() * musicGenres.size()));
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
