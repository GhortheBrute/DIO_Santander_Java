package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe02.Metodo02;

public enum Produto {
    ALIMENTAÇÃO(0.01),
    SAUDE_E_BEM_ESTAR(0.015),
    VESTUARIO(0.025),
    CULTURA(0.04);

    private final double aliquota;

    Produto(double aliquota){
        this.aliquota = aliquota;
    }

    public double calcularImposto(double valor){
        return valor * aliquota;
    }
}
