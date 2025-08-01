package Aulas.Collections.Listas.Exe01;

import java.util.ArrayList;

public class ListaTarefas {
    protected ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefas.removeIf(t -> t.getDescricao().equals(descricao));
    }
    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public ArrayList<Tarefa> obterDescricoesTarefas(){
        return tarefas;
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("descricao 1");
        lista.adicionarTarefa("descricao 2");
        lista.adicionarTarefa("descricao 3");

        System.out.println("=====");

        System.out.println("Número total de Tarefas: " + lista.obterNumeroTotalTarefas());

        for (Tarefa descricao : lista.obterDescricoesTarefas()){
            System.out.println(descricao.getDescricao());
        }

        System.out.println("=====");

        lista.removerTarefa("descricao 2");

        System.out.println("Número total de Tarefas: " + lista.obterNumeroTotalTarefas());

        for (Tarefa descricao : lista.obterDescricoesTarefas()){
            System.out.println(descricao.getDescricao());
        }

        System.out.println("=====");
    }


}
