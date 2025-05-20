package EjerciciosT3Funciones;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Haz programa que ordene alfabéticamente las letras de una frase.
        // El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
        // Ejemplo: Tecleando la palabra “hola”
        // Escribirá “ahlo”
        // El trabajo de ordenar la frase lo realizará un metodo llamado ordenar() al que se le pasará
        // la frase y la retornará ordenada. Este metodo realizará el trabajo de la siguiente manera:
        // Repetir tantas veces como letras tenga la frase
        // {
        // Obtener la letra menor
        // Añadir esa letra al resultado
        // Eliminar la letra de la frase original
        // }
        // El proceso de obtener la letra menor lo realizará un metodo llamado obtenerLetraMenor()
        // al que se le pasa la frase y nos da la letra mas pequeña.
        // Asimismo el trabajo de eliminar la letra de la frase original lo realizará otro metodo llamado
        // eliminarLetra() al que se le pasa la frase y la letra a eliminar y nos da como resultado la frase modificada.

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        String fraseOrdenada = ordenar(frase);
        System.out.println("Frase ordenada: " + fraseOrdenada);
    }

    public static String ordenar(String frase) {
        String resultado = "";

        int longitud = frase.length();

        for (int i = 0; i < longitud; i++) {
            char letraMenor = obtenerLetraMenor(frase);
            resultado += letraMenor;
            frase = eliminarLetra(frase, letraMenor);
        }
        return resultado;
    }

    public static char obtenerLetraMenor(String frase) {
        char menor = frase.charAt(0);

        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) < menor) {
                menor = frase.charAt(i);
            }
        }
        return menor;
    }

    public static String eliminarLetra(String frase, char letra) {
        String nuevaFrase = "";

        boolean eliminado = false;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra && !eliminado) {
                eliminado = true;
            } else {
                nuevaFrase += frase.charAt(i);
            }
        }
        return nuevaFrase;
    }
}
