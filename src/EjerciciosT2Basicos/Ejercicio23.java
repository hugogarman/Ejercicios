package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Desarrolla un programa que lea números hasta que se den cinco ceros
        // y escriba después la suma de los números leídos.
        // Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
        // Da como salida: 33

        Scanner sc = new Scanner(System.in);

        int numero;

        int contadorCeros = 0;
        int suma = 0;


        do {
            System.out.println("Introduce un número:");
            numero = sc.nextInt();

            if (numero != 0) {
                suma += numero;
            } else {
                contadorCeros++;
            }

        } while (contadorCeros < 5);

        System.out.println("La suma de todos los números es: " + suma);
    }
}
