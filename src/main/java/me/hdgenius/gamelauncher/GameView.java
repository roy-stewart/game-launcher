package me.hdgenius.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import me.hdgenius.gamelauncher.annotations.Viewable;
import me.hdgenius.gamelauncher.models.Game;

import java.util.logging.Logger;

@Viewable("game-view.fxml")
public class GameView extends CustomComponent {
    private final Game game;

    @FXML
    private ImageView coverImage;

    @FXML
    private Text title;

    private final Logger logger;

    public GameView(final Game game) {
        super();
        this.game = game;
        logger = Logger.getLogger(getClass().getName());
        this.setOnMouseClicked((event) -> launchGame());
        title.setText(game.name());
        coverImage.setImage(new Image(game.coverImage().toString()));
    }

    @FXML
    public void launchGame() {
        logger.info(String.format("Opened game %s", game.id()));
    }
}
