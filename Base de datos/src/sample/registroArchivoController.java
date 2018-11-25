package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class registroArchivoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton archivo;

    @FXML
    private JFXButton insertar;

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

        }
        else if(b==archivo) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                    new FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));
            File selectedFile = fileChooser.showOpenDialog(((Node)event.getSource()).getScene().getWindow());
//            if (selectedFile != null) {
//                mainStage.display(selectedFile);
//            }
        }else{
            ((Node) event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("Menu de Opciones.fxml", "Opciones");
        }

    }
}
