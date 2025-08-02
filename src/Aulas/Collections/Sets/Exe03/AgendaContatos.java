package Aulas.Collections.Sets.Exe03;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        contatos.forEach(System.out::println);
    }

    public void pesquisarPorNome(String nome){
        contatos.stream().filter(c -> c.getNome().contains(nome)).forEach(System.out::println);
    }

    public void atualizarNumeroContato(String nome, int  novoNumero){
        contatos.forEach(c -> {
            if (c.getNome().equalsIgnoreCase(nome)) c.setTelefone(novoNumero);
        });
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Wilde", 123);
        agenda.adicionarContato("Ana", 456);
        agenda.adicionarContato("Carlos", 134);
        agenda.adicionarContato("Maria", 156);
        agenda.exibirContatos();
        System.out.println("\n====");
        agenda.pesquisarPorNome("Carlos");
        System.out.println("\n====");
        agenda.atualizarNumeroContato("Maria", 987);
        agenda.exibirContatos();
    }
}
