package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class registroManualController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton insertar;


    @FXML
    private JFXButton archivo;

    @FXML
    private JFXTextField Usuario;

    @FXML
    void insertarOSalir(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==insertar){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Insertar Registro");
            alert.setHeaderText(null);
            alert.setContentText("Se ha agregado un registro exitosamente!!");

            alert.showAndWait();
            //Crear registro

        }else{
            ((Node) event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("Menu de Opciones.fxml", "Opciones");
        }


    }




}
