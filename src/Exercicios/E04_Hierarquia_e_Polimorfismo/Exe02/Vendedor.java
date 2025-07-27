package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe02;

public class Vendedor extends Funcionario{
    private int quantidadeDeVenda;

    public Vendedor(String nome, String senha, int quantidadeDeVenda) {
        super(nome, senha);
        this.quantidadeDeVenda = quantidadeDeVenda;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", quantidadeDeVenda=" + quantidadeDeVenda +
                '.';
    }
}
