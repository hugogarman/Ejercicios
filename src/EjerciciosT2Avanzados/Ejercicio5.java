package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // ………….
        // 1 2 3 4 5 …..n

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a + "");
            }
            System.out.println();
        }

        sc.close();
    }
}
