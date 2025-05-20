package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crea un programa en el que introduzcas una nota del 1 al 10
        // y te indique su nota en formato escrito (insuficiente, suficiente, etc.).

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota del 1 al 10:");
        int nota = sc.nextInt();

        if (nota >= 1 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La nota a introducir debe estar entre 1 y 10");
        }

        sc.close();
    }
}
