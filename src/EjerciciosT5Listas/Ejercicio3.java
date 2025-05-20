package EjerciciosT5Listas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Carlos", "622412388");
        agenda.put("Ana", "62241230");
        agenda.put("Luis", "622412365");

        System.out.println("Lista de contactos");
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }

        String nombreBuscado = "Carlos";
        if (agenda.containsKey(nombreBuscado)) {
            System.out.println("El teléfono de " + nombreBuscado + " es: " + agenda.get(nombreBuscado));
        } else {
            System.out.println("El contacto " + nombreBuscado + " no está en la agenda.");
        }
    }
}
