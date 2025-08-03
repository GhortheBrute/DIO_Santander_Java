package Aulas.Collections.Maps.Exe04;

import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new java.util.HashMap<>();
    }

    public void adicionarPalavra(String palavra, int contagem){
        palavras.putIfAbsent(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        palavras.forEach((palavra, contagem) -> {
            System.out.println(palavra + " -> " + contagem);
        });
    }

    public void encontrarPalavraMaisFrequente(){
        palavras.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Maria", 1);
        contagem.adicionarPalavra("Pedro", 2);
        contagem.adicionarPalavra("Aline", 3);

        contagem.exibirContagemPalavras();

        System.out.println("=====");

        contagem.encontrarPalavraMaisFrequente();
        System.out.println("=====");

        contagem.removerPalavra("Aline");

        contagem.exibirContagemPalavras();

        System.out.println("=====");

        contagem.encontrarPalavraMaisFrequente();
    }
}
