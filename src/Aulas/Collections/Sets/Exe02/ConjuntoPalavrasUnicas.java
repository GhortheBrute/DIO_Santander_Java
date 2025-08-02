package Aulas.Collections.Sets.Exe02;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        if (palavrasUnicas.contains(palavra)) System.out.println("O conjunto contém a palabra " + palavra);
        else System.out.println("O conjunto não contém a palavra " + palavra);
    }

    public void exibirPalavrasUnicas(){
        palavrasUnicas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("JavaScript");
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("C++");
        conjunto.adicionarPalavra("C#");

        System.out.println("====");
        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("JavaScript");

        System.out.println("====");
        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("JavaScript");
        conjunto.verificarPalavra("C#");

        System.out.println("====");
        conjunto.exibirPalavrasUnicas();
    }
}
