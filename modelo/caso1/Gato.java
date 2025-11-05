package modelo.caso1;
public class Gato extends Animal {
    public Gato(String nombre, String color) {
        super(nombre, color);
    }

    public String morder() {
        return this.getNombre() + " está mordiendo con mal carácter.";
    }

    public String rasgunar() {
        return this.getNombre() + " está rasguñando.";
    }

    @Override
    public String hacerSonido() {
        return "Miau.";
    }
}