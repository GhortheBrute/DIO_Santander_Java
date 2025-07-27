package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe03;

public class AmericanaOeste extends Hora {
    public AmericanaOeste(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        this.gmt = GMT.GMT_MENOS_8;
    }
}
