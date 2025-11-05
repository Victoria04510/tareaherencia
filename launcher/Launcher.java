package launcher;

import controlador.ControladorCaso1;
import controlador.ControladorCaso2;
import vista.VistaConsola;

public class Launcher {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();

        ControladorCaso1 controlador1 = new ControladorCaso1(vista);
        controlador1.ejecutarCaso1();

        ControladorCaso2 controlador2 = new ControladorCaso2(vista);
        controlador2.ejecutarCaso2();
    }
}