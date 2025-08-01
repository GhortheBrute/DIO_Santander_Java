package Aulas.Collections.Listas.Exe04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
2. Soma de Números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */
public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void calcularSoma(){
//        int soma = 0;
//        for(int numero : numeros){
//            soma += numero;
//        }
//        System.out.println("Soma: " + soma);
        System.out.println("Soma: " + numeros.stream().mapToInt(Integer::intValue).sum());
    }

    public void encontrarMaiorNumero(){
//        int maior = 0;
//        for (int numero : numeros){
//            if(numero > maior) maior = numero;
//        }
//        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + numeros.stream().mapToInt(Integer::intValue).min().getAsInt());
    }

    public void encontrarMenorNumero(){
//        int menor = Integer.MAX_VALUE;
//        for (int numero: numeros){
//            if (numero < menor) menor = numero;
//        }
//        System.out.println("Menor: " + menor);
        System.out.println("Menor: " + numeros.stream().mapToInt(Integer::intValue).max().getAsInt());
    }

    public void exibirNumeros() {
//        for (int numero : numeros) System.out.println(">" + numero + " ");
        System.out.println("Numeros: " + Arrays.toString(numeros.toArray()));
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(3);
        soma.adicionarNumero(4);
        soma.adicionarNumero(5);
        soma.adicionarNumero(6);
        soma.adicionarNumero(7);
        soma.adicionarNumero(8);
        soma.adicionarNumero(9);

        soma.exibirNumeros();

        soma.calcularSoma();

        soma.encontrarMaiorNumero();

        soma.encontrarMenorNumero();

    }
}
