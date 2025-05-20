package EjerciciosT1Avanzados;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Realiza un programa que nos pida cuantos segundos duró un concierto,
        // y nos calcule cuántas horas, minutos y segundos son.

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos segundos duró el concierto?");
        int duracion = sc.nextInt();

        int horas = duracion / 3600;
        int minutos = (duracion % 3600) / 60;
        int segundos = duracion % 60;

        System.out.println("La duración del concierto fue: " + horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
