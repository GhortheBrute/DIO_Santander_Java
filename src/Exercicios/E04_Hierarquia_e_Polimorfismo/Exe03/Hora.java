package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe03;

import java.time.*;
import java.time.format.DateTimeFormatter;

public abstract class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    protected GMT gmt;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.gmt = GMT.GMT_0;
    }

    public ZonedDateTime getZonedDateTime(){
        LocalDate hoje = LocalDate.now();
        LocalTime hora = LocalTime.of(this.hora, this.minuto, this.segundo);
        LocalDateTime dataHoraUTC = LocalDateTime.of(hoje, hora);

        ZoneOffset offset = ZoneOffset.ofHours(gmt.getOffset());
        ZoneId zoneId = ZoneId.ofOffset("UTC", offset);
        return dataHoraUTC.atZone(ZoneOffset.UTC).withZoneSameInstant(zoneId);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String horarioFormatado = formatter.format(getZonedDateTime());
        return String.format("Horário %s (%s): %s", this.getClass().getSimpleName(), gmt.toString(), horarioFormatado);
    }
}
