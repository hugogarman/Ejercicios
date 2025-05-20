package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Realiza una aplicación que nos pida un número de ventas a introducir,
        // después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
        // Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de ventas:");
        int cantidadVentas = sc.nextInt();

        int sumaVentas = 0;
        int importe;

        for (int i = 1; i < cantidadVentas; i++) {
            System.out.println("Introduce la venta " + i + ":");
            importe = sc.nextInt();
            sumaVentas += importe;
        }

        System.out.println("La suma total de ventas es: " + sumaVentas);

        sc.close();
    }
}
