package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo02;

public class Exe03 {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica quadrado = new Quadrado(5);
        FiguraGeometrica retangulo = new Retangulo(5, 10);
        System.out.println(circulo.calcularArea());
        System.out.println(quadrado.calcularArea());
        System.out.println(retangulo.calcularArea());
    }
}
