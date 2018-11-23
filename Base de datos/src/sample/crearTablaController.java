package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class crearTablaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton agregar;

    @FXML
    void crearTabla(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==agregar){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar Tabla");
            alert.setHeaderText(null);
            alert.setContentText("Se ha agregado una tabla exitosamente!!");

            alert.showAndWait();
        }else{
            ((Node)event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("opcionesTablas.fxml","Tablas");
        }
    }
}
