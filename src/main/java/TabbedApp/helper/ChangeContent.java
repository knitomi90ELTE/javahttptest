package TabbedApp.helper;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import TabbedApp.TabbedApp;


public class ChangeContent {

    private final TabbedApp instance;
    private final Stage stage;

    public ChangeContent(TabbedApp instance, Stage stage) {
        this.instance = instance;
        this.stage = stage;
    }

    public void replaceSceneContent(String fxml) {
        try {
            Parent page = (Parent) FXMLLoader.load(instance.getClass().getResource(fxml), null, new JavaFXBuilderFactory());
            Scene scene = stage.getScene();
            if (scene == null) {
                scene = new Scene(page);
                stage.setScene(scene);
            } else {
                stage.getScene().setRoot(page);
            }
            stage.sizeToScene();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
