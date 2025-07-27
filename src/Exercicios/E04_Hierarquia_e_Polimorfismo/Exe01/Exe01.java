package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe01;
/*
Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter um valor, nome do filme e informar se &eacute; dublado ou legendado. A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso fam&iacute;lia. Cada ingresso deve ter um m&eacute;t odo que retorna o seu valor real ( baseado no valor informado na cria&ccedil;&atilde;o do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos fam&iacute;lia deve-se retornar o valor multiplicado pelo n&uacute;mero de pessoas e fornecer um desconto de 5% quando o n&uacute;mero de pessoas for maior que 3.
 */
public class Exe01 {
    public static void main(String[] args) {
        MeiaEntrada meia = new MeiaEntrada(10,"Jumanji", true);
        Familia familia = new Familia(10, "Jumanji", true, 5);
        Familia adultos = new Familia(10, "Jumanji", true, 2);

        System.out.println(meia);
        System.out.println(familia);
        System.out.println(adultos);
    }
}
