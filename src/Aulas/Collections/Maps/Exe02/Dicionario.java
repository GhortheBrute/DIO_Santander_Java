package Aulas.Collections.Maps.Exe02;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.putIfAbsent(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirPalavras(){
        palavras.forEach((palavra, definicao) -> {
            System.out.println(palavra + " -> " +definicao);
        });
    }

    public void pesquisarPorPalavra(String palavra){
        var definicao = palavras.getOrDefault(palavra, "definicao");
        System.out.println(palavra + " -> " + definicao);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Maria", "Nome próprio");
        dicionario.adicionarPalavra("Carro", "Veículo automotor de transporte");
        dicionario.adicionarPalavra("Prédio", "Estrutura de concreto");
        dicionario.adicionarPalavra("Gato", "Animal de estimação");
        dicionario.adicionarPalavra("PC", "Equipamento tecnológico que permite efetuar diversas tarefas automatizadas");

        dicionario.exibirPalavras();

        System.out.println("====");

        dicionario.pesquisarPorPalavra("PC");

        System.out.println("====");

        dicionario.removerPalavra("Carro");

        dicionario.exibirPalavras();
    }
}
