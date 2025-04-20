package models;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(int edad, String nombre ) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public String getName() {
        return nombre;
    }
    
    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return edad;
    }

    public void setYear(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Persona [ edad=" + edad + ", name=" + nombre + "]";
    }
}

