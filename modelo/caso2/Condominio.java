package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
    private String nombre;
    private List<Casa> casas;

    public Condominio(String nombre) {
        this.nombre = nombre;
        this.casas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCasa(Casa casa) {
        this.casas.add(casa);
    }

    public int contarCasas() {
        return casas.size();
    }
}