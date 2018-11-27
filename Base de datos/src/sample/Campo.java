package sample;

public class Campo {
    private String nombre;
    private int tipo;
    //1 = string
    //2 = int
    //3 = logico
    //4 = float
    private boolean requerido;
    private String datoGuardado;

    public Campo(String nombre, int tipo, boolean requerido){
        this.nombre = nombre;
        this.tipo = tipo;
        this.requerido = requerido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRequerido() {
        return requerido;
    }

    public void setRequerido(boolean requerido) {
        this.requerido = requerido;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDatoGuardado() {
        return datoGuardado;
    }

    public void setDatoGuardado(String datoGuardado) {
        this.datoGuardado = datoGuardado;
    }
}
