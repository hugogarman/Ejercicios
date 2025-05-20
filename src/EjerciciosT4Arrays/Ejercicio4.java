package EjerciciosT4Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Desarrolla un programa que ordene los índices de un array de enteros,
        // en función del contenido de cada elemento del array, de mayor a menor,
        // es decir, hay que almacenar en otro array el índice del array original,
        // en función del contenido del último.

        int[] arrayOriginal = {34, 54, 12, 85, 45};

        int[] indices = new int[arrayOriginal.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Se ordenan los indices dependiendo de los valores del array original
        for (int i = 0; i < indices.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < indices.length; j++) {
                if (arrayOriginal[indices[j]] > arrayOriginal[indices[maxIndex]]) {
                    maxIndex = j;
                }
            }
            int temp = indices[i];
            indices[i] = indices[maxIndex];
            indices[maxIndex] = temp;
        }

        System.out.println("Array resultado:");
        for (int i = 0; i < indices.length; i++) {
            System.out.print(indices[i] + " ");
        }
    }
}
