package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Pide por teclado dos números y genera 10 números aleatorios entre esos números.
        // Usa el metodo math.random para generar un número entero aleatorio (recuerda el casting de double a int).

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            for (int i = 1; i <= 10; i++) {
                int aleatorio = (int)(Math.random() * (num1 - num2 + 1) + num2);
                System.out.println(aleatorio);
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                int aleatorio = (int)(Math.random() * (num2 - num1 + 1) + num1);
                System.out.println(aleatorio);
            }
        }

        sc.close();
    }
}
