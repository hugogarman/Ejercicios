package EjerciciosT6Fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crea un metodo que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.

        LocalDate fechaSabado = LocalDate.of(2025, 4, 5);
        LocalDate fechaDomingo = LocalDate.of(2025, 4, 6);
        LocalDate fechaLunes = LocalDate.of(2025, 4, 7);

        System.out.println(verificarDia(fechaSabado));
        System.out.println(verificarDia(fechaDomingo));
        System.out.println(verificarDia(fechaLunes));
    }

    public static String verificarDia(LocalDate fecha) {
        DayOfWeek dia = fecha.getDayOfWeek();

        if (dia == DayOfWeek.SATURDAY) {
            return "Es sábado";
        } else if (dia == DayOfWeek.SUNDAY) {
            return "Es domingo";
        } else {
            return "No es ni sábado ni domingo";
        }
    }
}
