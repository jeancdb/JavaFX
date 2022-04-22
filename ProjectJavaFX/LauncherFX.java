import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * The Launcher of the project JavaFX
 * Linking FXML and java code
 *
 * @author Jean CONSTANT
 * @version 22/04/2022
 */
public class LauncherFX extends Application
{
 
    /**
     * Start the application in another windows.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        // Building the FXML hierarchy
        Parent root = FXMLLoader.load(getClass().getResource("MaquetteAppli.fxml"));
        
        // JavaFX must have a Scene (window content) inside a Stage (window)       
        Scene scene = new Scene (root);
        
        stage.setTitle("Application Name");
        //image si on veut
        //stage.getIcons().add(new Image("file:ressources/img/world-map.png"));

        stage.setScene(scene);
        // Show the Stage (window)
        stage.show();

    }

}
