package EjerciciosT4Arrays;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Array generado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        boolean ascendente = true;
        boolean descendente = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                descendente = false;
            }
            if (numeros[i] > numeros[i + 1]) {
                ascendente = false;
            }
        }

        if (ascendente) {
            System.out.println("El array está ordenado de forma ascendente.");
        } else if (descendente) {
            System.out.println("El array está ordenado de forma descendente.");
        } else {
            System.out.println("El array NO está ordenado.");
        }
    }
}
