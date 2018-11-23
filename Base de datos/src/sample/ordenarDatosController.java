package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class ordenarDatosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton ordenar;

    @FXML
    void ordenarDatos(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==ordenar){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ordenar Tabla");
            alert.setHeaderText(null);
            alert.setContentText("Se ha ordenado los datos exitosamente!!");

            alert.showAndWait();
        }else{
            ((Node)event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("opcionesTablas.fxml","Tablas");
        }
    }
}
