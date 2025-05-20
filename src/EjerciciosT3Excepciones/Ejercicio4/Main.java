package EjerciciosT3Excepciones.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        try {
            estudiante.establecerEdad(20);
            estudiante.establecerNombre("Hugo Garcia");
            System.out.println("Estudiante creado exitosamente: " + estudiante);
        } catch (EstudianteException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            estudiante.establecerEdad(-10);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            estudiante.establecerNombre("");
        } catch (NombreInvalidoException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
