package Desafios.Desafio_Conta_Bancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void exibirCliente(){
        var titulares = contas.stream().map(t -> t.cliente.getNome()).toList();
        System.out.println("Titulares: " + titulares);
    }

    public void adicionarClienteCC(Cliente cliente){
        contas.add(new ContaCorrente(cliente));
    }

    public void adicionarClienteCP(Cliente cliente){
        contas.add(new ContaPoupanca(cliente));
    }

}
