package me.hdgenius.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import me.hdgenius.gamelauncher.models.Game;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

public class HelloController {
    @FXML
    private HBox gamesList;

    @FXML
    protected void initialize() {
        try {
            final Collection<Game> games = Arrays.asList(
                    new Game(null, "Minecraft", new URL("file://C:/Users/royth/Downloads/Minecraft_cover.png")),
                    new Game(null, "Minecraft 2", new URL("https", "en.wikipedia.org", "/wiki/Minecraft#/media/File:Minecraft_cover.png"))
            );
            gamesList.getChildren().addAll(games.stream().map(GameView::new).toList());
        } catch (final MalformedURLException exception) {
            //
        }
    }
}