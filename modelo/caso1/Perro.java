package modelo.caso1;
public class Perro extends Animal {
    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public String hacerSonido() {
        return "Guau, guau! (ladra)";
    }
}