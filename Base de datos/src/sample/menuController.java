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
import java.io.*;

public class menuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton salir;

    @FXML
    private JFXButton crearUsuario;

    @FXML
    private JFXButton eliminarUsuario;

    @FXML
    private JFXButton baseDeDatos;

    @FXML
    void abrirVentana(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        try {
            ((Node) event.getSource()).getScene().getWindow().hide();
            if(b==crearUsuario) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana CUsuario.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Crear Usuario");
                stage.setScene(new Scene(root1));
                stage.show();
            }else if(b==eliminarUsuario){

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana EUsuario.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Eliminar Usuario");
                stage.setScene(new Scene(root1));
                stage.show();
            }else if(b==baseDeDatos) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("masOpciones.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Opciones");
                stage.setScene(new Scene(root1));
                stage.show();
            }
            else{
                Main salir=new Main();
                salir.main();
            }

        }catch (Exception e){
            System.out.println("No se pudo cargar otra ventana");
        }
    }




}
