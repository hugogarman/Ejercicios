package EjerciciosT5Listas;

import java.util.HashMap;

public class Ejercicio6 {
    public static void main(String[] args) {

        HashMap<String, Integer> inventario = new HashMap<>();

        inventario.put("Manzanas", 10);
        inventario.put("Plátanos", 15);
        inventario.put("Naranjas", 20);
        inventario.put("Peras", 8);

        System.out.println("Inventario inicial:");
        for (String producto : inventario.keySet()) {
            System.out.println(producto + " → " + inventario.get(producto));
        }

        // Maneras de imprimirlo
        System.out.println(inventario);
        System.out.println(inventario.keySet());
        System.out.println(inventario.values());

        String productoAAumentar = "Manzanas";
        if (inventario.containsKey("Manzanas")) {
            int cantidadActual = inventario.get(productoAAumentar);
            inventario.put(productoAAumentar, cantidadActual + 5);
            System.out.println("\nSe aumentó la cantidad de " + productoAAumentar + " en 5.");
        } else {
            System.out.println("\nEl producto " + productoAAumentar + " a aumentar no existe en el inventario");
        }

        System.out.println("\nInventario actualizado:");
        for (String producto : inventario.keySet()) {
            System.out.println(producto + " → " + inventario.get(producto));
        }
    }
}
