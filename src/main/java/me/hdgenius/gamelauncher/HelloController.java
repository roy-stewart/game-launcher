package me.hdgenius.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import me.hdgenius.gamelauncher.models.Game;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

public class HelloController {
    @FXML
    private HBox gamesList;

    @FXML
    protected void initialize() {
        try {
            final Collection<Game> games = Arrays.asList(
                    new Game(UUID.randomUUID(), "Minecraft", new URL("https://en.wikipedia.org/wiki/Minecraft#/media/File:Minecraft_cover.png")),
                    new Game(UUID.randomUUID(), "Call of Duty: Modern Warfare", new URL("https", "en.wikipedia.org", "/wiki/Minecraft#/media/File:Minecraft_cover.png"))
            );
            gamesList.getChildren().addAll(games.stream().map(GameView::new).toList());
        } catch (final MalformedURLException exception) {
            //
        }
    }
}