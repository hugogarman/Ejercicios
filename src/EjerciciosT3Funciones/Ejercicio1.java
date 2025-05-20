package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Haz un metodo llamado esVocal(), al que se le pasa como parámetro un carácter y retorna un valor
        // true en caso de que el carácter sea una vocal, y un valor false en caso contrario.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un carácter:");
        char caracter = sc.next().charAt(0);

        System.out.println("¿Es vocal? " + esVocal(caracter));

        sc.close();
    }

    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);

        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
