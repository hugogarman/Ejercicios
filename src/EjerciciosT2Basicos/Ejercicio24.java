package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        // Pedir un número entre 0 y 9.999, decir si es capicúa.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de hasta 4 cifras:");
        int num = sc.nextInt();

        int umillar = num / 1000;
        int centenas = (num % 1000)/ 100;
        int decenas = (num % 100)/ 10;
        int unidades = num % 10;


        if (num >= 0 && num <= 9999) {
            if (num >= 1000 && num <= 9999 && umillar == unidades && centenas == decenas) {
                System.out.println(num + " es un número capicúa");
            } else if (num >= 100 && num <= 999 && centenas == unidades) {
                System.out.println(num + " es un número capicúa");
            } else if (num >= 10 && num <= 99 && decenas == unidades) {
                System.out.println(num + " es un número capicúa");
            } else if (num >= 0 && num <= 9) {
                System.out.println(num + " es un número capicúa");
            } else {
                System.out.println(num + " no es un número capicúa");
            }
        } else {
            System.out.println("ERROR, tiene que ser un número entre 0 y 9999");
        }

        sc.close();
    }
}
