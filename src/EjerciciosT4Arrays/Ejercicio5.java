package EjerciciosT4Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[50];

        // Generamos array aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((100) + 1);
        }

        // Guardar los valores que SÍ aparecen
        boolean[] presentes = new boolean[101];

        for (int numero : array) {
            presentes[numero] = true;
        }

        // Buscar los que no aparecen
        ArrayList<Integer> noAparecen = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (!presentes[i]) {
                noAparecen.add(i);
            }
        }

        // Imprimimos los resultados
        System.out.println("Números que NO aparecen en el array: ");
        for (int num : noAparecen) {
            System.out.print(num + " ");

        }

    }
}
