package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Realizar un programa que calcule la potencia de un número baseexponente.
        // La potencia se hará por medio de multiplicaciones, está prohibido usar Math.pow()

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = sc.nextInt();

        System.out.println("Introduce el exponente:");
        int exponente = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);

        sc.close();
    }
}
