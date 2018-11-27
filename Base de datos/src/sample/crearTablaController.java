package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class crearTablaController implements Initializable {


    @FXML
    private JFXButton salir;

    @FXML
    private JFXTextField fieldNombreTabla;

    @FXML
    private JFXTextField fieldNombreCampo;

    @FXML
    private CheckBox chckRequerido;

    @FXML
    private JFXButton agregar;

    @FXML
    private ComboBox<String> cmbBaseDeDato;

    @FXML
    private ComboBox<String> cmbTipoDeDato;

    @FXML
    private CheckBox chckOrdenar;

    @FXML
    private ListView<String> listaDeCampos;

    private Tabla tablaTemporal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        tablaTemporal = new Tabla("");

        //Metiendo los valores iniciales de base de datos al combobox
        for(BaseDeDatos baseDeDatos : Main.listaDeBasesDeDatos){
            cmbBaseDeDato.getItems().addAll(baseDeDatos.getNombre());
        }

        cmbTipoDeDato.getItems().addAll(
          "String","Int","Lógico","Float"
        );
    }

    @FXML
    void agregarCampo(ActionEvent event) {
        boolean campoYaExiste = false;
        for(Campo cmp : tablaTemporal.getCampos()){
            if(cmp.getNombre().equals(fieldNombreCampo.getText())){
                campoYaExiste = true;
                break;
            }
        }
        if(!campoYaExiste){
            int tipoElegido = 1;
            if(cmbTipoDeDato.getValue().equals("String"))
                tipoElegido = 1;
            else if(cmbTipoDeDato.getValue().equals("Int"))
                tipoElegido = 2;
            else if(cmbTipoDeDato.getValue().equals("Lógico"))
                tipoElegido = 3;
            else if(cmbTipoDeDato.getValue().equals("Float"))
                tipoElegido = 4;


            Campo campoAMeter = new Campo(fieldNombreCampo.getText(),tipoElegido,chckRequerido.isSelected());
            tablaTemporal.getCampos().add(campoAMeter);

            //TODO REFRESCAR LISTVIEW
        }else{
            System.out.println("Ese campo ya existe");
        }






    }

    @FXML
    void crearTabla(MouseEvent event) {
        JFXButton b=(JFXButton)event.getSource();
        if(b==agregar){



        }
    }


    @FXML
    void crearTablaNueva(ActionEvent event) {
        System.out.println("BFAOIFIAOFHOAJHFAOHOSIHOI");

        //Esto de abajo se hace hasta el final
        String nombreDeBaseElegida = cmbBaseDeDato.getValue();

        for(BaseDeDatos baseDeDatos : Main.listaDeBasesDeDatos){
            if(nombreDeBaseElegida.equals(baseDeDatos.getNombre())){
                //Revisando que no exista ese campo
                boolean tablaYaExiste = false;
                for(Tabla tbl : baseDeDatos.getTablas()){
                    if(tbl.getNombre().equals(fieldNombreTabla.getText())){
                        tablaYaExiste = true;
                        break;
                    }

                }
                if(!tablaYaExiste){
                    tablaTemporal.setNombre(fieldNombreTabla.getText());
                    baseDeDatos.getTablas().add(tablaTemporal);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Agregar Tabla");
                    alert.setHeaderText(null);
                    alert.setContentText("Se ha agregado una tabla exitosamente!!");
                    for(Tabla tbl : baseDeDatos.getTablas()){
                        System.out.println("Tablita: " + tbl.getNombre());
                    }

                    alert.showAndWait();

                }else{
                    System.out.println("Tabla ya existe");
                }

                break;
            }
        }

    }


    @FXML
    void salir(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide();
        Controller ventana=new Controller();
        ventana.crearVentana("opcionesTablas.fxml","Tablas");
    }


}
