package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo01;

public class Circulo implements CalcularArea{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
}
