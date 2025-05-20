package EjerciciosT5Listas;

import java.util.ArrayList;

public class  Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();

        tareas.add("Hacer la compra");
        tareas.add("Estudiar para el exámen");
        tareas.add("Recoger la habitación");
        tareas.add("Pasear al perro");

        System.out.println("Lista de tareas inicial");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }

        if (tareas.size() > 1) {
            tareas.remove(1);
            System.out.println("\nSe ha eliminado la segunda tarea.");
        } else {
            System.out.println("\nNo hay suficientes tareas como para elimiinar la segunda.");
        }

        System.out.println("\nLista de tareas actualizada:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }

    }
}
