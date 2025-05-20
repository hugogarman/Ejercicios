package EjerciciosT1Basicos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Programa que lee un número de 3 cifras y muestra sus cifras por separado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de tres cifras");
        int num = sc.nextInt();

        int centenas = num / 100;
        int decenas = (num % 100) / 10;
        int unidades = num % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);

        sc.close();
    }
}
