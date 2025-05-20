package EjerciciosT1Basicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //  Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("¡Hola " + nombre + "!");

        sc.close();
    }
}
