package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Desarrolla un programa que pida un número por teclado y te muestre el número de cifras que tiene.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        String numeroComoCadena = Integer.toString(num);
        int cantidadCifras = numeroComoCadena.length();

        System.out.println("El número " + num + " tiene " + cantidadCifras + " cifras.");

        sc.close();
    }
}
