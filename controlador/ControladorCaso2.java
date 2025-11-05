package controlador;

import modelo.caso2.*;
import vista.VistaConsola;

import java.util.Arrays;
import java.util.List;

public class ControladorCaso2 {
    private VistaConsola vista;

    public ControladorCaso2(VistaConsola vista) {
        this.vista = vista;
    }

    public void ejecutarCaso2() {
        vista.mostrarTitulo("--- Caso 2: Herencia y Agregación/Composición ---");

        Moto moto01 = new Moto("Harley Davidson", "1200 Custom", "1200cc");
        Moto moto02 = new Moto("Kawasaki", "Ninja ZX 6R 636", "636cc");

        Empleado empleado01 = new Empleado("Agustín01", "A001");
        Empleado empleado02 = new Empleado("Francisco02", "F002");
        Empleado empleado03 = new Empleado("Andrea03", "A003");
        Empleado empleado04 = new Empleado("Colega04", "C004");
        Empleado empleado05 = new Empleado("Colega05", "C005");
        Empleado empleado06 = new Empleado("Colega06", "C006");

        empleado01.setMotoPersonal(moto01);
        empleado03.setMotoPersonal(moto02);

        EmpresaNaviera naviera = new EmpresaNaviera("Tesoros del Mar S.A.");
        List<String> nombresDeptos = Arrays.asList("adquisiciones", "ventas", "producción", "logística", "finanzas");

        for (String nombreDepto : nombresDeptos) {
            DepartamentoNaviero depto = new DepartamentoNaviero(nombreDepto);
            GrupoProyecto grupo = new GrupoProyecto("Grupo " + nombreDepto.substring(0, 1).toUpperCase() + "01");

            grupo.agregarEmpleado(empleado01);
            grupo.agregarEmpleado(empleado02);
            grupo.agregarEmpleado(empleado04);
            grupo.agregarEmpleado(empleado05);
            grupo.agregarEmpleado(empleado06);

            depto.agregarGrupo(grupo);
            naviera.agregarDepartamento(depto);
        }

        empleado01.agregarColega(empleado02);
        empleado02.agregarColega(empleado01);
        empleado02.agregarColega(empleado03);

        Condominio condominio = new Condominio("Nuevo Amanecer");
        Casa casa01 = new Casa("Calle Falsa 123");
        Casa casa02 = new Casa("Avenida Siempre Viva 456");

        casa01.agregarArrendatario(empleado01);
        casa01.agregarArrendatario(empleado02);

        condominio.agregarCasa(casa01);
        for (int i = 2; i <= 20; i++) {
            condominio.agregarCasa(new Casa("Casa Generica " + i));
        }

        vista.mostrarTexto("--- Empleados ---");
        vista.mostrarTexto("- Empleado: " + empleado01.getNombre() + ", Moto: " + empleado01.getMotoPersonal().arrancar());
        vista.mostrarTexto("- Empleado: " + empleado03.getNombre() + ", Moto: " + empleado03.getMotoPersonal().arrancar());

        vista.mostrarTexto("\n--- Relaciones ---");
        vista.mostrarTexto("- Colegas de " + empleado01.getNombre() + ": " + empleado02.getNombre());
        vista.mostrarTexto("- Arrendatarios de " + casa01.getDireccion() + ": " + casa01.getArrendatarios().get(0).getNombre() + " y " + casa01.getArrendatarios().get(1).getNombre());
        vista.mostrarTexto("- Condominio: " + condominio.getNombre() + " tiene " + condominio.contarCasas() + " casas.");
    }
}