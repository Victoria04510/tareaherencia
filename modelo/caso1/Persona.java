package modelo.caso1;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private List<Animal> mascotas;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void agregarMascota(Animal animal) {
        this.mascotas.add(animal);
    }

    public List<Animal> getMascotas() {
        return mascotas;
    }

}