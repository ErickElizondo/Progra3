package sample;

import java.util.ArrayList;

public class BaseDeDatos {
    private String nombre;
    private ArrayList<Tabla> tablas = new ArrayList<>();

    public BaseDeDatos(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }
}
