package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Programa Java que lea un número entero y calcule si es par o impar.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        sc.close();
    }
}
