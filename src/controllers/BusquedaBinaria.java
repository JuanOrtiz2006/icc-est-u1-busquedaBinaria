package controllers;

import models.Persona;
import view.ShowConsole;

public class BusquedaBinaria {
    private Persona[] personas;
    private ShowConsole showConsole;

    public BusquedaBinaria(Persona[] personas) {
        this.personas = personas;
        this.showConsole = new ShowConsole();
        showConsole.showMessage("Método Búsqueda Binaria");
    }

    public int findPersonByYear(int edad) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            Persona personaCentral = personas[central];

            // Mostrar estado actual del arreglo y variables
            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getYear() + " ");
            }
            System.out.println();
            showConsole.showMessage("bajo=" + bajo + " alto=" + alto + " centro=" + central + " valorCentro=" + personaCentral.getYear());

            if (personaCentral.getYear() == edad) {
                showConsole.showMessage("--> ENCONTRADO");
                return central; // Persona encontrada
            } else if (personaCentral.getYear() < edad) {
                showConsole.showMessage("--> DERECHA");
                bajo = central + 1; // Buscar en la mitad derecha
            } else {
                showConsole.showMessage("--> IZQUIERDA");
                alto = central - 1; // Buscar en la mitad izquierda
            }
        }

        showConsole.showMessage("--> NO ENCONTRADO");
        return -1; // Persona no encontrada
    }

    public void showPersonByYear(int edad) {
        int indexPerson = findPersonByYear(edad);
        if (indexPerson != -1) {
            showConsole.showMessage("La persona con la edad " + edad + " es " + personas[indexPerson].getName());
        } else {
            showConsole.showMessage("No se encontró una persona con la edad " + edad);
        }
    }
    
}
