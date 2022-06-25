package me.hdgenius.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import me.hdgenius.gamelauncher.annotations.Viewable;
import me.hdgenius.gamelauncher.models.Game;

import java.net.URL;

@Viewable("game-view.fxml")
public class GameView extends VBox {
    @FXML
    private Text title;


    public GameView(final Game game) {
        super();
        ViewableUtils.loadView(this);
        title.setText(game.name());
    }
}
