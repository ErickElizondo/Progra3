package sample;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class registrosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton manualmente;

    @FXML
    private JFXButton archivo;

    @FXML
    private  JFXButton borrar;

    @FXML
    void elegir(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==manualmente){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("insertarRegistro.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Insertar Registro");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(b==archivo){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registroArchivo.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Insertar Registro");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(b==borrar) {
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                Controller ventana=new Controller();
                ventana.crearVentana("eliminarRegistro.fxml","Eliminar Registro");

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }
        }
        else{
            Controller salir=new Controller();
            salir.abrirVentana(event);
        }
    }

}
