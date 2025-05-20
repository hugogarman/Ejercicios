package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Lee un número por teclado y comprueba que este número es mayor o igual que cero,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduce un número mayor o igual a 0: ");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("El número debe ser mayor o igual que cero. Inténtalo de nuevo.");
            }
        } while (num < 0);

        System.out.println("El número introducido es: " + num);

        sc.close();
    }
}
