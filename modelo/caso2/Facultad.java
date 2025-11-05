package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class Facultad extends EntidadUniversitaria {
    private List<Departamento> departamentos;

    public Facultad(String nombre) {
        super(nombre);
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}