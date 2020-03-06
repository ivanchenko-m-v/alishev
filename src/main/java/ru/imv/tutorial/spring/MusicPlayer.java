package ru.imv.tutorial.spring;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playList() {
        if (musicList == null || musicList.isEmpty()) {
            return;
        }
        System.out.println("Playing list:");
        musicList.stream().forEach(m -> playMusic(m));
    }

    private void playMusic(final Music music) {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
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

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
