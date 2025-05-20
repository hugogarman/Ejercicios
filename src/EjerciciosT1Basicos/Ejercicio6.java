package EjerciciosT1Basicos;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Programa java que realice lo siguiente: declarar una variable N de tipo int,
        // una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        // A continuación, muestra por pantalla: El valor de cada variable, la suma de N + A,
        // la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.

        int N = 12;
        double A = 17.4;
        char caracterC = 'C';

        System.out.println("El valor de N es: " + N);
        System.out.println("El valor de A es: " + A);

        //La suma de N + A
        System.out.println("La suma de N + A es: " + (N + A));

        //La diferencia de A - N
        System.out.println("La diferencia de A - N es: " + (A - N));

        // El valor numérico correspondiente al carácter que contiene la variable C.
        System.out.println("El valor de C es: " + (int)caracterC);
    }
}
