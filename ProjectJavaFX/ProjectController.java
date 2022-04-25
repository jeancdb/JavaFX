import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.*;
import javafx.collections.*;
import java.time.format.DateTimeFormatter;
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
    private TableView<Stage> tableView;
    @FXML
    private TableColumn nameT,monthT,timeT,subjectT,promoT;
    @FXML
    private Button submitButton, stopButton;
     
    private String promo;
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void buttonAdd(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        rightTitle.setText("Ajout d'un stage,\nveuillez remplir les champs");
        
        submitButton.setVisible(true);
        stopButton.setVisible(true);
        
        
        
        /*
        ObservableList<Map> allData = tableView.getItems();
        int offset = allData.size();
        Map<String, String> dataRow = new HashMap<>();
        for (int j = 0; j < tableView.getColumns().size(); j++) {
            String mapKey = Character.toString((char) ('A' + j));
            String value1 = mapKey + (offset + 1);
            dataRow.put(mapKey,value1);
        
        }
        allData.add(dataRow);
        tableView.setItems(allData);
        

        for (int i = 0; i < tableView.getColumns().size(); i++) {
            ((TableColumn)(tableView.getColumns().get(i))).setVisible(false);
            
            ((TableColumn)(tableView.getColumns().get(i))).setVisible(true);
        }
        */
        
    }
    
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void promotionChoice(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        MenuItem choice = (MenuItem)event.getSource();
        promo = choice.getId();
        promotion.setText(promo);
    }
    
    
    /**
     * To Add a new row in the TableView
     */
    @FXML
    private void submit(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        
        String name = structureName.getCharacters().toString();
        String sujet = subjectField.getCharacters().toString();
        String mois = monthField.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String duree = timeField.getCharacters().toString();
        if (name ==null || sujet == null || mois == null || duree == null || promo==null){
            System.out.println("non");
        }else{
            System.out.println("ok");
        }
        /*
        nameT.setCellValueFactory(new PropertyValueFactory("nameStruct"));
        monthT.setCellValueFactory(new PropertyValueFactory("month"));
        timeT.setCellValueFactory(new PropertyValueFactory("duree"));
        subjectT.setCellValueFactory(new PropertyValueFactory("subject"));
        promoT.setCellValueFactory(new PropertyValueFactory("promo"));
        
        
        Stage unStage = new Stage("Coucou", "Doe","coucou","8","coucou");
    
        ObservableList allData = FXCollections.observableArrayList();
    
        tableView.getItems();
        allData.add(unStage);
        tableView.setItems(allData);
        */
    }
    
    /**
     * Pour stopper l'ajout d'un stage dans le tableView
     */
    @FXML
    private void stop(ActionEvent event)
    {
        
    }
}

