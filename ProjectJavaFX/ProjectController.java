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
import java.time.LocalDate;

/**
 * Controller for the Project.
 *
 * @author Jean Constant - Quentin Simon
 * @version 2/05/2022
 */
public class ProjectController
{
    // We keep track of the count, and label displaying the count:
    
    @FXML
    private TextField structureName, subjectField, timeField;
    @FXML
    private Label rightTitle,errorMessage;
    @FXML
    private DatePicker monthField;
    @FXML
    private SplitMenuButton promotion;
    @FXML
    private TableView<Stage> tableView;
    @FXML
    private TableColumn nameT,monthT,timeT,subjectT,promoT;
    @FXML
    private Button submitButton, stopButton, modifButton,deleteButton,annulButton;
     
    private String name,sujet,duree,mois,promo;
    /**
     * To Add a new row in the TableView
     * L'utilisateur est invité à rentrer les informations du stage
     */
    @FXML
    private void buttonAdd(ActionEvent event)
    {
        //on vide d'abord tous les champs de saisie de la partie droite
        annulSaisie();
        //on change le titre de la page
        rightTitle.setText("Ajout d'un stage,\nveuillez remplir les champs");
        
        submitButton.setVisible(true);
        stopButton.setVisible(true);
        
    }
    
    /**
     * Pour choisir la promotion du stagiaire
     */
    @FXML
    private void promotionChoice(ActionEvent event)
    {
        MenuItem choice = (MenuItem)event.getSource();
        promo = choice.getId();
        promotion.setText(promo);
    }
    
    
    /**
     * Verification que tous les champs sont saisies et ajout de la ligne dans le tableau
     */
    @FXML
    private void submit(ActionEvent event)
    {
        boolean stop = false;
        //on get les valeurs des textField, si des champs sont vides, on affiche un message d'erreur
        try{
            name = structureName.getCharacters().toString();
            sujet = subjectField.getCharacters().toString();
            mois = monthField.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            duree = timeField.getCharacters().toString();
            if (promo ==null){
                throw new Exception ("promo null");
            }
            errorMessage.setVisible(false);
        }catch (Exception e){
            errorMessage.setVisible(true);
            stop=true;
        }
        
        
        if (!stop){
            //initialisation des cellules 
            nameT.setCellValueFactory(new PropertyValueFactory("nameStruct"));
            monthT.setCellValueFactory(new PropertyValueFactory("month"));
            timeT.setCellValueFactory(new PropertyValueFactory("duree"));
            subjectT.setCellValueFactory(new PropertyValueFactory("subject"));
            promoT.setCellValueFactory(new PropertyValueFactory("promo"));
            
            
            Stage unStage = new Stage(name, sujet,mois,duree,promo);
            
            tableView.getItems().add(unStage);
            annulSaisie();
            
            
            rightTitle.setText("Visualisation ou modification\ndes informations du stage\nsélectionné");
            submitButton.setVisible(false);
            stopButton.setVisible(false);
        }
    }
    
    /**
     * Annulation de la saisie de l'ajout d'un stage
     */
    @FXML
    private void annulSaisie()
    {
        // on vide tous les champs
        structureName.setText(null);
        subjectField.setText(null);
        timeField.setText(null);
        monthField.setValue(null);
        promotion.setText("Promo");
        modifButton.setVisible(false);
        deleteButton.setVisible(false);
        annulButton.setVisible(false);
    }
    
    /**
     * Pour stopper l'ajout d'un stage dans le tableView
     */
    @FXML
    private void stop(ActionEvent event)
    {
        annulSaisie();
        rightTitle.setText("Visualisation ou modification\ndes informations du stage\nsélectionné");
        submitButton.setVisible(false);
        stopButton.setVisible(false);
    }
    
    /**
     * Pour récuperer les valeurs de la ligne sélectionnée
     */
    @FXML
    private void selectionRow(){
        //sélection d'une ligne (pour l'instant uniquement la première case)
        ArrayList<Stage> p = new ArrayList<>(tableView.getSelectionModel().getSelectedItems());
        for (Stage res : p) {
            structureName.setText(res.getNameStruct());
            subjectField.setText(res.getSubject());
            timeField.setText(res.getDuree());
            monthField.setValue(LocalDate.parse(res.getMonth()));
            promotion.setText(res.getPromo());
        }
        modifButton.setVisible(true);
        deleteButton.setVisible(true);
        annulButton.setVisible(true);
    }
    
    /**
     * Modification du stage sélectionné
     */
    @FXML
    private void modifStage(ActionEvent event){
        submit(event);
        tableView.getItems().removeAll(tableView.getSelectionModel().getSelectedItems());
        //juste pour le test, après fonction change aussi les choses dans la bdd
        //il faut modifier la ligne correspondante dans la bdd
        //puis réafficher le tableau
        annulSaisie();
        modifButton.setVisible(false);
        deleteButton.setVisible(false);
        annulButton.setVisible(false);
    }
    
    /**
     * Suppression du stage sélectionné
     */
    @FXML
    private void suppStage(ActionEvent event){
        //supprimer la ligne dans la bdd
        //réafficher le tableau
        tableView.getItems().removeAll(tableView.getSelectionModel().getSelectedItems());
        annulSaisie();
        modifButton.setVisible(false);
        deleteButton.setVisible(false);
        annulButton.setVisible(false);
    }
}

