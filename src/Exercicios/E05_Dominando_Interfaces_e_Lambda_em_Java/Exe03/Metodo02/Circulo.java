package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo02;

public class Circulo extends FiguraGeometrica {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
