package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class GrupoProyecto {
    private String nombre;
    private List<Empleado> empleados;

    public GrupoProyecto(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleados.size() < 5) { // Restricción del enunciado: 5 empleados
            this.empleados.add(empleado);
        } else {
            System.out.println("ADVERTENCIA: El grupo " + nombre + " ya tiene 5 empleados.");
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}