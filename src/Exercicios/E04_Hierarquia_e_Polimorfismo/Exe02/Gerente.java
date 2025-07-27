package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe02;

public class Gerente extends Funcionario{
    public Gerente(String nome, String senha) {
        super(nome, senha);
        this.admin = true;
    }
}
