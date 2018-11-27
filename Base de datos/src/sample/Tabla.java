package sample;

import java.util.ArrayList;

public class Tabla {
    String nombre;
    Campo campoPorQueSeOrdena;
    ArrayList<Campo> campos = new ArrayList<>();

    public Tabla(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Campo getCampoPorQueSeOrdena() {
        return campoPorQueSeOrdena;
    }

    public void setCampoPorQueSeOrdena(Campo campoPorQueSeOrdena) {
        this.campoPorQueSeOrdena = campoPorQueSeOrdena;
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }
}
