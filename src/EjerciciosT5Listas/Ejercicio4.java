package EjerciciosT5Listas;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);
        numeros.add(4);

        System.out.println("Lista de números: " + numeros);

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma de todos los números es: " + suma);

        int maximo = Collections.max(numeros);
        System.out.println("El número mayor es: " + maximo);

        int minimo = Collections.min(numeros);
        int minimoMultiplicado = minimo * 2;
        System.out.println("El número más pequeño es: " + minimo);
        System.out.println("El número más pequeño multiplicado por dos es: " + minimoMultiplicado);
    }
}
