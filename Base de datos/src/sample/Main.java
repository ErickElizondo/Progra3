package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main extends Application {

    public static ArrayList<BaseDeDatos> listaDeBasesDeDatos = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        main();
    }


    public void main() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Base de Datos");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            System.out.println("No se pudo iniciar");
        }
    }


}
