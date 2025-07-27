package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe01;

public class Familia extends Ingresso {
    private int quantity;

    public Familia(double price, String movie, boolean dubbed, int quantity) {
        super(calculatePrice(price, quantity), movie, dubbed);
        this.quantity = quantity;
    }

    private static double calculatePrice (double price, int quantity){
        double total = price *  quantity;
        if (quantity >= 3) total *= 0.95;
        return total;
    }

    @Override
    public String toString() {
        return "Ingresso " + this.getClass().getSimpleName() +
                super.toString();
    }
}
