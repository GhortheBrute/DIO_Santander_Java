package Desafios.Desafio_POO;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.ligar("1234-4567");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("======");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Musica 1");
        System.out.println("======");
        iphone.exibirPagina("www.google.com");
        iphone.abrirNovaAba();
        iphone.atualizarPagina();
    }
}
