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
import javafx.scene.control.*;

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
    private TextField structureName, subjectField, timeField;
    private Label rightTitle;
    private DatePicker monthField;
    private SplitMenuButton promotion;
    
    /**
     * Initialization of SplitMenuButton with the choices
     */
    @FXML
    private void initSplit(){
        MenuItem l3 = new MenuItem("L3");
        MenuItem m1 = new MenuItem("M1");
        MenuItem m2 = new MenuItem("M2");
        promotion.getItems().addAll(l3, m1, m2);
    }
    
    
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void buttonAdd(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        rightTitle.setText("Ajout d'un stage, veuillez remplir les champs");
        initSplit();
    }
    
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void promotionChoice(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        
        
    }
}

