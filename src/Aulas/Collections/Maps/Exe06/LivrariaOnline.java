package Aulas.Collections.Maps.Exe06;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LivrariaOnline {
    Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        Optional<String> linkParaRemover = livros.entrySet().stream().filter(l -> l.getValue().getTitulo().equals(titulo)).map(Map.Entry::getKey).findFirst();

        linkParaRemover.ifPresent(livros::remove);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        var livrosOrdenadosPorPreco = livros.values().stream().sorted((l1, l2) -> Double.compare(l1.getPreco(), l2.getPreco())).toList();
        System.out.println("Livros Ordenados por Preço: ");
        livrosOrdenadosPorPreco.forEach(System.out::println);
    }

    public void pesquisarLivrosPorAutor(String autor){
        var livrosPorAutor = livros.values().stream().filter(l -> l.getAutor().equalsIgnoreCase(autor)).toList();
        System.out.println("Livros por Autor: " + autor);
        livrosPorAutor.forEach(System.out::println);
    }

    public void obterLivroMaisCaro(){
        var livroMaisCaro = livros.values().stream().reduce((l1, l2) -> Double.compare(l1.getPreco(), l2.getPreco()) > 0 ? l1 : l2).get();
        System.out.println("Livro mais caro: " + livroMaisCaro);
    }

    public void obterLivroMaisBarato(){
        var livroMaisBarato = livros.values().stream().reduce((l1, l2) -> Double.compare(l1.getPreco(), l2.getPreco()) < 0 ? l1 : l2).get();
        System.out.println("Livro mais barato: " + livroMaisBarato);
    }

    public static void main(String[] args) {
        LivrariaOnline livro = new LivrariaOnline();

        livro.adicionarLivro("https://www.livro.com/livro1", "Livro 1", "Autor 1", 10.00);
        livro.adicionarLivro("https://www.livro.com/livro6", "Livro 6", "Autor 1", 10.00);
        livro.adicionarLivro("https://www.livro.com/livro2", "Livro 2", "Autor 2", 20.00);
        livro.adicionarLivro("https://www.livro.com/livro3", "Livro 3", "Autor 3", 30.00);
        livro.adicionarLivro("https://www.livro.com/livro4", "Livro 4", "Autor 4", 40.00);
        livro.adicionarLivro("https://www.livro.com/livro5", "Livro 5", "Autor 5", 50.00);

        livro.exibirLivrosOrdenadosPorPreco();

        System.out.println("=====");

        livro.pesquisarLivrosPorAutor("Autor 1");

        System.out.println("=====");

        livro.obterLivroMaisCaro();

        System.out.println("=====");

        livro.obterLivroMaisBarato();
    }
}
