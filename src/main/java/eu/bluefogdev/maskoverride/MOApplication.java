package eu.bluefogdev.maskoverride;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MOApplication extends Application {

    private static final Logger logger = Logger.getLogger(MOApplication.class.getName());

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mo-view.fxml"));
            Parent root = loader.load();

            MoController controller = loader.getController();
            controller.setStage(stage);

            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/fxml/icon.png")));
            stage.getIcons().add(icon);

            stage.setResizable(false);
            stage.setTitle("Datei Bearbeiter");
            stage.setScene(new Scene(root, 440, 170));
            stage.show();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Fehler beim Verarbeiten der Datei", e);
            stage.close();
        }
    }
}