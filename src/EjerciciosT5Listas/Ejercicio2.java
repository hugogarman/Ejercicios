package EjerciciosT5Listas;

import java.util.HashSet;

public class Ejercicio2 {
    public static void main(String[] args) {

        HashSet<String> colores = new HashSet<>();

        colores.add("Rojo".toLowerCase());
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Rojo");

        System.out.println("Lista de colores únicos:");
        for (String color : colores) {
            System.out.println("- " + color);
        }

        if (colores.contains("Verde")) {
            System.out.println("El color 'Verde' está en el conjunto.");
        } else {
            System.out.println("El color 'Verde' no está en el conjunto.");
        }
    }
}
