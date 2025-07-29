package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo04;

public class Exe03 {
    public static void main(String[] args) {
        EstrategiaCalculo circulo = new CalculoCirculo();
        EstrategiaCalculo quadrado = new CalculoQuadrado();
        EstrategiaCalculo retangulo = new CalculoRetangulo();

        System.out.println(circulo.calcular(5));
        System.out.println(quadrado.calcular(5));
        System.out.println(retangulo.calcular(5, 10));
    }
}
