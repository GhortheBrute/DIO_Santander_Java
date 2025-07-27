package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe03;

public class BrasileiraSP extends Hora{
    public BrasileiraSP(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        this.gmt = GMT.GMT_MENOS_3;
    }
}
