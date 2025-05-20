package EjerciciosT4Arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas personas quieres guardar en la agenda?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];
        String[] direcciones = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.println("Dirección: ");
            direcciones[i] = sc.nextLine();
        }

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Consultar por índice");
            System.out.println("2. Salir");
            System.out.println("Elige una opción:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el índice (1 a " + n + "): ");
                    int indice = sc.nextInt();
                    if (indice >= 1 && indice <= n) {
                        System.out.println("Nombre: " + nombres[indice - 1]);
                        System.out.println("Dirección: " + direcciones[indice - 1]);
                    } else {
                        System.out.println("Índice fuera de rango.");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo de la agenda...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 2);

        sc.close();
    }
}
