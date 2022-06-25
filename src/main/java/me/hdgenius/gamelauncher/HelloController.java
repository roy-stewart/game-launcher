package me.hdgenius.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import me.hdgenius.gamelauncher.models.Game;

import java.util.Arrays;
import java.util.Collection;

public class HelloController {
    @FXML
    private HBox gamesList;

    @FXML
    protected void initialize() {
        final Collection<Game> games = Arrays.asList(
                new Game(null, "Minecraft", null),
                new Game(null, "Minecraft 2", null)
        );
        gamesList.getChildren().addAll(games.stream().map(GameView::new).toList());
    }
}