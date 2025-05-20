package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Escribe el metodo inverso(), que recibe un numero y retorna el inverso (si recibe el 1234 da como retorno el 4321). Prohibido usar método reverse().

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para calcular su inverso:");
        int numero = sc.nextInt();

        int resultado = inverso(numero);
        System.out.println("El inverso de " + numero + " es: " + resultado);

        sc.close();
    }

    public static int inverso(int numero) {
        int inverso = 0;

        while (numero != 0) {
            int ultimoDigito = numero % 10;
            inverso = inverso * 10 + ultimoDigito;
            numero = numero / 10;
        }

        return inverso;
    }
}
