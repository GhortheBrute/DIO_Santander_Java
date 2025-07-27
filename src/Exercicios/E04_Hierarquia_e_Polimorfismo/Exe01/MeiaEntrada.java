package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe01;

public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(double price, String movie, boolean dubbed) {
        super(price/2, movie, dubbed);
    }

    @Override
    public String toString() {
        return "Ingresso " + this.getClass().getSimpleName() +
                super.toString();
    }
}
