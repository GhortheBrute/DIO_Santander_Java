package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe02.Metodo02;

public class Exe02 {
    public static void main(String[] args) {
        double valor = 100.0;

        Produto alimentação = Produto.ALIMENTAÇÃO;
        Produto saude = Produto.SAUDE_E_BEM_ESTAR;
        Produto vestuario = Produto.VESTUARIO;
        Produto cultura = Produto.CULTURA;

        System.out.println("Imposto: R$ " + alimentação.calcularImposto( valor ) + " sobre o valor de R$ " + valor + ".");
        System.out.println("Imposto: R$ " + saude.calcularImposto( valor ) + " sobre o valor de R$ " + valor + ".");
        System.out.println("Imposto: R$ " + vestuario.calcularImposto( valor ) + " sobre o valor de R$ " + valor + ".");
        System.out.println("Imposto: R$ " + cultura.calcularImposto( valor ) + " sobre o valor de R$ " + valor + ".");
    }
}
