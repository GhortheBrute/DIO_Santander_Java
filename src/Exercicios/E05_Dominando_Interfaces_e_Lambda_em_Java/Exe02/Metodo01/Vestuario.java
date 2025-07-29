package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe02.Metodo01;

public class Vestuario implements Tributacao{
    @Override
    public double calcularImposto(double preco) {
        return preco *= 1.025;
    }
}
