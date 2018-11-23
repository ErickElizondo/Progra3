package sample;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField Usuario;

    @FXML
    private JFXPasswordField Contraseña;

    @FXML
    private Button botonEntry;

    @FXML
    void abrirVentana(MouseEvent event) {
        try {
            ((Node)event.getSource()).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu de Opciones.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Menu de opciones");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo cargar otra ventana");
        }
    }

}
