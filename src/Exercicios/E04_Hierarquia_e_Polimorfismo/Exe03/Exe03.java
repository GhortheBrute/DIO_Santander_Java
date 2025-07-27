package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe03;
/*Escrever uma hierarquia de classes para criação de relógios para diferentes lugares do mundo, defina uma classe pai que tenha as propriedades Hora, minuto e segundo com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio) e um métod o que deverá retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada relógio Americando e outra chamada relógio Brasileiro, lembrando que para o relógio americano não existem as horas de 13 até 24. Defina também na super classe um métod o que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto, esse métod o deve receber um relógio ( independente da implementação) e deve-se extrair as informações dele e usa-la no objeto que recebeu para setar as novas informações do relógio.
 */
public class Exe03 {
    public static void main(String[] args) {
        AmericanaOeste americanaOeste = new AmericanaOeste(8,35,05);
        BrasileiraSP brasileiraSP = new BrasileiraSP(8,35,05);

        System.out.println(americanaOeste);
        System.out.println(brasileiraSP);

    }
}
