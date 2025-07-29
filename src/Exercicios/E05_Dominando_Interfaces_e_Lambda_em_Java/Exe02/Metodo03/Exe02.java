package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe02.Metodo03;

import java.util.HashMap;
import java.util.Map;

public class Exe02 {
    public static void main(String[] args) {
        Map<String, Tributacao> tabela = new HashMap<>();
        tabela.put("Alimentação", valor -> valor * 0.01);
        tabela.put("Saúde e Bem Estar", valor -> valor * 0.015);
        tabela.put("Vestuário", valor -> valor * 0.025);
        tabela.put("Cultura", valor -> valor * 0.04);

        double imposto1 = tabela.get("Alimentação").calcular(100);
        double imposto2 = tabela.get("Saúde e Bem Estar").calcular(100);
        double imposto3 = tabela.get("Vestuário").calcular(100);
        double imposto4 = tabela.get("Cultura").calcular(100);

        System.out.println("Alimentação - Imposto: R$ " + imposto1);
        System.out.println("Saúde e Bem Estar - Imposto: R$ " + imposto2);
        System.out.println("Vestuário - Imposto: R$ " + imposto3);
        System.out.println("Cultura - Imposto: R$ " + imposto4);


    }
}
