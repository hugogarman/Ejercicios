package EjerciciosT4Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Suma de filas:");
        for (int suma : sumaFilas) {
            System.out.print(suma + " ");
        }

        System.out.println("\n\nSuma de columnas:");
        for (int suma : sumaColumnas) {
            System.out.print(suma + " ");
        }
    }
}
