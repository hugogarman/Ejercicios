package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Crea un programa que compruebe si un año es bisiesto.
        // “Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo,
        // terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.”

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un año");
        int anyo = sc.nextInt();

        System.out.println((anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)? "Es un año bisiesto" : "No es un año bisiesto"));

        sc.close();
    }
}
