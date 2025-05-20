package EjerciciosT3Excepciones.Ejercicio3;

import java.util.Scanner;

public class ProcesarDatos {
    public void procesarEntrada() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce un número entero:");
            String entrada = sc.nextLine();

            int numero = Integer.parseInt(entrada);

            int resultado = 100 / numero;
            System.out.println("El resultado de dividir por 100 por " + numero + " es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no se puede convertir a un número entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            System.out.println("El proceso ha finalizado.");
            sc.close();
        }
    }
}
