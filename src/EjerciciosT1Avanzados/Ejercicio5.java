package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Programa que lea dos caracteres por teclado y compruebe si son iguales.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer carácter:");
        char caracter1 = sc.next().charAt(0);

        System.out.println("Introduce el segundo carácter:");
        char caracter2 = sc.next().charAt(0);

        System.out.println(caracter1 + " y " + caracter2 + (caracter1 == caracter2? " son iguales" : " son diferentes"));

        sc.close();
    }
}
