package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra:");
        char caracter = sc.next().charAt(0);

        int ascii = (int)caracter;

        System.out.println(caracter + (ascii >= 65 && ascii <=90? " es una letra mayúscula" : " no es una letra mayúscula"));

        sc.close();
    }
}
