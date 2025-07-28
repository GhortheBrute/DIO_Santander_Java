package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe01.Metodo01;
/*
Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes, esses serviços devem ter um métod o para receber a mensagem como parâmetro, os serviços que devem estar disponíveis são:

SMS;
E-mail;
Redes Sociais;
WhatsApp;
 */
public class Exe01 {
    public static void main(String[] args) {
        Mensagem aviso1 = new Mensagem();
        aviso1.enviarMensagem("Essa é a mensagem.");
    }

}
