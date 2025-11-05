package modelo.caso2;

public abstract class EntidadUniversitaria {
    private String nombre;

    public EntidadUniversitaria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}