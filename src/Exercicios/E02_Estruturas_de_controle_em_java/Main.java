package Exercicios.E02_Estruturas_de_controle_em_java;

import java.util.Scanner;

public class Main {
    public static String ClassificarIMC(double imc){
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else if (imc < 35) return "Obesidade grau I";
        else if (imc < 40) return "Obesidade grau II (Severa)";
        else return "Obesidade grau III(Mórbida)";
    }

    public static void main(String[] args) {
        // Inicializa um scanner
        Scanner scanner = new Scanner(System.in);

        // Exercício 01
        System.out.println("#### Exercício 1 - Tabuada de 10 ####");
        int exe1Num;

        while(true) {
            try{
                System.out.println("Digite um número inteiro.");
                exe1Num = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("O valor informado deve ser um número inteiro.");
            }
        }

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", exe1Num, i, exe1Num*i);
        }

        System.out.println("Pressiona ENTER para continuar.");
        scanner.nextLine();
        scanner.nextLine();

        //Exercício 02
        System.out.println("#### Exercício 2 - Cálculo de IMC ####");
        double exe2Peso;
        double exe2Altura;

        while(true){
            try{
                System.out.println("Digite seu peso em quilos.");
                exe2Peso = scanner.nextDouble();
                System.out.println("Digite sua altura em metros.");
                exe2Altura = scanner.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Valor informado inválido, deve ser no formato 99,9");
                scanner.nextLine();
                scanner.nextLine();
            }
        }
        var imc = exe2Peso / (exe2Altura * exe2Altura);
        String resultado = ClassificarIMC(imc);

        System.out.printf("Seu IMC é %.2f - Classificação: %s%n", imc, resultado);

        double pesoIdealMinimo = 18.5 * (exe2Altura * exe2Altura);
        double pesoIdealMaximo = 24.9 * (exe2Altura * exe2Altura);

        if (imc < 18.5){
            double pesoParaGanhar = pesoIdealMinimo - exe2Peso;
            System.out.printf("\nSeu peso ideal é entre %.2f e %.2f. Você precisa ganhar %.2f quilos de peso para se aproximar do peso ideal.\n", pesoIdealMinimo,pesoIdealMaximo,pesoParaGanhar);
        } else if (imc > 24.9){
            double pesoParaPerder = exe2Peso - pesoIdealMaximo;
            System.out.printf("\nSeu peso ideal é %.2f.Você precisa perder %.2f quilos de peso para se aproximar do peso ideal.\n",pesoIdealMaximo, pesoParaPerder);
        }

        System.out.println("Pressiona ENTER para continuar.");
        scanner.nextLine();
        scanner.nextLine();

        // Exercício 03
        System.out.println("#### Exercício 3 ####");
        int exe3Num1;
        int exe3Num2;
        int escolha;

        while(true){
            try{
                System.out.println("Digite um primeiro número inteiro.");
                exe3Num1 = scanner.nextInt();
                System.out.println("Digite um segundo número inteiro. Deve ser maior que o primeiro número.");
                exe3Num2 = scanner.nextInt();

                if (exe3Num2 < exe3Num1) {
                    throw new Exception("Segundo número deve ser maior que o primeiro.");
                }

                break;
            } catch (Exception e) {
                System.out.println("Número informado inválido. Deve ser um número inteiro.");
            }
        }

        while(true){
            try{
                System.out.println("Escolha entra exibir números Ímpares(1) ou Pares(2).");
                escolha = scanner.nextInt();
                if (escolha != 1 && escolha != 2) {
                    throw new Exception("Deve ser selecionado entre os números 1 e 2;");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        switch (escolha) {
            case 1:
                for(int i = exe3Num1; i <= exe3Num2; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                for(int i = exe3Num1; i <= exe3Num2; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
        }

        System.out.println("Pressiona ENTER para continuar.");
        scanner.nextLine();
        scanner.nextLine();

        // Exercício 04
        System.out.println("#### Exercício 4 ####");
        int exe4Num1;
        int exe4Num2;

        while(true){
            try{
                System.out.println("Digite um primeiro número inteiro.");
                exe4Num1 = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Valor inválido, deve ser informado um número inteiro.");
            }
        }

        while (true){
            try{
                System.out.println("Informe um número para realizar a operação.");
                exe4Num2 = scanner.nextInt();

                if (exe4Num2 < exe4Num1){
                    throw new Exception("Valor menor que o número inicial.");
                }else if (exe4Num2 % exe4Num1 != 0){
                    System.out.println("Resultado encontrado.");
                    break;
                }else{
                    throw new Exception("Resultado não encontrado.\n");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            }
        }
    }
}
