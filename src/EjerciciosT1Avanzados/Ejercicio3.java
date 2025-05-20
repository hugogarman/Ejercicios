package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crea un programa que compruebe si eres mayor de edad.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        System.out.println("Si tu edad es " + edad + (edad >= 18? ", eres mayor de edad." : ", eres menor de edad."));

        sc.close();
    }
}
