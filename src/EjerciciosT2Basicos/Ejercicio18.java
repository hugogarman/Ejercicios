package EjerciciosT2Basicos;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).

        long resultado = 1;

        for (int i = 1; i <= 20; i++) {
            resultado *= i;
        }

        System.out.println("La multiplicación de los 20 primeros números naturales es: " + resultado);
    }
}
