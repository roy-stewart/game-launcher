module me.hdgenius.gamelauncher {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens me.hdgenius.gamelauncher to javafx.fxml;
    exports me.hdgenius.gamelauncher;
}