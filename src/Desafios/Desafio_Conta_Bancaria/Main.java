package Desafios.Desafio_Conta_Bancaria;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

//		Conta cc = new ContaCorrente(venilton);
//		Conta poupanca = new ContaPoupanca(venilton);
//		cc.depositar(100);
//		cc.transferir(100, poupanca);
//
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();

        Banco banco = new Banco("Banco do Brasil");

        banco.adicionarClienteCC(venilton);
        banco.adicionarClienteCP(venilton);




        banco.exibirCliente();
	}

}
