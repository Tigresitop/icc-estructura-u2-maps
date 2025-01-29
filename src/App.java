import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtrl = new EmpleadoContoller();

        boolean result = empCtrl.addEmpleado(new Empleado(1, "John", "Junior"));
        System.out.println("Empleado ingresado: " + result);
        result = empCtrl.addEmpleado(new Empleado(1, "John", "Junior"));
        System.out.println("Empleado ingresado: " + result);

        empCtrl.addEmpleado(new Empleado(1, "Luis", "Junior"));
        empCtrl.addEmpleado(new Empleado(2, "Sam", "Junior"));
        empCtrl.addEmpleado(new Empleado(3, "Andres", "Junior"));

        empCtrl.displayEmpleados();
        empCtrl.displayEmpleadosSoloNombres();
        empCtrl.displayLlaves();
        empCtrl.displayEmpleadosSinEntrySet();
        empCtrl.displayValores();
        
    }

    private static void runMapExamlpe() {
        new Mapa();


    }

    private static void runEjerccios() {
    }
}
