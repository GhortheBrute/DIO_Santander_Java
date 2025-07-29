package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe02.Metodo01;
/*
Escreva um código que calcule o valor de tributos de produtos, os produtos disponíveis devem ser dos seguintes tipos: Alimentação, Saude e bem estar, Vestuário e Cultura. Todos os produtos devem ter um métod o para retornar o seu valor de imposto, de acordo com seu tipo:

Alimentação 1%;
Saude e bem estar 1.5%;
Vestuário 2.5%;
Cultura 4%.
 */
public class Exe02 {
    public static void main(String[] args) {
        Alimentacao alimentacao = new Alimentacao();
        SaudeBemEstar saudeBemEstar = new SaudeBemEstar();
        Vestuario vestuario = new Vestuario();
        Cultura cultura = new Cultura();
        System.out.println(alimentacao.calcularImposto(100));
        System.out.println(saudeBemEstar.calcularImposto(100));
        System.out.println(vestuario.calcularImposto(100));
        System.out.println(cultura.calcularImposto(100));
    }
}
