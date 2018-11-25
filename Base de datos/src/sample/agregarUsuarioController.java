package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;

public class agregarUsuarioController {
    @FXML
    private ResourceBundle resources;
    @FXML
    private JFXTextField usuario;

    @FXML
    private JFXTextField contraseña;

    @FXML
    private JFXButton crear;

    @FXML
    private JFXButton salir;

    @FXML
    private URL location;
    @FXML
    void devolver(MouseEvent event) {
        JFXButton a=(JFXButton)event.getSource();
        if(a==salir) {
            ((Node) event.getSource()).getScene().getWindow().hide();
            Controller ventana=new Controller();
            ventana.crearVentana("Menu de Opciones.fxml", "Opciones");
        }
        else{
            //Crear Usuario
            try {
                boolean crearV=false;
                String crear=usuario.getText()+","+contraseña.getText();
                boolean tamaño=false;
                if(contraseña.getText().length()>7&&contraseña.getText().length()<15){
                    tamaño=true;
                }
                boolean verificar=this.verificarContraseña(contraseña.getText());
                if(verificar&&tamaño&&(usuario.getText().length()>7&&usuario.getText().length()<12)){
                    crearV=true;
                }

                if(crearV) {
                    Writer output;
                    output = new BufferedWriter(new FileWriter("D:\\Java\\Base de datos\\src\\sample\\1.txt", true));
                    ((BufferedWriter) output).newLine();
                    //Files.write(Paths.get("D:\\Java\\Base de datos\\src\\sample\\1.txt"), crear.getBytes(), StandardOpenOption.APPEND);
                    output.append(crear);
                    output.close();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Agregar Usuario");
                    alert.setHeaderText(null);
                    alert.setContentText("Se ha agregado a un usuario exitosamente!!");

                    alert.showAndWait();
                }else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Agregar Usuario");
                    alert.setHeaderText(null);
                    alert.setContentText("Ha ocurrido un error, verifique que los campos estén completos, tengan al menos de 7 a 12 caracteres para el usuario y de 7 a 15" +
                            " caracteres para la contraseña, además que debe contener un número y alguno de estos caracteres '?, $, #, @, !' ");

                    alert.showAndWait();
                }
            }catch (IOException e) {
                //exception handling left as an exercise for the reader
                e.printStackTrace();
            }


        }
    }


    boolean verificarContraseña(String contraseña){
        int cantNum=0;
        int cantChar=0;
        for(char c:contraseña.toCharArray()){
            if (Character.isDigit(c)){
                cantNum+=1;
            }
            if(c=='?'||c=='$'||c=='#'||c=='@'||c=='!'){
                cantChar+=1;
            }
        }
        if(cantChar>=1&&cantNum>=1){
            return true;
        }else return false;
    }

}
