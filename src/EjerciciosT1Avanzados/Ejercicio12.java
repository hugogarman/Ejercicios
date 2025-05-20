package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
        // El IVA será una constante del 21%.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio sin IVA del producto");
        double precio = sc.nextDouble();

        final double IVA = 1.21;

        System.out.println("El precio final con IVA es: " + (precio * IVA) + "€");

        sc.close();
    }
}
