package EjerciciosT1Basicos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Escribe un programa Java que lee un número entero por teclado y obtiene y muestra
        // por pantalla el doble y el triple de ese número.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int num = sc.nextInt();

        System.out.println("El doble de " + num + " es " + (num * 2));
        System.out.println("El triple de " + num + " es " + (num * 3));

        sc.close();
    }
}
