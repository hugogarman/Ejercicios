package EjerciciosT6Fechas;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ejercicio7 {
    public static void main(String[] args) throws InterruptedException {

        long currentTimeMillis = System.currentTimeMillis();
        ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime epoch = ZonedDateTime.of(1970, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        long manualMillis = ChronoUnit.MILLIS.between(epoch, now);
        long diferencia = Math.abs(currentTimeMillis - manualMillis);

        System.out.println("System.currentTimeMillis(): " + currentTimeMillis);
        System.out.println("Cálculo manual desde 1970:  " + manualMillis);
        System.out.println("Diferencia:                 " + diferencia + " milisegundos");
    }
}
