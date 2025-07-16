/*  Exercícios
    1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
    "Olá 'Fulano', você tem 'X' anos"

    2 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
        . Fórmula: área = lado x lado | lado ²

    3 - Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela.
        . Fórmula: área = base x altura

    4 - Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença entre elas.
 */
package Exercicios.E01_Fundamentos_da_linguagem_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 01
        System.out.println("#### Exercício 1 ####");
        System.out.println("Digite seu nome:");
        String exe1Name = scanner.nextLine();
        System.out.println("Digite o ano de seu nascimento:");
        int exe1Age = scanner.nextInt();
        System.out.printf("Olá %s, você tem %d anos", exe1Name, (2025-exe1Age));

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();
        scanner.nextLine();

        // Exercício 02
        System.out.println("\n\n##### Exercício 2 ####");
        System.out.println("Digite o tamanho do lado do quadrado:");
        float exe2Lado = 0;
        while(true) {
            try {
                exe2Lado = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("O valor deve ser um número flutuante (Ex: 1.5). Pressione ENTER para continuar");
                scanner.nextLine();
            }
        }
        System.out.printf("A área de um quadrado com lado de %.2f é de %.2f", exe2Lado, (exe2Lado*exe2Lado));

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();
        scanner.nextLine();

        // Exercício 03
        System.out.println("\n\n#### Exercicio 3 ####");
        System.out.println("Digite o tamanho da base de um retângulo.");
        float exe3Base = 0;
        while(true) {
            try{
                exe3Base = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("O valor deve ser um número flutuante (Ex: 1.5). Pressione ENTER para continuar");
                scanner.nextLine();
            }
        }
        System.out.println("Digite o tamanho da altura do retângulo.");
        float exe3Altura = 0;
        while(true) {
            try{
                exe3Altura = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("O valor deve ser um número flutuante (Ex: 1.5). Pressione ENTER para continuar");
                scanner.nextLine();
            }
        }
        System.out.printf("A área de um retângulo de base %.2f e altura %.2f é de %.2f",exe3Base,exe3Altura,(exe3Base*exe3Altura));

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();
        scanner.nextLine();

        // Exercício 04
        System.out.println("\n\n#### Exercicio 4 ####");
        System.out.println("Digite o 1º nome:");
        String exe4Name1 = scanner.nextLine();
        System.out.println("Digite a idade do 1º nome:");
        int exe4Age1 = scanner.nextInt();
        System.out.println("Digite o 2º nome:");
        String exe4Name2 = scanner.next();
        System.out.println("Digite a idade do 2º nome:");
        int exe4Age2 = scanner.nextInt();
        int resultado = Math.abs(exe4Age1 - exe4Age2);
        System.out.printf("A diferença de idade entre %s, de %d anos e %s, de %d anos é de %d", exe4Name1, exe4Age1, exe4Name2, exe4Age2, resultado);
    }
}