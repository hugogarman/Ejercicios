package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int cifras = contarCifras(numero);

        System.out.println("El número " + numero + " tiene " + cifras + " cifra(s).");

        sc.close();
    }

    public static int contarCifras(int numero) {
        numero = Math.abs(numero); // Por si el número es negativo
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}
