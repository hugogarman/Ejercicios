package EjerciciosT6Fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjercicioFechas2 {
    public static void main(String[] args) {
        // 1. Definir zonas horarias
        ZoneId madridZone = ZoneId.of("Europe/Madrid");
        ZoneId dohaZone = ZoneId.of("Asia/Qatar");
        ZoneId tokioZone = ZoneId.of("Asia/Tokyo");

        // 2. Hora de salida desde Madrid
        LocalDateTime salidaMadrid = LocalDateTime.of(2025, 4, 12, 20, 45);
        ZonedDateTime salidaMadridZDT = ZonedDateTime.of(salidaMadrid, madridZone);
        System.out.println("Despegue Madrid: " + formatZDT(salidaMadridZDT, madridZone));

        // 3. Primer vuelo a Doha (6h 45m)
        Duration vuelo1 = Duration.ofHours(6).plusMinutes(45);
        ZonedDateTime aterrizajeDohaZDT = salidaMadridZDT.plus(vuelo1).withZoneSameInstant(dohaZone);
        System.out.println("Aterrizaje Doha: " + formatZDT(aterrizajeDohaZDT, dohaZone));

        // 4. Escala en Doha (1h)
        Duration escala = Duration.ofHours(1);
        ZonedDateTime despegueDohaZDT = aterrizajeDohaZDT.plus(escala);
        System.out.println("Despegue Doha: " + formatZDT(despegueDohaZDT, dohaZone));

        // 5. Segundo vuelo a Tokio (10h 25m)
        Duration vuelo2 = Duration.ofHours(10).plusMinutes(25);
        ZonedDateTime aterrizajeTokioZDT = despegueDohaZDT.plus(vuelo2).withZoneSameInstant(tokioZone);
        System.out.println("Aterrizaje Tokio: " + formatZDT(aterrizajeTokioZDT, tokioZone));

        // 6. Comprobar hora local para llamar/WhatsApp
        System.out.println("\n¿Llamar o WhatsApp?");
        checkHoraLlamada(aterrizajeDohaZDT, "Doha");
        checkHoraLlamada(aterrizajeTokioZDT, "Tokio");

        // 7. Calcular tiempo total del viaje
        Duration tiempoTotal = Duration.between(salidaMadridZDT, aterrizajeTokioZDT);
        System.out.println("\nTiempo total del viaje: " +
                tiempoTotal.toHours() + "h " +
                tiempoTotal.toMinutesPart() + "m");

        // 8. Comprobar si es fin de semana en Tokio
        if (aterrizajeTokioZDT.getDayOfWeek() == DayOfWeek.SATURDAY ||
                aterrizajeTokioZDT.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("\n¡Es fin de semana en Tokio! Envía WhatsApp a tus amigos.");
        }
    }

    private static String formatZDT(ZonedDateTime zdt, ZoneId zone) {
        return zdt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z")) +
                " (Hora local: " + zdt.withZoneSameInstant(zone).toLocalTime() + ")";
    }

    private static void checkHoraLlamada(ZonedDateTime aterrizaje, String ciudad) {
        LocalTime horaLocal = aterrizaje.toLocalTime();
        if (horaLocal.isAfter(LocalTime.of(9, 0)) && horaLocal.isBefore(LocalTime.of(22, 0))) {
            System.out.println("  En " + ciudad + " (" + horaLocal + "): Puedes LLAMAR");
        } else {
            System.out.println("  En " + ciudad + " (" + horaLocal + "): Envía WhatsApp");
        }
    }
}