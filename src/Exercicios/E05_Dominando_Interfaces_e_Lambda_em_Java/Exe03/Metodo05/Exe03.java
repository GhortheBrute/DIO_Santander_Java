package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo05;

public class Exe03 {
    public static void main(String[] args) {
        CalcularArea quadrado = () -> Math.pow(10,2);
        CalcularArea circulo = () -> Math.PI * Math.pow(10,2);
        CalcularArea retangulo = () -> 10 * 20;


        System.out.println(quadrado.calcularArea());
        System.out.println(circulo.calcularArea());
        System.out.println(retangulo.calcularArea());
    }
}
