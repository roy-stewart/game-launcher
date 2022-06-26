package me.hdgenius.gamelauncher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import me.hdgenius.gamelauncher.annotations.Viewable;

import java.io.IOException;

public abstract class CustomComponent extends Pane {
    protected CustomComponent() {
        final Class<? extends CustomComponent> componentClass = this.getClass();
        final Viewable annotation = componentClass.getAnnotation(Viewable.class);
        final FXMLLoader fxmlLoader = new FXMLLoader(componentClass.getResource(annotation.value()));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
