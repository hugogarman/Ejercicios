package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Mostrar la tabla de multiplicar de un número.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para ver su tabla de multiplicar:");
        int num = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
