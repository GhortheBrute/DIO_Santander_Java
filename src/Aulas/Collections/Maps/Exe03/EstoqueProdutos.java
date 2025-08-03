package Aulas.Collections.Maps.Exe03;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        produtos.forEach((codigo, produto) -> {
            System.out.println(codigo + " - " + produto);
        });
    }

    public double calcularValorTotalEstoque(){
        return produtos.values().stream().mapToDouble(p -> p.getPreco() * p.getQuantidade()).sum();

        //return produtos.values().forEach(p -> p.getQuantidade() * p.getQuantidade()).sum();
    }

    public void obterProdutoMaisCaro(){
        Produto produtoMaisCaro =  produtos.values().stream().reduce((p1, p2) -> p1.getPreco() > p2.getPreco() ? p1 : p2).get();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }

    public void obterProdutoMaisBarato(){
        Produto produtoMaisBarato =  produtos.values().stream().reduce((p1, p2) -> p1.getPreco() < p2.getPreco() ? p1 : p2).get();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    }

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque =  produtos.values().stream().reduce((p1, p2) -> p1.getQuantidade() * p1.getPreco() > p2.getQuantidade() * p2.getPreco() ? p1 : p2).get();
        System.out.println("Produto com maior quantidade e valor total no estoque: " + produtoMaiorQuantidadeValorTotalNoEstoque);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1, "Açucar", 10, 1.50);
        estoque.adicionarProduto(2, "Leite", 15, 2.50);
        estoque.adicionarProduto(3, "Arroz", 5, 3.50);

        estoque.exibirProdutos();

        System.out.println("=====");

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("=====");

        estoque.obterProdutoMaisCaro();

        System.out.println("=====");

        estoque.obterProdutoMaisBarato();

        System.out.println("=====");

        estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }
}
