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

public class tablasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton crear;

    @FXML
    private JFXButton eliminar;

    @FXML
    private JFXButton cambiar;

    @FXML
    private JFXButton seleccionar;

    @FXML
    private JFXButton ordenar;

    @FXML
    void escogerOpcion(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==crear){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("crearTabla.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Crear Tabla");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(a==eliminar){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eliminarTabla.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Eliminar Tabla");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(a==cambiar){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cambiarNTabla.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Cambiar Nombre");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(a==seleccionar){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seleccionarDatos.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Seleccionar Datos");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else if(a==ordenar){
            try {
                ((Node)event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ordenarDatos.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage=new Stage();
                stage.setTitle("Ordenar Datos");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (Exception e){
                System.out.println("No se pudo cargar otra ventana");
            }

        }else{
            ((Node) event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("Menu de Opciones.fxml", "Opciones");
        }
    }
}
