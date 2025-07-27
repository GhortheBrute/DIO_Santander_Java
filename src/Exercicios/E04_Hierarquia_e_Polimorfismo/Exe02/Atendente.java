package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe02;

public class Atendente extends Funcionario {
    private double valorEmCaixa;

    public Atendente(String nome, String senha, double valorEmCaixa) {
        super(nome, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", valor em caixa: R$ " + valorEmCaixa +
                ".";
    }
}
