package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Programa que lea dos números por teclado y muestre el resultado de la división del primero
        // por el segundo. Se debe comprobar que el divisor no puede ser cero.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número(dividendo):");
        int dividendo = sc.nextInt();

        System.out.println("Introduce el segundo número(divisor):");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            System.out.println("El resultado de la división es: " + (dividendo / divisor));
        } else {
            System.out.println("ERROR, el divisor no puede ser 0.");
        }

        sc.close();
    }
}
