package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Metodo factorial(), que calculará el factorial del número que se le pasa como parámetro.
        // Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro
        // pasado sea negativo, y un -2 en caso de que el parámetro pasado sea cero.

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = sc.nextInt();

        long resultado = factorial(numero);

        if (numero < 0) {
            System.out.println("Resultado: -1");
        } else if (numero == 0) {
            System.out.println("Resultado: -2");
        } else {
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }

        sc.close();
    }

    public static long factorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
