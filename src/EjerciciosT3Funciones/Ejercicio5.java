package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Metodo repite(), que recibe como parámetro una cadena de caracteres y un número, y retorna un nuevo String
        // donde aparece repetida la cadena de caracteres tantas veces como indique el numero pasado como parámetro.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de caractéres:");
        String cadena = sc.nextLine();

        System.out.println("¿Cuántas veces quieres que se repita?");
        int numRepeticiones = sc.nextInt();

        System.out.println(repite(cadena, numRepeticiones));

        sc.close();
    }

    public static String repite(String cadena, int numRepeticiones) {
        String resultado = "";

        for (int i = 1; i <= numRepeticiones; i++) {
            resultado += cadena;
        }

        return resultado;
    }
}
