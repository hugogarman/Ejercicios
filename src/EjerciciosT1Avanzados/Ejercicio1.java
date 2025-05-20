package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Programa Java que lea un número entero y calcule si es par o impar.

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número:");
        int numero = sc.nextInt();

        System.out.println(numero + (numero % 2 == 0? " es par." : " es impar."));

        sc.close();
    }
}
