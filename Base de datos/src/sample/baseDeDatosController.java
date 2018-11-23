package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class baseDeDatosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton crear;

    @FXML
    private JFXTextField Usuario;

    @FXML
    void salirOCrear(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==crear){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Crear Base de Datos");
            alert.setHeaderText(null);
            alert.setContentText("Se ha creado una base de Datos!!");
            alert.showAndWait();
            //Crear Base de Datos
        }else{
            Controller salir=new Controller();
            salir.abrirVentana(event);
        }
    }
}
