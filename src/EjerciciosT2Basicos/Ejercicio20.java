package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes,
        // mostrando el resultado en pantalla.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += (num + i);
        }

        System.out.println("La suma de los 100 números siguientes es: " + suma);

        sc.close();
    }
}
