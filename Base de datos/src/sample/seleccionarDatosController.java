package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class seleccionarDatosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton limpiar;

    @FXML
    private JFXButton seleccionar;

    @FXML
    private JFXButton salir;

    @FXML
    void seleccionarDato(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==seleccionar){

        }else if(a==limpiar){

        }else{
            ((Node)event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("opcionesTablas.fxml","Tablas");
        }
    }
}
