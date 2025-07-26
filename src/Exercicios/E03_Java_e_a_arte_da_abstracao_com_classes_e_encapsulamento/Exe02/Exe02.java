package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe02;

/*
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
 */

import Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe02.Carro;

import java.util.Scanner;

public class Exe02 {

    private final static Scanner input = new Scanner(System.in);
    private final static Carro carro = new Carro();

    public static void main(String[] args) {


        while(true){
            try{
                System.out.println("Bem vindo ao aplicativo do veículo, selecione a operação desejada.");
                System.out.println("1 - Ligar o veículo");
                System.out.println("2 - Desligar o veículo");
                System.out.println("3 - Acelerar o veículo");
                System.out.println("4 - Desacelerar o veículo");
                System.out.println("5 - Virar para a direita");
                System.out.println("6 - Virar para a esquerda");
                System.out.println("7 - Sair");
                var option =  input.nextInt();
                var selectedOption = Menu.values()[option - 1];
                switch (selectedOption) {
                    case LIGAR ->  carro.ligar();
                    case DESLIGAR ->  carro.desligar();
                    case ACELERAR ->   carro.acelerar();
                    case DESACELERAR -> carro.desacelerar();
                    case VIRAR_PARA_DIREITA -> carro.virar("direita");
                    case VIRAR_PARA_ESQUERDA ->  carro.virar("esquerda");
                    case SAIR -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Opção inválida. Digite um número de 1 a 6.");
            }
        }
    }
}
