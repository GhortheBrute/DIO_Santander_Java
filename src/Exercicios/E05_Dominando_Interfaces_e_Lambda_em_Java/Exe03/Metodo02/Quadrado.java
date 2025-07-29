package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo02;

public class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
