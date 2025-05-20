package EjerciciosT4Arrays;

import java.util.Random;

public class Ejercicio7c {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[3][3];
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt((10) + 1);
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0) {
                    sumaFilas[0] += matriz[i][j];
                } else if (i == 1) {
                    sumaFilas[1] += matriz[i][j];
                } else {
                    sumaFilas[2] += matriz[i][j];
                }

                if (j == 0) {
                    sumaColumnas[0] += matriz[i][j];
                } else if (j == 1) {
                    sumaColumnas[1] += matriz[i][j];
                } else {
                    sumaColumnas[2] += matriz[i][j];
                }
            }
        }

        System.out.println("\nSuma filas: ");
        for (int suma : sumaFilas) {
            System.out.printf("%6d", suma);
        }

        System.out.println("\nSuma columnas: ");
        for (int suma : sumaColumnas)
            System.out.printf("%6d", suma);
    }
}
