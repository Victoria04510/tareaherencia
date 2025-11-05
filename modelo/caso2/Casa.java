package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Empleado> arrendatarios;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.arrendatarios = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarArrendatario(Empleado empleado) {
        this.arrendatarios.add(empleado);
    }

    public List<Empleado> getArrendatarios() {
        return arrendatarios;
    }
}