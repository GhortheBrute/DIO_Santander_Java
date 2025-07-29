package Exercicios.E05_Dominando_Interfaces_e_Lambda_em_Java.Exe03.Metodo01;
/*
Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter um métod o que retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:

Quadrado: possui o valor dos seus lados;
Retângulo: possui os valores de base e altura;
Circulor: possui o atributo raio.
 */
public class Exe03 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
         Quadrado quadrado = new Quadrado(10);
         Retangulo retangulo = new Retangulo(10, 20);

        System.out.println(circulo.calcularArea());
        System.out.println(quadrado.calcularArea());
        System.out.println(retangulo.calcularArea());
    }
}
