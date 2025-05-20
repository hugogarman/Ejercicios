package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Programa que lea un número entero y muestre si el número es múltiplo de 10.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        System.out.println(numero + (numero % 10 == 0? " es múltiplo de 10." : " no es múltiplo de 10."));

        sc.close();
    }
}
