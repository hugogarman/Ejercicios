package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Realiza un metodo redondear() al que se le pasa como parámetro un numero float y los decimales
        // que deben quedar después de redondear, y retorna el numero redondeado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        float numero = sc.nextFloat();

        System.out.println("¿Cuántos decimales quieres dejar?");
        int numeroDecimales = sc.nextInt();

        System.out.println("El número redondeado con " + numeroDecimales + " decimales es: " + redondear(numero, numeroDecimales));

        sc.close();
    }

    public static double redondear(float numero, int numeroDecimales) {
        double factor = Math.pow(10, numeroDecimales);
        return Math.round(numero * factor) / factor;
    }
}
