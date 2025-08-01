package Aulas.Collections.Listas.Exe02;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private final ArrayList<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String descricao, double preco, int quantidade){
        carrinho.add(new Item(descricao, preco, quantidade));
    }

    public void removerItens(String descricao){
        carrinho.removeIf(t -> t.getDescricao().equals(descricao));
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : carrinho){
            total += i.getPreco();
        }
        return total;
    }

    public void exibirItens(){
        for(Item i : carrinho){
            System.out.printf("\nProduto: %s - Quantidade: %d - Preço Unitário: R$ %.2f - Preço Total: R$ %.2f", i.getDescricao(), i.getQuantidade(), i.getPreco(), i.getQuantidade() * i.getPreco());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Shampoo", 19.9, 1);
        carrinho.adicionarItem("Condicionador", 18.9, 1);
        carrinho.adicionarItem("Desodorante", 15.9, 4);

        carrinho.exibirItens();

        System.out.println("\n=====");

        System.out.println("Preço total R$ " + carrinho.calcularValorTotal());


        System.out.println("=====");

        carrinho.removerItens("Desodorante");

        carrinho.exibirItens();

        System.out.println("\nPreço total R$ " + carrinho.calcularValorTotal());

    }
}
