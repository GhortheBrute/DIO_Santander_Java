package Desafios.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {
    List<Integer> numeros;

    public Desafio() {
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    // Desafio 1 - Mostre a lista na ordem numérica
    public void exibirEmOrdemCrescente() {
        System.out.println("Números na ordem crescente:");
        numeros.stream().sorted().forEach(System.out::println);
    }

    // Desafio 2 - Imprima a soma dos números pares da lista
    public void somarPares() {
        var somaPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos números pares: " + somaPares);
    }

    // Desafio 3 - Verifique se todos os números da lista são positivos
    public void verificarSePositivos() {
        var positivos = numeros.stream().filter(n -> n > 0).count();
        if (positivos == numeros.size()) System.out.println("Todos os números são positivos.");
        else System.out.println("Nem todos os número são positivos.");
    }

    // Desafio 4 - Remova todos os valores ímpares
    public void removerValoresImpares() {
        var soValoresPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Somente valores pares: " + soValoresPares);
    }

    // Desafio 5 - Calcule a média dos números maiores que 5
    public void mediaMaioresQue5() {
        var media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Média dos números maiores que 5: " + media);
    }

    // Desafio 6 - Verificar se a lista contém algum número maior que 10
    public void verificarMaiorQue10() {
        var maiorQue10 = numeros.stream().anyMatch(n -> n > 10);
        if (maiorQue10) System.out.println("A lista possui números maiores que 10.");
        else System.out.println("A lista não possui números maiores que 10.");
    }

    // Desafio 7 - Encontrar o segundo maior número da lista
    public void encontrarSegundoMaior() {
        int segundoMaior = numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println("Segundo maior número: " + segundoMaior);
    }

    // Desafio 8 - Somar os dígitos de todos os números da lista.
    public void somarDigitos() {
        var somaDigitos = numeros.stream()
                .flatMap(n -> String.valueOf(Math.abs(n)).chars().mapToObj(c -> c - '0'))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma dos dígitos: " + somaDigitos);
    }

    // Desafio 9 - Verificar se todos os números da lista são distintos
    public void verificarDistintos() {
        var distintos = numeros.stream().distinct().count() == numeros.size();
        if (distintos) System.out.println("Todos os números da lista são distintos.");
        else System.out.println("Há números repetidos na lista.");
    }

    // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
    public void agruparValoresImpares() {
        var valoresMultiplosDe3 = numeros.stream().filter(n -> n % 2 != 0 && n % 3 == 0).toList();
        var valoresMultiplosDe5 = numeros.stream().filter(n -> n % 2 != 0 && n % 5 == 0).toList();
        System.out.println("Lista de múltiplos de 3: " + valoresMultiplosDe3);
        System.out.println("Lista de múltiplos de 5: " + valoresMultiplosDe5);

/*        Map<Integer, List<Integer>> valoresMultiplos = numeros.stream()
               .filter(n -> n % 2 != 0)
                .flatMap(n -> Stream.of(3, 5)
                        .filter(m -> n % m == 0)
                        .map(m -> Map.entry(m, n)))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())
                ));
       System.out.println("Ímpares múltiplos de 3: " + valoresMultiplos.get(3));
        System.out.println("Ímpares múltiplos de 5: " + valoresMultiplos.get(5));*/
    }

    // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
    public void somarQuadrados() {
        var somaQuadrados = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Soma dos quadrados: " + somaQuadrados);
    }

    // Desafio  12 - Encontre o produto de todos os números da lista
    public void produtoDeValores() {
        var produto = numeros.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
        System.out.println("Produto dos valores: " + produto);
    }

    // Desafio 13 - Filtrar os números que estão num intervalo
    public void filterIntervalo() {
        var intervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).toList();
        System.out.println("Intervalo: " + intervalo);
    }

    // Desafio 14 - Encontre o maior número primo da lista
    public void encontrarMaiorPrimo() {
        var maiorPrimo = filtrarPrimos().stream().max(Integer::compareTo).orElse(0);
        System.out.println("Maior número primo: " + maiorPrimo);

    }

    // Desafio 15 - Verifique se a lista contém pelo menos um número negativo
    public void verificarNegativo() {
        var negativo = numeros.stream().anyMatch(n -> n < 0);
        if (negativo) System.out.println("A lista possui números negativos.");
        else System.out.println("A lista não possui números negativos.");
    }

    // Desafio 16 - Calcule o fatorial de um número
    public void calcularFatorial() {
        var fatorial = numeros.stream().distinct().collect(Collectors.toMap(n -> n, Desafio::fatorial));
        fatorial.forEach((n, f) -> System.out.println(n + "! = " + f));
    }

    public static long fatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Não existe fatorial de número negativo.");
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Desafio 17 - Agrupe os números em pares e ímpares
    public void agruparParesEImpares() {
        var soValoresPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        var soValoresImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
        System.out.println("Somente valores pares: " + soValoresPares);
        System.out.println("Somente valores ímpares: " + soValoresImpares);
    }

    // Desafio 18 - Filtrar os números primos da lista
    public List<Integer> filtrarPrimos() {
        return numeros.stream().filter(Desafio::isPrimo).toList();
    }

    public static boolean isPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Desafio 19 - Verifique se todos os números da lista são iguais
    public void verificarIguais() {
        var iguais = numeros.stream().distinct().count() == 1;
        //var iguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));
        if (iguais) System.out.println("Todos os números são iguais.");
        else System.out.println("Nem todos os números são iguais.");
    }

    // Desafio 20 - Encontre a soma dos números divisíveis por 3 e 5
    public void encontrarSoma() {
        var numerosDivisiveis = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(0, Integer::sum);
        if (numerosDivisiveis == 0) System.out.println("Nenhum número encontrado.");
        else System.out.println("Soma dos números divisíveis por 3 e 5: " + numerosDivisiveis);
    }

    public static void main(String[] args) {
        Desafio desafio = new Desafio();

        desafio.exibirEmOrdemCrescente();

        System.out.println("====");

        desafio.somarPares();

        System.out.println("====");

        desafio.verificarSePositivos();

        System.out.println("====");

        desafio.removerValoresImpares();

        System.out.println("====");

        desafio.mediaMaioresQue5();

        System.out.println("====");

        desafio.verificarMaiorQue10();

        System.out.println("====");

        desafio.encontrarSegundoMaior();

        System.out.println("====");

        desafio.somarDigitos();

        System.out.println("====");

        desafio.verificarDistintos();

        System.out.println("====");

        desafio.agruparValoresImpares();

        System.out.println("====");

        desafio.somarQuadrados();

        System.out.println("====");

        desafio.produtoDeValores();

        System.out.println("====");

        desafio.filterIntervalo();

        System.out.println("====");

        desafio.encontrarMaiorPrimo();

        System.out.println("====");

        desafio.verificarNegativo();

        System.out.println("====");

        desafio.calcularFatorial();

        System.out.println("====");

        desafio.agruparParesEImpares();

        System.out.println("====");

        System.out.println("Números primos");
        desafio.filtrarPrimos().forEach(System.out::println);

        System.out.println("====");

        desafio.verificarIguais();

        System.out.println("====");

        desafio.encontrarSoma();
    }
}
