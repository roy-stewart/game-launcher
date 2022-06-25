package me.hdgenius.gamelauncher.services;

import java.util.Collection;

import me.hdgenius.gamelauncher.models.Game;

public interface ProviderIntegration {
    Collection<Game> getAvailableGames();

    Collection<Game> getInstalledGames();
}
