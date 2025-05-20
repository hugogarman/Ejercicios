package EjerciciosT4Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int distanciaPico = 4 - i; // Máximo
                if (j <= distanciaPico) {
                    matriz[i][j] = i + j;
                } else {
                    matriz[i][j] = 8 - i - j;
                }
            }
        }

        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
