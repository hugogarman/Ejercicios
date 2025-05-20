package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crea un programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del triángulo:");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
