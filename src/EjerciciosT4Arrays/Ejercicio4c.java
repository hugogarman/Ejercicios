package EjerciciosT4Arrays;

import java.util.Random;

public class Ejercicio4c {
    public static void main(String[] args) {
        // Desarrolla un programa que ordene los índices de un array de enteros,
        // en función del contenido de cada elemento del array, de mayor a menor,
        // es decir, hay que almacenar en otro array el índice del array original,
        // en función del contenido del último.

        int[] original = new int[5];
        int[] indices = new int[5];
        Random random = new Random();

        // Llenar array original con aleatorios y array de índices
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt(100);
            indices[i] = i;
        }

        // Ordenar manualmente los índices según los valores (descendente)
        for (int i = 0; i < indices.length - 1; i++) {
            for (int j = i + 1; j < indices.length; j++) {
                if (original[indices[j]] > original[indices[i]]) {
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                }
            }
        }

        // Mostrar array original
        System.out.print("Array original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Mostrar índices ordenados
        System.out.print("Índices ordenados por valor: ");
        for (int i = 0; i < indices.length; i++) {
            System.out.print(indices[i] + " ");
        }
        System.out.println();

    }
}
