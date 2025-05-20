package EjerciciosT3Excepciones.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        ValidadorNumero validador = new ValidadorNumero();

        try {
            validador.validarPositivo(30);
            System.out.println("Validación exitosa: el número es positivo.");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            validador.validarPositivo(-5);
            System.out.println("Validación exitosa: el número es positivo.");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            validador.validarPositivo(0);
            System.out.println("Validación exitosa: el número es positivo.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
