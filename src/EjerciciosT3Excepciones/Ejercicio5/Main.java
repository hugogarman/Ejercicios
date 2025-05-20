package EjerciciosT3Excepciones.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        try {
            empleado.establecerNombre("Hugo Garcia");
            empleado.establecerSalario(4000);
            System.out.println("Empleado creado exitosamente: " + empleado);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        empleado.establecerNombre("");

        try {
            empleado.establecerSalario(-1500);
        } catch (SalarioInvalidoException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
