package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class agregarUsuarioController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private JFXButton crear;

    @FXML
    private JFXButton salir;

    @FXML
    private URL location;
    @FXML
    void devolver(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==salir) {
            Controller salir = new Controller();
            salir.abrirVentana(event);
        }
        else{
            //Crear Usuario
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar Usuario");
            alert.setHeaderText(null);
            alert.setContentText("Se ha agregado a un usuario exitosamente!!");

            alert.showAndWait();

        }
    }

}
