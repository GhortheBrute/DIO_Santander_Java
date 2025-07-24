package Desafios.Desafio_Controle_Fluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class contador {
    public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Digite o primeiro parâmetro");
				int parametroUm = terminal.nextInt();
				System.out.println("Digite o segundo parâmetro");
				int parametroDois = terminal.nextInt();

				contar(parametroUm, parametroDois);

				break;
			} catch (InputMismatchException e) {
				System.out.println("Digite um número inteiro válido.");
				terminal.next(); // limpa o terminal
			} catch (ParametrosInvalidosException e){
				System.out.println(e.getMessage());
			}
		}

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
