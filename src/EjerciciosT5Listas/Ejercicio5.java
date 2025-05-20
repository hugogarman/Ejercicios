package EjerciciosT5Listas;

import java.util.HashSet;

public class Ejercicio5 {
    public static void main(String[] args) {

        HashSet<String> palabras = new HashSet<>();

        palabras.add("manzana");
        palabras.add("plátano");
        palabras.add("naranja");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("plátano");

        System.out.println("Palabras únicas en el conjunto:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        System.out.println("Número de palabras en el conjunto: " + palabras.size());
    }
}
