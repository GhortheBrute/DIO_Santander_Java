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
}
