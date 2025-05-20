package EjerciciosT6Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate hoy  = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);

        System.out.println("Introduce tu día de nacimiento (1-31):");
        int dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento (1-12)");
        int mes = sc.nextInt();

        LocalDate cumple = LocalDate.of(2025, mes, dia);

        if (cumple.isBefore(hoy)) {
            cumple = cumple.plusYears(1);
        }

        Period tiempoRestante = Period.between(hoy, cumple);
        System.out.println("Faltan " + tiempoRestante.getMonths() + " meses y " + tiempoRestante.getDays() + " días.");

        sc.close();
    }
}
