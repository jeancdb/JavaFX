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
import javafx.collections.*;
import java.util.*;
import javafx.beans.property.SimpleStringProperty;

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
    @FXML
    private Label rightTitle;
    @FXML
    private DatePicker monthField;
    @FXML
    private SplitMenuButton promotion;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn nameT,monthT,timeT,subjectT,promoT;
     
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void buttonAdd(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        rightTitle.setText("Ajout d'un stage,\nveuillez remplir les champs");
        
        ObservableList<Map> allData = tableView.getItems();
        int offset = allData.size();
        Map<String, String> dataRow = new HashMap<>();
        for (int j = 0; j < tableView.getColumns().size(); j++) {
            String mapKey = Character.toString((char) ('A' + j));
            String value1 = mapKey + (offset + 1);
            System.out.println(value1);
            dataRow.put(mapKey,value1);
        
        }
        System.out.println(dataRow);
        allData.add(dataRow);
        
        List<TableColumnBase> columns = tableView.getColumns();
        for(TableColumnBase e: columns) {
            tableView.getColumns().add((TableColumn<T, ?>) e);
        }
        for (int i = 0; i < tableView.getColumns().size(); i++) {
            ((TableColumn)(tableView.getColumns().get(i))).setVisible(false);
            
            ((TableColumn)(tableView.getColumns().get(i))).setVisible(true);
        }
        
    }
    
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void promotionChoice(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        MenuItem choice = (MenuItem)event.getSource();
        String promo = choice.getId();
        promotion.setText(promo);
    }
}

