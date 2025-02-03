import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

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
        Ejercicios ejercicios = new Ejercicios();

        //PRIMER EJERCICIO ANAGRAMAS
        System.out.println("Anagramas ");
        System.out.println();
        System.out.println("Ejemplo 1:");
        System.out.println("Palabras [listen,silent]");
        System.out.println("Son anagramas ?? ");



        System.out.println(Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println();

        System.out.println("Ejemplo 2:");
        System.out.println("Palabras [hello,bello]");
        System.out.println("Son anagramas ?? ");
        System.out.println(Ejercicios.areAnagrams("hello", "bello")); // false
    
        System.out.println();
        System.out.println("Ejemplo 3:");
        System.out.println("Palabras [triangle,integral]");
        System.out.println("Son anagramas ?? ");

        System.out.println(Ejercicios.areAnagrams("triangle", "integral")); // true


        System.out.println();
        System.out.println();


        // SEGUNDO EJERCICIO SUMA 
        int[] nums = {9, 2, 3, 6};
        int objetivo1 = 5;
        int objetivo2 = 10;

        System.out.println("Suma de dos números:");
        System.out.println();
        System.out.println("Caso A");
        System.out.println("Input: " + Arrays.toString(nums) + " Objetivo: " + + objetivo1);
        System.out.println("Output: ");
        System.out.println(Arrays.toString(ejercicios.sumatoriaDeDos(nums, objetivo1))); // [1, 2]
        System.out.println();
        System.out.println("Caso B");
        System.out.println("Input: " + Arrays.toString(nums) + " Objetivo: " + objetivo2);
        System.out.println("Output: ");
        System.out.println(Arrays.toString(ejercicios.sumatoriaDeDos(nums, objetivo2))); // null

    }

    

}