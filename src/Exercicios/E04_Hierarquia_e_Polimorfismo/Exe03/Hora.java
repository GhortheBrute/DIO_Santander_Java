package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe03;

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


    public String toString() {
        int horaAjustada = (hora + gmt.getOffset()) % 24;
        if (horaAjustada < 0 ) horaAjustada += 24;
        return String.format("Horário " + this.getClass().getSimpleName() + "(GMT%s): %02d:%02d:%02d",(gmt.getOffset() >= 0 ? "+": "") + gmt.getOffset(), horaAjustada, minuto, segundo);
    }
}
