package view;
import java.util.Scanner;
public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Metodo Busqueda");
        System.out.println("1. Buscar por codigo");
        System.out.println("2. Buscar por nombre");
    }

    public int getCode(){
        System.out.println("Ingrese codigo: ");
        int code = scanner.nextInt();
        System.out.println("El codigo ingresado es: " + code);
        return code;
    }

    public String getName(){
        System.out.println("Ingrese nombre: ");
        String name = scanner.nextLine();
        System.out.println("El nombre ingresado es: " + name);
        return name;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    
}
