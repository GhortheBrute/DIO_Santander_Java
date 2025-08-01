package Extras;

import java.util.Scanner;

public class Extra3 {


    // Classe que representa um Pedido:
    static class Pedido {
        private int id;
        private String cliente;
        private double valorTotal;

        // TODO: Crie o construtor para inicializar os atributos da classe:
        Pedido (int id, String cliente, double valorTotal){
            this.id = id;
            this.cliente = cliente;
            this.valorTotal = valorTotal;
        }


        // TODO: Implemente o método para exibir as informações do pedido formatadas corretamente:
        public void exibirPedido() {
            // Pedido #101 - Cliente: Joao Silva - Total: R$150.75
            System.out.printf("Pedido #%d - Cliente: %s - Total: R$%.2f", this.id, this.cliente, this.valorTotal);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        scanner.nextLine();

        String cliente = scanner.nextLine();

        double valorTotal = scanner.nextDouble();

        Pedido pedido = new Pedido(id, cliente, valorTotal);

        pedido.exibirPedido();

        scanner.close();
    }

}
