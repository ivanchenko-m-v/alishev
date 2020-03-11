package ru.imv.tutorial.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private static List<String> playList = new ArrayList<>();

    static {
        playList.add("ROCK:\tBreak on Through (To the Other Side) — The Doors");
        playList.add("ROCK:\tGo Your Own Way — Fleetwood Mac");
        playList.add("ROCK:\tOwner of a Lonely Heart 2008 Remaster — Yes");
        playList.add("ROCK:\tSharp Dressed Man — ZZ Top");
        playList.add("ROCK:\tSong 2 — Blur");
        playList.add("ROCK:\tAmerican Idiot — Green Day");
        playList.add("ROCK:\tWelcome to the Black Parade — My Chemical Romance");
        playList.add("ROCK:\tIn The Air Tonight — Phil Collins");
        playList.add("ROCK:\tSheena Is a Punk Rocker 2009 Remaster — Ramones");
        playList.add("ROCK:\tAre You Gonna Be My Girl — Jet");
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
