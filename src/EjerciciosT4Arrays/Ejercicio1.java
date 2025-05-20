package EjerciciosT4Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // En un array de 20 elementos hay almacenados números enteros.
        // Haz un programa que pida un número y diga cuántas veces aparece el número dentro del array.

        int[] numeros = new int[20];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20);
        }

        imprimirArray(numeros);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para buscar en el array:");
        int numeroBuscar = sc.nextInt();

        int contador = 0;
        for (int num : numeros) {
            if (num == numeroBuscar) {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscar + " aparece " + contador + " veces en el array.");

        sc.close();
    }

    public static void imprimirArray(int[] array) {
        System.out.println("Array generado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
