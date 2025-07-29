package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo04;

public class CalculoCirculo implements EstrategiaCalculo{

    @Override
    public double calcular(double... parametros) {
        return Math.PI * Math.pow( parametros[0], 2);
    }
}
