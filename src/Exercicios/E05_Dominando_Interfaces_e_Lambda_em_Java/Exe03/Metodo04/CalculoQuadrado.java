package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo04;

public class CalculoQuadrado implements EstrategiaCalculo{

    @Override
    public double calcular(double... parametros) {
        return parametros[0] * parametros[0];
    }
}
