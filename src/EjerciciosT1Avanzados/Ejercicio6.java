package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
        // Se debe comprobar que el divisor no puede ser cero.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número(dividendo): ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número(divisor): ");
        int num2 = sc.nextInt();

        System.out.println((num2 == 0? "ERROR, el divisor no puede ser 0" : "El resultado de la división es: " + (num1 / num2) ));

        sc.close();
    }
}
