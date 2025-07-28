package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe01.Metodo01;

public class Mensagem implements SMS, Email, RedesSociais, Whatsapp{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem ['" + mensagem + "'] enviada para todas os canais.");
    }
}
