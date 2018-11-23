package sample;



import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class eliminarUsuarioController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private JFXButton eliminar;

    @FXML
    private JFXButton salir;
    @FXML
    void devolverVentana(MouseEvent event){
        JFXButton a=(JFXButton)event.getSource();
        if(a==salir) {
            Controller salir = new Controller();
            salir.abrirVentana(event);
        }
        else{
            //Eliminar Usuario
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar Usuario");
            alert.setHeaderText(null);
            alert.setContentText("Se ha eliminado un usuario exitosamente!!");

            alert.showAndWait();

        }
    }
}
