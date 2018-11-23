package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class eliminarTablaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton eliminar;

    @FXML
    private JFXButton salir;

    @FXML
    void eliminarTabla(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==eliminar){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar Tabla");
            alert.setHeaderText(null);
            alert.setContentText("Se ha eliminado una tabla exitosamente!!");

            alert.showAndWait();
        }else{
            ((Node)event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("opcionesTablas.fxml","Tablas");
        }

    }
}
