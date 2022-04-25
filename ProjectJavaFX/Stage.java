import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.*;
import java.util.*;
import javafx.beans.property.SimpleStringProperty;
/**
 * Décrivez votre classe Stage ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Stage
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private final SimpleStringProperty nameStruct;
    private final SimpleStringProperty subject;
    private final SimpleStringProperty month;
    private final SimpleStringProperty promo;
    private final SimpleStringProperty duree;

    /**
     * Constructeur d'objets de classe Stage
     */
    public Stage(String nameStruct, String subject, String month, String duree,String promo)
    {
        // initialisation des variables d'instance
        this.nameStruct = new SimpleStringProperty(nameStruct);
        this.subject = new SimpleStringProperty(subject);
        this.month = new SimpleStringProperty(month);
        this.duree = new SimpleStringProperty(duree);
        this.promo = new SimpleStringProperty(promo);
    }
    
//Start GetterSetterExtension Source Code

    public String getNameStruct() {
            return nameStruct.get();
        }

    public void setNameStruct(String sName) {
            nameStruct.set(sName);
        }

    /**GET Method Propertie subject*/
    public String getSubject(){
        return subject.get();
    }//end method getSubject

    /**SET Method Propertie subject*/
    public void setSubject(String subj){
        subject.set(subj);
    }//end method setSubject

    /**GET Method Propertie month*/
    public String getMonth(){
        return month.get();
    }//end method getMonth

    /**SET Method Propertie month*/
    public void setMonth(String mois){
        month.set(mois);
    }//end method setMonth

    /**GET Method Propertie promo*/
    public String getPromo(){
        return promo.get();
    }//end method getPromo

    /**SET Method Propertie promo*/
    public void setPromo(String prom){
        promo.set(prom);
    }//end method setPromo

    /**GET Method Propertie duree*/
    public String getDuree(){
        return duree.get();
    }//end method getDuree

    /**SET Method Propertie duree*/
    public void setDuree(String time){
        duree.set(time);
    }//end method setDuree

//End GetterSetterExtension Source Code


}//End class