package EjerciciosT1Basicos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEscribe el número de km/h que quieras pasar a m/s:");
        int kmPorHora = sc.nextInt();

        System.out.println(kmPorHora + "\nkm/h equivalen a " + (kmPorHora / 3.6) + "m/s.");

        sc.close();
    }
}
