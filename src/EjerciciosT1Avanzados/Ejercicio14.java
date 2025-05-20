package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Realiza un programa que calcule cuántos billetes hay que darle a un cliente que quiera sacar cierta cantidad de dinero de su banco.
        // Siempre calcularemos la mínima cantidad de billetes.

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuánto dinero quieres retirar?");
        int dinero = sc.nextInt();

        int billetes500 = dinero / 500;
        int billetes200 = (dinero % 500) / 200;
        int billetes100 = (dinero % 200) / 100;
        int billetes50 = (dinero % 100) / 50;
        int billetes20 = (dinero % 50) / 20;
        int billetes10 = (dinero % 20) / 10;
        int billetes5 = (dinero % 10) / 5;

        System.out.println("Billetes de 500€: " + billetes500);
        System.out.println("Billetes de 200€: " + billetes200);
        System.out.println("Billetes de 100€: " + billetes100);
        System.out.println("Billetes de 50€: " + billetes50);
        System.out.println("Billetes de 20€: " + billetes20);
        System.out.println("Billetes de 10€: " + billetes10);
        System.out.println("Billetes de 5€: " + billetes5);

        sc.close();
    }
}
