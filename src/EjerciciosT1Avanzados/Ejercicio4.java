package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        System.out.println(numero + (numero % 7 == 0? " es múltiplo de 7." : " no es múltiplo de 7."));

        sc.close();
    }
}
