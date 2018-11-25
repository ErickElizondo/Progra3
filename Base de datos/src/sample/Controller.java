package sample;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;

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
            boolean verificar=this.verificarCuenta();
            if(verificar) {
                ((Node) event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu de Opciones.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Menu de opciones");
                stage.setScene(new Scene(root1));
                stage.show();
            }

        }catch (Exception e){
            System.out.println("No se pudo cargar otra ventana");
            JOptionPane.showMessageDialog(null, "Invalid password. Try again.", "Error Message",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    void crearVentana(String nombreArchivo, String Titulo){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(nombreArchivo));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle(Titulo);
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo cargar otra ventana");
        }
    }

    boolean verificarCuenta(){
        try {

//        launch(args);
            Scanner fileScan = new Scanner(new File("D:\\Java\\Base de datos\\src\\sample\\1.txt"));
            boolean found = false; // added this variable
            while (fileScan.hasNextLine()) {
                String input = fileScan.nextLine();
                String Username = input.substring(0, input.indexOf(','));
                String Password = input.substring(input.indexOf(','), input.length());
                Password=Password.substring(1);
                System.out.println(Usuario.getText());
                System.out.println(Username);
                System.out.println("=============================");
                System.out.println(Contraseña.getText());
                System.out.println(Password);
                System.out.println("=============================");
                if(Usuario.getText().equals(Username)&&Contraseña.getText().equals(Password)){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("Se encontró al usuario");
                fileScan.close();
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid password. Try again.", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                fileScan.close();
                return false;
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
            return false;

        }
    }

}
