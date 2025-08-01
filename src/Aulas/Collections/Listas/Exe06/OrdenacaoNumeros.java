package Aulas.Collections.Listas.Exe06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public void ordenarCrescente(){
        numeros.sort(Integer::compare);
        numeros.forEach(System.out::println);
    }

    public void ordenarDecrescente(){
//        numeros.sort((n1, n2) -> n2.compareTo(n1));
        numeros.sort(Comparator.reverseOrder());
        numeros.forEach(System.out::println);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(9);

        ordenacaoNumeros.ordenarCrescente();
        ordenacaoNumeros.ordenarDecrescente();
    }
}
