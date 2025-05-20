package EjerciciosT3Excepciones.Ejercicio2;

public class ValidadorNumero {
    public void validarPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: el número no puede ser negativo");
        }
    }
}
