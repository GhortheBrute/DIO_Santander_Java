package Aulas.Collections.Sets.Exe05;

public class Produto {
    private String descricao;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String descricao, long cod, double preco, int quantidade) {
        this.descricao = descricao;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
