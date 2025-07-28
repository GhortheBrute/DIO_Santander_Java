package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe01.Metodo03;

public class Exe01 {
    public static void main(String[] args) {
        String texto = "Essa é a mensagem com uma única interface funcional.";

        EnviarMensagem sms = msg -> System.out.println("Enviando via SMS: " + msg);
        EnviarMensagem email = msg -> System.out.println("Enviando via e-mail: " + msg);
        EnviarMensagem redesSociais = msg -> System.out.println("Enviando via Redes Sociais: " + msg);
        EnviarMensagem whatsapp = msg -> System.out.println("Enviando via Whatsapp: " + msg);

        sms.enviar(texto);
        email.enviar(texto);
        redesSociais.enviar(texto);
        whatsapp.enviar(texto);

    }
}
