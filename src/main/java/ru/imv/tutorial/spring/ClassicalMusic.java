package ru.imv.tutorial.spring;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public void initMusic() {
        System.out.println("Doing Classical music init");
    }

    public void destroyMusic() {
        System.out.println("Doing Classical music destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

    public static Music createMusic() {
        return new ClassicalMusic();
    }
}
