import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * Controller for StepTwo.
 *
 * @author Patrick Girard
 * @version 22/03/2020
 */
public class ProjectController
{
    // We keep track of the count, and label displaying the count:
    
    @FXML
    private TextField structureName;
    
    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    @FXML
    private void buttonClick(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        
    }
    
}

