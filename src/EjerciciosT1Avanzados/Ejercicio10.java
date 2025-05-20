package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Desarrolla un programa que solicite 3 números y compruebe si están ordenados.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = sc.nextInt();

        System.out.println("Introduce el tercer número:");
        int numero3 = sc.nextInt();

        System.out.println((numero3 > numero2? (numero2 > numero1? "Están los tres números ordenados" : "No están ordenados") : "No están ordenados"));

        sc.close();
    }
}
