package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe01.Metodo02;

public class Exe01 {
    public static void main(String[] args) {
        String texto = "Essa é a mensagem para cada canal individual.";

        EnviarMensagem[] canais = {
                new Email(),
                new RedesSociais(),
                new SMS(),
                new Whatsapp()
        };

        for (EnviarMensagem canal : canais) {
            canal.enviar(texto);
        }
    }

}
