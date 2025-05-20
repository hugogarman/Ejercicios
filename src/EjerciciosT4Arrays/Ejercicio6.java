package EjerciciosT4Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {

        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }

    }
}
