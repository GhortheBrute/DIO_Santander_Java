package Desafios.Desafio_01;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        // Importação da classe Scanner
        Scanner scanner = new Scanner(System.in);
        String agencia;
        int numeroConta;
        BigDecimal saldo;

        // Exibição de mensagens e aquisição dos dados com scanner
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        while(true){
            try{
                System.out.println("Digite o número de sua Agência: (Formato: 9999-9) ");
                agencia = scanner.nextLine();
                if(agencia.matches("\\d{4}-\\d")){
                   break;
                }else {
                    throw new Exception("Formato de Agência Inválido.\n");
                }
            }catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while(true){
            try{
                System.out.println("Digite o número de sua Conta: (Formato:9999) ");
                numeroConta = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Número da conta deve conter apenas números inteiros.\n");
            }
        }

        while(true) {
            try {
                System.out.println("Digite o saldo inicial da sua conta: (Formato: 9999,99) ");
                String saldoString = scanner.nextLine().replace(",", ".");
                saldo = new BigDecimal(saldoString);
                break;
            }catch (Exception e){
                System.out.println("Formato de saldo inválido.\n");
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %s já está disponível para saque", nome, agencia, numeroConta, saldo);
    }
}
