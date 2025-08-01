package Desafios.Desafio_POO;

public class iPhone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + ".");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da web [" + url + "].");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println( "Abrindo uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música [" + musica + "] selecionada.");
    }
}
