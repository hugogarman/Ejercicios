package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Calcular el mayor de tres números enteros en Java.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer número:");
        int num3 = sc.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor de los tres es: " + mayor);

        sc.close();
    }
}
