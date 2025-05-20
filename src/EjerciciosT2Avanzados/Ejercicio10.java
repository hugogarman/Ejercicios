package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Igual que el anterior, pero el valor de N se leerá por teclado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuántos números quieres de la serie de Fibonacci:");
        int N = sc.nextInt();

        sc.close();

        int num1 = 0, num2 = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(num1 + ", ");

            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
    }
}
