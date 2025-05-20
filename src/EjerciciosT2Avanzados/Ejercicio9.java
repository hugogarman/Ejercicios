package EjerciciosT2Avanzados;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.

        int N = 33;

        int num1 = 0, num2 = 1;

        System.out.println("Los primeros " + N + " términos de la serie de Fibonacci son:");

        for (int i = 1; i <= N; i++) {
            System.out.print(num1 + " ");

            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
    }
}
