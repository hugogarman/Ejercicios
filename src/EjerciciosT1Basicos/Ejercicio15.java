package EjerciciosT1Basicos;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Escribe un programa que te pida y muestre tu dirección y tu número de teléfono.
        // Asegúrate de que los datos se muestran en líneas separadas.

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu dirección:");
        String direccion = sc.nextLine();
        System.out.println("Escribe tu número de teléfono:");
        String telefono = sc.nextLine();

        System.out.println("\nTu dirección es: " + direccion);
        System.out.println("\nTu número de teléfono es: " + telefono);

        sc.close();
    }
}
