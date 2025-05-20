package EjerciciosT2Avanzados;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Programa un juego que genere un número aleatorio y te permita introducir números
        // hasta que des con el adecuado. El juego deberá indicarte si el número introducido es mayor o menor.

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int)(Math.random()* 10 + 1);
        int numero;

        System.out.println("He generado un número aleatorio entre 1 y 10 incluidos, intenta adivinarlo.");

        do {
            System.out.println("Introduce un número:");
            numero = sc.nextInt();

            if (numero > numeroAleatorio) {
                System.out.println("Sigue intentándolo. Pista: tu número es mayor");
            } else if (numero < numeroAleatorio) {
                System.out.println("Sigue intentándolo. Pista: tu número es menor");
            }
        } while (numero != numeroAleatorio);

        System.out.println("¡Has acertado!, enhorabuena.");

        sc.close();
    }
}
