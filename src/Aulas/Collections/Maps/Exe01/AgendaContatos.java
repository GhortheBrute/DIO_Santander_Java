package Aulas.Collections.Maps.Exe01;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        contatos.remove(nome);
    }

    public void exibirContatos(){
        contatos.forEach((nome, telefone) -> {
            System.out.println(nome + ": " + telefone);
        });
    }

    public void pesquisarPorNome(String nome){
        System.out.println(contatos.getOrDefault(nome, 0));
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Maria", 23);
        agenda.adicionarContato("Pedro", 24);

        agenda.exibirContatos();

        System.out.println("====");

        agenda.pesquisarPorNome("Maria");
    }
}
