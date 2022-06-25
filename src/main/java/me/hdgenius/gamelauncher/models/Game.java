package me.hdgenius.gamelauncher.models;

import java.net.URL;
import java.util.Objects;
import java.util.UUID;

public record Game(UUID id, String name, URL coverImage) {
    public Game {
        Objects.requireNonNull(name);
    }
}
