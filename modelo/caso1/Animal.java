package modelo.caso1;

public abstract class Animal {
    private String nombre;
    private String color;
    private int edad;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.edad = 0; // Se asume edad inicial 0
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public abstract String hacerSonido();
    public String comer() {
        return this.nombre + " está comiendo.";
    }

}