package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe03;

import java.util.Scanner;

public class Exe03 {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();

    public static void main(String[] args) {
        while (true) {
            try{
                System.out.println("Bem vindo ao menu da Máquina de Banho PET. Escolha uma opção.");
                System.out.println("1 - Dar banho.");
                System.out.println("2 - Abastecer com água.");
                System.out.println("3 - Abastecer com shampoo.");
                System.out.println("4 - Verificar nível de água.");
                System.out.println("5 - Verificar nível de shampoo.");
                System.out.println("6 - Verificar ocupação.");
                System.out.println("7 - Colocar o PET.");
                System.out.println("8 - Retirar o PET.");
                System.out.println("9 - Limpar.");
                System.out.println("10 - Sair.");
                var option = scanner.nextInt();
                var selectedOption = Menu.values()[option - 1];
                switch (selectedOption) {
                    case DAR_BANHO -> maquinaDeBanho.darBanho();
                    case ABASTECER_AGUA -> maquinaDeBanho.abastecerAgua();
                    case ABASTECER_SHAMPOO ->  maquinaDeBanho.abastecerShampoo();
                    case VERIFICAR_AGUA -> maquinaDeBanho.verificarAgua();
                    case VERIFICAR_SHAMPOO -> maquinaDeBanho.verificarShampoo();
                    case VERIFICAR_OCUPACAO -> maquinaDeBanho.verificarOcupacao();
                    case COLOCAR_PET -> maquinaDeBanho.colocarPet();
                    case RETIRAR_PET -> maquinaDeBanho.retirarPet();
                    case LIMPAR ->  maquinaDeBanho.limpar();
                    case SAIR -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Valor inválido. Por favor insira um valor entre 1 e 10.");
            }
        }
    }
}
