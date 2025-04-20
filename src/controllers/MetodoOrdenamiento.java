package controllers;
import models.Persona;
import view.ShowConsole;
public class MetodoOrdenamiento {
    Persona [] personas;


    public MetodoOrdenamiento() {
    }

    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getYear() > personas[j + 1].getYear()) {
                    // Intercambiar personas[j] y personas[j + 1]
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
}

