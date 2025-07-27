package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe02;

public abstract class Funcionario {
    private String nome;
    private String senha;
    protected boolean admin;

    public Funcionario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        admin = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String toString() {
        String adminTexto = admin ? "sim" : "não";
        return this.getClass().getSimpleName() +
                ": nome= " + nome +
                ", senha= " + senha +
                ", admin= " + adminTexto;
    }
}
