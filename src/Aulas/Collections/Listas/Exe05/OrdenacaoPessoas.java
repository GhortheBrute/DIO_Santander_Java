package Aulas.Collections.Listas.Exe05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, float altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordernarPorIdade(){
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("Pessoas ordenadas por idade");
        pessoas.forEach(System.out::println);
    }

    public void ordernarPorAltura(){
        pessoas.sort(Comparator.comparingDouble(Pessoa::getAltura));
        System.out.println("Pessoas ordenadas por altura");
        pessoas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.addPessoa("Maria", 21, 1.75f);
        ordenacaoPessoas.addPessoa("João", 24, 1.77f);
        ordenacaoPessoas.addPessoa("Paulo", 34, 1.86f);
        ordenacaoPessoas.addPessoa("Aline", 16, 1.47f);

        ordenacaoPessoas.ordernarPorIdade();
        ordenacaoPessoas.ordernarPorAltura();
    }
}
