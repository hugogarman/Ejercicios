package EjerciciosT2Avanzados;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Muestra los números primos entre 1 y 100.

        System.out.println("Números primos entre 1 y 100:");

        for (int num = 1; num <= 100; num++) {
            boolean esPrimo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}
