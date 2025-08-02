package Aulas.Collections.Sets.Exe06;

import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new java.util.HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        alunos.removeIf(a -> a.getMatricula() == matricula);
    }

    public void exibirAlunosPorNome(){
        alunos.stream().sorted((a1, a2) -> a1.getNome().compareTo(a2.getNome())).forEach(System.out::println);
    }

    public void exibirAlunosPorNota(){
        alunos.stream().sorted((a1, a2) -> Double.compare(a2.getNota(), a1.getNota())).forEach(System.out::println);
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Wilde", 123, 10);
        alunos.adicionarAluno("Ana", 456, 9);
        alunos.adicionarAluno("Carlos", 134, 8);
        alunos.adicionarAluno("Maria", 156, 7);

        alunos.exibirAlunosPorNome();
        System.out.println("====");
        alunos.exibirAlunosPorNota();

        System.out.println("====");
        alunos.removerAluno(123);
        alunos.exibirAlunosPorNome();
        System.out.println("====");
        alunos.exibirAlunosPorNota();

    }
}
