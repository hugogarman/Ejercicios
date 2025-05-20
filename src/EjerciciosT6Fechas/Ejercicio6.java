package EjerciciosT6Fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio6 {
    public static void main(String[] args) {

        LocalDate inicio = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 4, 15);

        int diasLaborables = contarDiasLaborables(inicio, fin);
        System.out.println("Días laborables entre " + inicio + " y " + fin + ": " + diasLaborables);
    }

    public static int contarDiasLaborables(LocalDate inicio, LocalDate fin) {
        int contador = 0;
        LocalDate fecha = inicio;

        while(!fecha.isAfter(fin)) {
            if (esDiaLaborable(fecha)) {
                contador++;
            }
            fecha = fecha.plusDays(1);
        }

        return contador;
    }

    public static boolean esDiaLaborable(LocalDate fecha) {
        DayOfWeek dia = fecha.getDayOfWeek();
        return dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY;
    }
}
