package EjerciciosT1Basicos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Programa Java que lea dos números enteros por teclado y los muestre por pantalla.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Los números introducidos son: " + num1 + " y " + num2);
    }
}
