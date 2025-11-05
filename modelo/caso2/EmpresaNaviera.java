package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaNaviera {
    private String nombre;
    private List<DepartamentoNaviero> departamentos;

    public EmpresaNaviera(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarDepartamento(DepartamentoNaviero departamento) {
        this.departamentos.add(departamento);
    }

    public List<DepartamentoNaviero> getDepartamentos() {
        return departamentos;
    }
}