package EjerciciosT1Basicos;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
        // A continuación, realiza las instrucciones necesarias para que:
        // B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.

        int A = 4, B = 5, C = 1, D = 8, aux;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        aux = D;

        System.out.println("EL nuevo valor de A es " + A);
        System.out.println("EL nuevo valor de B es " + B);
        System.out.println("EL nuevo valor de C es " + C);
        System.out.println("EL nuevo valor de D es " + D);
    }
}
