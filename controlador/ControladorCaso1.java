package controlador;

import modelo.caso1.*;
import vista.VistaConsola;

public class ControladorCaso1 {
    private VistaConsola vista;

    public ControladorCaso1(VistaConsola vista) {
        this.vista = vista;
    }

    public void ejecutarCaso1() {
        vista.mostrarTitulo("--- Caso 1: Herencia en Personas y Animales ---");

        Perro perro01 = new Perro("Firulais", "café");
        Gato gato01 = new Gato("Misifus", "negro");

        Nino nino01 = new Nino("Sofía01", 6);
        Nino nino02 = new Nino("Pablo02", 10);
        Nino nino03 = new Nino("Pedro03", 10);

        nino02.agregarAmigo(nino03);
        nino03.agregarAmigo(nino02);

        nino01.agregarMascota(perro01);
        nino02.agregarMascota(perro01);
        nino03.agregarMascota(gato01);

        vista.mostrarTexto("Mascota de Sofía y Pablo: " + perro01.getNombre() + " de color " + perro01.getColor());
        vista.mostrarTexto("- Comportamiento: " + perro01.hacerSonido() + " y " + perro01.comer());
        vista.mostrarTexto("");

        vista.mostrarTexto("Mascota de Pedro: " + gato01.getNombre());
        vista.mostrarTexto("- Comportamientos: " + gato01.hacerSonido() + ", " + gato01.morder() + " y " + gato01.rasgunar());
        vista.mostrarTexto("");

        vista.mostrarTexto("Comportamiento Niño:");
        vista.mostrarTexto("- " + nino01.irALaEscuela());
        vista.mostrarTexto("- " + nino02.irALaEscuela());
    }
}