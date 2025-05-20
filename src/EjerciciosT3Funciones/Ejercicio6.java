package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
        // Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
        // Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos
        // mas adelante( la a se cambia por la c), teniendo en cuenta que el cambio es circular,
        // es decir, la z se cambiará por la b. El proceso de descifrado es el contrario.
        // Los caracteres que no sean alfabéticos no registrarán ningún cambio.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres:");
        String cadena = sc.nextLine();

        sc.close();

        String cadenaCifrada = cifrar(cadena);
        System.out.println("Cadena cifrada: " + cadenaCifrada);

        String cadenaDescifrada = descifrar(cadenaCifrada);
        System.out.println("Cadena descifrada: " + cadenaDescifrada);
    }

    public static String cifrar(String cadena) {
        String cadenaCifrada = "";

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra + 2);
                if (letra > 'z') {
                    letra = (char) (letra - 26);
                }
            }
            cadenaCifrada += letra;
        }
        return cadenaCifrada;

    }

    public static String descifrar(String cadena) {
        String cadenaDescifrada = "";

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra - 2);
                if (letra < 'a') {
                    letra = (char) (letra + 26);
                }
            }
            cadenaDescifrada += letra;
        }
        return cadenaDescifrada;
    }
}
