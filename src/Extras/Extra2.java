package Extras;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Extra2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        ZonedDateTime brazil = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println("Horário em GMT " + zonedDateTime.format(formatter));
        System.out.println("Horário em GMT-4 " + brazil.format(formatter));
    }
}
