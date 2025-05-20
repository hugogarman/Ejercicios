package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Realiza varios métodos para convertir un numero decimal en binario, octal o hexadecimal.
        // Para convertir un numero a binario se hacen divisiones entre 2 y se guardan los restos;
        // para convertir a octal se divide entre 8 y para convertir a hexadecimal se divide por 16
        // (si el resto es 10 se sustituye por una A, si es 11 se sustituye por B, 12 -> C,&, 15->F).
        // Cada metodo recibe un número entero y da como resultado un String con el número convertido.

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número:");
        int numero = sc.nextInt();

        sc.close();

        String binario = Binario(numero);
        String octal = Octal(numero);
        String hexadecimal = Hexadecimal(numero);

        System.out.println("Binario: " + binario);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static String Binario(int numero) {
        String binario = "";

        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }
        return binario;
    }

    public static String Octal(int numero) {
        String octal = "";

        while (numero > 0) {
            int resto = numero % 8;
            octal = resto + octal;
            numero = numero / 8;
        }
        return octal;
    }

    public static String Hexadecimal(int numero) {
        String hexadecimal = "";

        while (numero > 0) {
            int resto = numero % 16;

            if (resto < 10) {
                hexadecimal = resto + hexadecimal;
            } else {
                char letra = (char) ('A' + (resto - 10));
                hexadecimal = letra + hexadecimal;
            }
            numero = numero / 16;
        }
        return hexadecimal;
    }
}
