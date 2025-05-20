package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crea un programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia:");
        int radio = sc.nextInt();

        final double pi = 3.14;

        System.out.println("La longitud de la circunferencia es " + (2 * pi * radio));
        System.out.println("El área de la circunferencia es " + (pi * (radio*radio)));

        sc.close();
    }
}
