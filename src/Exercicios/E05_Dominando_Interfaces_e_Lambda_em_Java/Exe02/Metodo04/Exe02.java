package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe02.Metodo04;

public class Exe02 {
    public static void main(String[] args) {
        Tributacao tributo = getTributacao("Vestuário");
        System.out.println("Imposto: R$ " + tributo.calcular(100));
    }

    public static Tributacao getTributacao(String tipo){
        return switch (tipo){
            case "Alimentação" -> valor -> valor * 0.01;
            case "Saúde e Bem Estar" -> valor -> valor * 0.015;
            case "Vestuário" -> valor -> valor * 0.025;
            case "Cultura" -> valor -> valor * 0.04;
            default -> valor -> 0.0;
        };
    }
}
