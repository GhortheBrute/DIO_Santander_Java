package Extras;

import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o titular da conta: ");
        String titular = scanner.nextLine();

        System.out.println("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
        
        // TODO: Verifique se o saldo inicial é negativo e encerra o programa:
        if (saldo < 0){
            System.out.println("Erro: O saldo nao pode ser negativo.");
            scanner.close();
            return;
        }

        System.out.println("Informe um valor de depósito para a conta:");
        double deposito = scanner.nextDouble();

        // Verificação se o depósito é inválido e encerra o programa
        if (deposito <= 0) {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            scanner.close();
            return;
        }

        // TODO: Crie um objeto ContaBancaria com os valores lidos:
        ContaBancaria conta = new ContaBancaria(numero, titular, saldo);
        
        
        conta.depositar(deposito);
        
        conta.exibirSaldo();

        scanner.close();
    }
}