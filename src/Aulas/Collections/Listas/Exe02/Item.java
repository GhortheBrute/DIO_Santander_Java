package Aulas.Collections.Listas.Exe02;

public class Item {
    private final String descricao;
    private final int quantidade;
    private final double preco;

    public Item(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

}
