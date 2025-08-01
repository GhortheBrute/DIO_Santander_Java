package Aulas.Collections.Listas.Exe03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        return livros.stream()
                     .filter(l -> l.getAutor().equalsIgnoreCase(autor)).toList();
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        return livros.stream()
                .filter(l -> l.getAno() >= anoInicial && l.getAno() <= anoFinal)
                .sorted(Comparator.comparingInt(Livro::getAno))
                .toList();
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        return livros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .toList();
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Peter Pan", "Sigmond", 1945);
        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Jane Austen", 1967);
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogoLivros.adicionarLivro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956);
        catalogoLivros.adicionarLivro("Capitães da Areia", "Jorge Amado", 1937);
        catalogoLivros.adicionarLivro("Morte e Vida Severina", "João Cabral de Melo Neto", 1955);

        for(Livro livro : catalogoLivros.pesquisaPorAutor("Jane Austen")){
            System.out.printf("\nTítulo: %s - Autor: %s - Ano: %d",livro.getTitulo(), livro.getAutor(), livro.getAno());
        }

        System.out.println("\n=====");

        for(Livro livro : catalogoLivros.pesquisaPorIntervaloAnos(1000, 1950)){
            System.out.printf("\nTítulo: %s - Autor: %s - Ano: %d",livro.getTitulo(), livro.getAutor(), livro.getAno());
        }

        System.out.println("\n=====");

        for(Livro livro : catalogoLivros.pesquisarPorTitulo("O Hobbit")){
            System.out.printf("\nTítulo: %s - Autor: %s - Ano: %d",livro.getTitulo(), livro.getAutor(), livro.getAno());
        }
    }
}
