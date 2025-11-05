package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoNaviero {
    private String nombre;
    private List<GrupoProyecto> gruposProyecto;

    public DepartamentoNaviero(String nombre) {
        this.nombre = nombre;
        this.gruposProyecto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarGrupo(GrupoProyecto grupo) {
        this.gruposProyecto.add(grupo);
    }

    public List<GrupoProyecto> getGruposProyecto() {
        return gruposProyecto;
    }
}