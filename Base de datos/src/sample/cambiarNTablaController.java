package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class cambiarNTablaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton cambiar;

    @FXML
    private JFXButton salir;

    @FXML
    void cambiarNTabla(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==cambiar){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cambiar Nombre Tabla");
            alert.setHeaderText(null);
            alert.setContentText("Se ha cambiado el nombre exitosamente!!");

            alert.showAndWait();
        }else{
            ((Node)event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("opcionesTablas.fxml","Tablas");
        }

    }
}
