package sample;



import com.jfoenix.controls.JFXButton;


import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.input.MouseEvent;


public class eliminarUsuarioController {
    private String usuario;
    @FXML
    private MenuButton usuarios;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private JFXButton eliminar;

    @FXML
    private JFXButton salir;
    @FXML
    public void devolverVentana(MouseEvent event){
        JFXButton a=(JFXButton)event.getSource();
        if(a==salir) {
            ((Node) event.getSource()).getScene().getWindow().hide();
            Controller salir = new Controller();
            salir.crearVentana("Menu de Opciones.fxml","Menu ");
        }
        else{
            try{
                Scanner fileScan = new Scanner(new File("D:\\Java\\Base de datos\\src\\sample\\1.txt"));
                Writer output;
                output = new BufferedWriter(new FileWriter("D:\\Java\\Base de datos\\src\\sample\\salida.txt", true));
                boolean found = false; // added this variable
                int i=0;
                while (fileScan.hasNextLine()) {
                    String input = fileScan.nextLine();
                    System.out.println(input);
                    String Username = input.substring(0, input.indexOf(','));
                    if(Username.equals(usuario)) continue;
                    if(i!=0) ((BufferedWriter) output).newLine();
                    output.append(input);
                    i++;
                }
                output.close();
                fileScan.close();
                Files.delete(Paths.get("D:\\Java\\Base de datos\\src\\sample\\1.txt"));
                new File("D:\\Java\\Base de datos\\src\\sample\\salida.txt").renameTo(new File("D:\\Java\\Base de datos\\src\\sample\\1.txt"));

//                File file = new File("D:\\Java\\Base de datos\\src\\sample\\salida.txt");
//                file.renameTo(borrar);
            }catch (Exception e){
                    e.printStackTrace();
                }


            //Eliminar Usuario
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar Usuario");
            alert.setHeaderText(null);
            alert.setContentText("Se ha eliminado un usuario exitosamente!!");

            alert.showAndWait();

        }
    }
    @FXML
    public void haceralgo(MouseEvent event){
        try{
            Scanner fileScan = new Scanner(new File("D:\\Java\\Base de datos\\src\\sample\\1.txt"));
            usuarios.getItems().clear();
            while (fileScan.hasNextLine()) {
                String input = fileScan.nextLine();
                String Username = input.substring(0, input.indexOf(','));
                if(Username.equals("administrador")) continue;
                MenuItem probar=new MenuItem(Username);
                probar.setOnAction(this::cambio);
                usuarios.getItems().add(probar);
//                usuarios.getItems().add(new MenuItem(Username));
//
//
            }
//            MenuItem b=(MenuItem) event.getSource();
//            System.out.println(b);
            fileScan.close();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    @FXML
    public void cambio(ActionEvent event){
        MenuItem source=(MenuItem) event.getSource();
        usuarios.setText(source.getText());
        this.usuario=source.getText();


    }
}
