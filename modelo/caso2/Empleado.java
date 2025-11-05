package modelo.caso2;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    private String idEmpleado;
    private Moto motoPersonal;
    private List<Empleado> colegas;

    public Empleado(String nombre, String idEmpleado) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.colegas = new ArrayList<>();
    }

    public void setMotoPersonal(Moto motoPersonal) {
        this.motoPersonal = motoPersonal;
    }

    public Moto getMotoPersonal() {
        return motoPersonal;
    }

    public void agregarColega(Empleado colega) {
        this.colegas.add(colega);
    }

    public List<Empleado> getColegas() {
        return colegas;
    }

}