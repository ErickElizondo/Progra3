package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class eliminarRegistroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton limpiar;

    @FXML
    private JFXButton eliminar;

    @FXML
    private JFXButton salir;

    @FXML
    void eliminarRegistro(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==eliminar){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar Registro");
            alert.setHeaderText(null);
            alert.setContentText("Se ha eliminado exitosamente!!");

            alert.showAndWait();

        }else if(b==limpiar){

        }else{
            Controller salir=new Controller();
            salir.abrirVentana(event);
        }
    }
}
