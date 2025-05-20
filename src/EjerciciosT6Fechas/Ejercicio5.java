package EjerciciosT6Fechas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias) que introduzca el usuario.

        Scanner sc = new Scanner(System.in);
        Duration duracionTotal = Duration.ZERO;
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        boolean continuar = true;

        System.out.println("Introduce la hora de inicio y la hora de fin en formato HH:mm:");
        System.out.println("Escribe 'fin' para terminar.");

        while (continuar) {
            System.out.println("Hora de inicio: ");
            String inicio = sc.nextLine();

            if (inicio.equalsIgnoreCase("fin")) {
                continuar = false;
            } else {
                System.out.println("Hora de fin: ");
                String fin = sc.nextLine();

                try {
                    LocalTime horaInicio = LocalTime.parse(inicio, formatoHora);
                    LocalTime horaFin = LocalTime.parse(fin, formatoHora);

                    if (horaFin.isBefore(horaInicio)) {
                        System.out.println("Error: La hora de fin debe ser posterior a la de inicio");
                    } else {
                        Duration duracion = Duration.between(horaInicio, horaFin);
                        duracionTotal = duracionTotal.plus(duracion);

                        System.out.println("Duración: " + duracion.toHours() + " horas y " + duracion.toMinutesPart() + " minutos.");
                    }
                } catch (Exception e) {
                    System.out.println("Formato inválido. Usa HH:mm (ejemplo 08:00)");;
                }
            }
        }

        sc.close();
    }
}

