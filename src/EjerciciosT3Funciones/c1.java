package EjerciciosT3Funciones;

import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número decimal:");
        double numero = sc.nextDouble();

        System.out.println("Introduce cuántas cifras decimales quieres dejar:");
        int decimales = sc.nextInt();

        System.out.println(redondear(numero, decimales));
    }

    public static double redondear(double numero, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}
