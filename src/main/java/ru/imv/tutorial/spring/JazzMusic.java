package ru.imv.tutorial.spring;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Fly Me To The Moon (In Other Words)";
    }
}
