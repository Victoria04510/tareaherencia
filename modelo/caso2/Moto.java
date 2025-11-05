package modelo.caso2;

public class Moto extends Vehiculo {
    private String cilindraje;

    public Moto(String marca, String modelo, String cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    @Override
    public String arrancar() {
        return "La " + this.getMarca() + " " + this.getModelo() + " de " + this.cilindraje + " cc está arrancando.";
    }

}