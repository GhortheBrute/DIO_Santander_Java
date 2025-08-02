package Aulas.Collections.Sets.Exe05;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String descricao, double preco, int quantidade){
        produtos.add(new Produto(descricao, cod, preco, quantidade));
    }

    public void exibirProdutosPorNome(){
        produtos.stream().sorted(Comparator.comparing(p -> p.getDescricao())).forEach(System.out::println);
    }

    public void exibirProdutosPorPreco(){
        produtos.stream().sorted(Comparator.comparingDouble(p -> p.getPreco())).forEach(System.out::println);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123, "Caneta", 1.50, 10);
        cadastroProdutos.adicionarProduto(234, "Lapis", 0.50, 5);
        cadastroProdutos.adicionarProduto(345, "Borracha", 1.75, 2);
        cadastroProdutos.adicionarProduto(456, "Caderno", 10.50, 3);
        cadastroProdutos.adicionarProduto(567, "Borracha", 1.75, 2);
        cadastroProdutos.adicionarProduto(678, "Borracha", 1.75, 2);
        cadastroProdutos.adicionarProduto(789, "Borracha", 1.75, 2);

        cadastroProdutos.exibirProdutosPorNome();
        System.out.println("====");
        cadastroProdutos.exibirProdutosPorPreco();
    }
}
