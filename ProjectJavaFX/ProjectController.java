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
 * Controller for the Project.
 *
 * @author Jean Constant
 * @version 22/04/2022
 */
public class ProjectController
{
    // We keep track of the count, and label displaying the count:
    
    @FXML
    private TextField structureName, subjectField;
    private Label test;
    private String text;    
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void buttonAdd(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        text = structureName.getText();
        System.out.println(text);
    }
    
}

