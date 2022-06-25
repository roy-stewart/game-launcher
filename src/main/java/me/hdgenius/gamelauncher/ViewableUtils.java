package me.hdgenius.gamelauncher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import me.hdgenius.gamelauncher.annotations.Viewable;

import java.io.IOException;

public class ViewableUtils {
    public static <T extends Pane> void loadView(final T instance) {
        final Class<T> controllerClass = (Class<T>) instance.getClass();
        final Viewable annotation = controllerClass.getAnnotation(Viewable.class);
        FXMLLoader fxmlLoader = new FXMLLoader(controllerClass.getResource(annotation.value()));
        // fxmlLoader.setRoot(instance);
        fxmlLoader.setController(instance);

        try {
            instance.getChildren().add(fxmlLoader.load());
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
