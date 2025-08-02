package Aulas.Collections.Sets.Exe01;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoCOnvite(int codigoConvite){
        convidados.removeIf(c -> c.getCodigoConvite() == codigoConvite);
    }

    public void contarConvidados(){
        System.out.println("Quantidade de convidados: "+ convidados.size());
    }

    public void exibirConvidados(){
        System.out.println("Convidados: ");
        convidados.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("Wilde", 123);
        conjunto.adicionarConvidado("Ana", 456);
        conjunto.adicionarConvidado("Carlos", 134);
        conjunto.adicionarConvidado("Maria", 156);

        conjunto.contarConvidados();
        conjunto.exibirConvidados();

        conjunto.removerConvidadoPorCodigoCOnvite(123);
        conjunto.contarConvidados();
        conjunto.exibirConvidados();
    }
}
