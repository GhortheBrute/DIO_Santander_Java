package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe01;

/*
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado
na conta em sua criação;
Se o valor depositado na criação da conta for de R500,00 ou menos, o cheque especial deve ser de R$ 50,00.
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor
usado do cheque especial.
 */

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var conta1 = new ContaBancaria(1000.0);

        conta1.consultarSaldo();

        scanner.nextLine();

        conta1.consultarChequeEspecial();

        scanner.nextLine();

        conta1.consultarLimite();

        scanner.nextLine();

        conta1.depositarDinheiro(500.0);

        scanner.nextLine();

        conta1.sacarDinheiro(250.0);

        scanner.nextLine();

        conta1.pagarBoleto(1500.0);

        scanner.nextLine();

        conta1.consultarLimite();

        scanner.close();


    }
}
