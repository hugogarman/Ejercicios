package EjerciciosT6Fechas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Escribe un programa que muestre la hora actual en España ("Europe/Madrid"),
        // Japón ("Asia/Tokyo") y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z".

        ZonedDateTime madrid = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime tokio = madrid.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = madrid.withZoneSameInstant(ZoneId.of("America/Mexico_City"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Madrid: " + madrid.format(formato));
        System.out.println("Tokio: " + tokio.format(formato));
        System.out.println("Mexico: " + mexico.format(formato));
    }
}
