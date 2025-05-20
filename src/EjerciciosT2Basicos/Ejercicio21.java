package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        // Realiza un programa que permita la entrada de varios números y calcule su media.

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números para calcular la media (ingresa un número negativo para terminar):");

        while (true) {
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            suma += num;
            contador ++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se han introducido números positivos");
        }

        sc.close();
    }
}
