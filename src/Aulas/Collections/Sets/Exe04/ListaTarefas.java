package Aulas.Collections.Sets.Exe04;

import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new java.util.HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    public void exibirTarefas(){
        tarefas.forEach(System.out::println);
    }

    public void contarTarefas(){
        System.out.println("Quantidade de Tarefas: " + tarefas.size());
    }

    public void obterTarefasConcluidas(){
        tarefas.stream().filter(Tarefa::isConcluida).forEach(System.out::println);
    }

    public void obterTarefasPendentes(){
        tarefas.stream().filter(t -> !t.isConcluida()).forEach(System.out::println);
    }

    public void marcarTarefaConcluida(String descricao) {
        tarefas.stream().filter(t -> t.getDescricao().equalsIgnoreCase(descricao)).forEach((t -> t.setConcluida(true)));
    }

    public void marcarTarefaPendente(String descricao){
        tarefas.stream().filter(t -> t.getDescricao().equalsIgnoreCase(descricao)).forEach((t -> t.setConcluida(false)));
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Compras");
        lista.adicionarTarefa("Estudar");
        lista.adicionarTarefa("Estudar");
        lista.adicionarTarefa("Acampar");
        lista.adicionarTarefa("Cozinhar");

        lista.contarTarefas();
        lista.exibirTarefas();
        System.out.println("====");
        lista.obterTarefasConcluidas();
        System.out.println("====");
        lista.obterTarefasPendentes();
        System.out.println("====");
        lista.marcarTarefaConcluida("Estudar");
        lista.obterTarefasConcluidas();
        System.out.println("====");
        lista.marcarTarefaPendente("Estudar");
        lista.obterTarefasPendentes();
        System.out.println("====");
        lista.removerTarefa("Estudar");
        lista.contarTarefas();
        lista.exibirTarefas();
        System.out.println("====");
        lista.limparListaTarefas();
        lista.contarTarefas();
        lista.exibirTarefas();


    }
}
