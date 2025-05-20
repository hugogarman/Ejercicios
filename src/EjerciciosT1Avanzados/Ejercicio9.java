package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Desarrolla un programa que indique el peso que tienes en la luna.
        // Gravedad en la tierra 9,8 y en la luna 1,62.

        Scanner sc = new Scanner(System.in);

        final double gravedadTierra = 9.8;
        final double gravedadLuna = 1.62;

        System.out.println("Introduce tu peso en la tierra:");
        double peso = sc.nextDouble();

        System.out.println(peso + "kg en la tierra equivalen a " + ((gravedadLuna * peso)/gravedadTierra) + "kg en la luna.");
    }
}
