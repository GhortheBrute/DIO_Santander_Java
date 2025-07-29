package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo01;

public class Quadrado implements CalcularArea{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
