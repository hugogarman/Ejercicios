package EjerciciosT2Basicos;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Haz el mismo ejercicio anterior con otro bucle.

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
