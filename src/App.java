import models.Persona;
import view.ShowConsole;
import controllers.MetodoOrdenamiento;
import controllers.BusquedaBinaria;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShowConsole showConsole = new ShowConsole();
        // Ingresar cantidad de personas
        System.out.println("Ingrese la cantidad de personas:");
        int cantidad = scanner.nextInt();
        Persona[] personas = new Persona[cantidad];

        // Ingresar datos de las personas
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.next();
            int edad;
            do {
                System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
                edad = scanner.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. Intente nuevamente.");
                }
            } while (edad < 0);
            personas[i] = new Persona(edad, nombre);
        }

        // Ordenar el arreglo
        MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();
        metodoOrdenamiento.ordenarPorEdad(personas);
        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado por edad:");
        for (Persona persona : personas) {
            System.out.print(persona.getYear() + " ");
        }
        System.out.println();

        // Buscar una persona por edad
        System.out.println("Ingrese la edad a buscar:");
        int edadABuscar = scanner.nextInt();

        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(personas);
        busquedaBinaria.showPersonByYear(edadABuscar);

        scanner.close();
    }
}

