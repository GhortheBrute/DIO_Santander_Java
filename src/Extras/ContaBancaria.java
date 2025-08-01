package Extras;

public class ContaBancaria {
    private int numero;      
    private String titular;  
    private double saldo;    

    public ContaBancaria(int numero, String titular, double saldo) throws Exception {
        this.numero = numero;
        this.titular = titular;

        // TODO: Verifica se o saldo inicial é negativo:
        if (saldo < 0){
            // TODO: Retorne a mensagem de erro adequada:
            var mensagem = "Erro: O saldo nao pode ser negativo.";
            System.out.println(mensagem);
            // TODO: Interrompa a criação do objeto e não continua:
            throw new Exception(mensagem);
        }

        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor <= 0) { // Verifica se o valor do depósito é inválido
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            return; // Interrompe a execução e não realiza o depósito
        }
        saldo += valor; // Atualiza o saldo apenas se o depósito for válido
    }

    // TODO: Crie o método para exibir as informações da conta:
    public void exibirSaldo() {
        // Conta #<numero> - Titular: <titular> - Saldo: R$<saldo formatado com duas casas decimais>
        System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f", numero, titular, saldo);
    }
    

}
