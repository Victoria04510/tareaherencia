package modelo.caso1;

import java.util.ArrayList;
import java.util.List;

public class Nino extends Persona {
    private List<Nino> amigos;

    public Nino(String nombre, int edad) {
        super(nombre, edad);
        this.amigos = new ArrayList<>();
    }

    public String irALaEscuela() {
        return this.getNombre() + " de " + this.getEdad() + " años está yendo a la escuela.";
    }

    public void agregarAmigo(Nino nino) {
        this.amigos.add(nino);
    }

    public List<Nino> getAmigos() {
        return amigos;
    }
}