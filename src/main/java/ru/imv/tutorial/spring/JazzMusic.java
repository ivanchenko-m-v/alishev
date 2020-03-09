package ru.imv.tutorial.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    private static List<String> playList = new ArrayList<>();

    static {
        playList.add("JAZZ:\tFly Me To The Moon — Frank Sinatra");
        playList.add("JAZZ:\tFor Keeps — Romantic Love Songs Academy");
        playList.add("JAZZ:\tTake the Time Out — Exam Study Soft Jazz Music Collective");
        playList.add("JAZZ:\tDreamers — Smooth Jazz Sax Instrumentals");
        playList.add("JAZZ:\tA Pretty Face Like Yours — Perfect Dinner Music");
        playList.add("JAZZ:\tAbsolutely — Romantic Love Songs Academy");
        playList.add("JAZZ:\tBebop — Lounge Café");
        playList.add("JAZZ:\tFootprints — Romantic Love Songs Academy");
    }

    @Override
    public String getSong() {
        return playList.get(0);
    }

    @Override
    public String getRandomSong() {
        return playList.get((int) (Math.random() * (double) playList.size()));
    }
}
