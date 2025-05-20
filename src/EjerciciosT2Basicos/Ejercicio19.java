package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Escribir un programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        if (num > 1) {
            System.out.println("Los números impares menores que " + num + " son:");

            for (int i = 1; i < num; i += 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("ERROR, el número tiene que ser mayor que 1");
        }

        sc.close();
    }
}
