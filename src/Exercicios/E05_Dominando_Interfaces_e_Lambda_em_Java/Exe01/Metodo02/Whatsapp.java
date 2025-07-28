package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe01.Metodo02;

public class Whatsapp implements EnviarMensagem{
    @Override
    public void enviar(String mensagem){
        System.out.println("Whatsapp: " + mensagem);
    }
}
