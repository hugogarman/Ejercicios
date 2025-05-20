package EjerciciosT3Excepciones.Ejercicio1;

public class Calculadora {
    public int dividir(int numerador, int denominador) {
        try {
            return numerador / denominador;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
    }
}
