package EjerciciosT6Fechas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();

        String diaSemana = hoy.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String mes = hoy.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        System.out.println("Hoy es " + diaSemana + ", " + hoy.getDayOfMonth() + " de " + mes + " de " + hoy.getYear());
    }
}
