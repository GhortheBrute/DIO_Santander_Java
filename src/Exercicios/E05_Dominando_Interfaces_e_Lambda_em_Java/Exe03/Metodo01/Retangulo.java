package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo01;

public class Retangulo implements CalcularArea{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
