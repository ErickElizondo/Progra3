package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class opcionesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton tablas;

    @FXML
    private JFXButton baseDatos;

    @FXML
    private JFXButton registros;

    @FXML
    private JFXButton reporte;

    @FXML
    private JFXButton salir;

    @FXML
    void hacerFuncion(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==tablas){

        }else if(b==baseDatos){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("crearBaseDatos.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Base de Datos");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(b==registros){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("opcionesRegistro.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Registro");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(b==reporte){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Reporte");
            alert.setHeaderText(null);
            alert.setContentText("Se ha creado un reporte!!");
            alert.showAndWait();
            //Crear reporte

        }else{
            Controller salir=new Controller();
            salir.abrirVentana(event);
        }
    }
}
