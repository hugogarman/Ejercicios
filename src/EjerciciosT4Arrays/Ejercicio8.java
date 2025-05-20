package EjerciciosT4Arrays;

import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] cuadro = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cuadro[i][j] = random.nextInt(25) + 1;
            }
        }

        System.out.println("Cuadro generado:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cuadro[i][j] + "\t");
            }
            System.out.println();
        }

        boolean esMagico = true;
        int constanteMagica = 65;

        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += cuadro[i][j];
            }
            if (sumaFila != constanteMagica) {
                esMagico = false;
                break;
            }
        }

        if (esMagico) {
            for (int j = 0; j < 5; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < 5; i++) {
                    sumaColumna += cuadro[i][j];
                }
                if (sumaColumna != constanteMagica) {
                    esMagico = false;
                    break;
                }
            }
        }

        if (esMagico) {
            int sumaDiagonal = 0;
            for (int i = 0; i < 5; i++) {
                sumaDiagonal += cuadro[i][i];
            }
            if (sumaDiagonal != constanteMagica) esMagico = false;
        }

        if (esMagico) {
            int sumaAntiDiagonal = 0;
            for (int i = 0; i < 5; i++) {
                sumaAntiDiagonal += cuadro[i][4 - i];
            }
            if (sumaAntiDiagonal != constanteMagica) esMagico = false;
        }

        System.out.println("\n¿Es un cuadro mágico? " + esMagico);
    }
}
