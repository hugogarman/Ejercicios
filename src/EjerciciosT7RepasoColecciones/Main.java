package EjerciciosT7RepasoColecciones;

public class Main {
    public static void main(String[] args) {
        ArrayListDAM<String> lista = new ArrayListDAM<>();

        // Añadir elementos
        lista.add("Primero");
        lista.add("Tercero");
        lista.add(1, "Segundo"); // Insertar en posición específica

        System.out.println("Lista inicial: " + lista);
        System.out.println("Tamaño: " + lista.length());

        // Obtener elemento
        System.out.println("Elemento en posición 1: " + lista.get(1));

        // Eliminar por posición (penúltimo)
        lista.delete(lista.length() - 2);
        System.out.println("Después de borrar penúltimo: " + lista);

        // Eliminar por valor
        lista.add("Segundo");
        lista.add("Segundo");
        lista.delete("Segundo"); // Borrar todos los "Segundo"
        System.out.println("Después de borrar todos 'Segundo': " + lista);

        // Probar excepciones
        try {
            lista.add(10, "Fuera de rango");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

    }
}
