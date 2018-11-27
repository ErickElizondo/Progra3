package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
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
            //CREACION DE BASE DE DATOS
            String nombreTMP = Usuario.getText();
            boolean yaExiste = false;
            for(BaseDeDatos bsdt : Main.listaDeBasesDeDatos){
                if(nombreTMP.equals(bsdt.getNombre())){
                    yaExiste = true;
                    break;
                }
            }
            if(!yaExiste){
                BaseDeDatos baseACrear = new BaseDeDatos(nombreTMP);
                Main.listaDeBasesDeDatos.add(baseACrear);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Crear Base de Datos");
                alert.setHeaderText(null);
                alert.setContentText("Se ha creado una base de Datos!!");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Crear Base de Datos");
                alert.setHeaderText(null);
                alert.setContentText("Esa base de datos ya existe");
                alert.showAndWait();
            }

        }else{
            ((Node) event.getSource()).getScene().getWindow().hide();
            Controller salir=new Controller();
            salir.crearVentana("Menu de Opciones.fxml","Menu de opciones");
        }
    }
}
