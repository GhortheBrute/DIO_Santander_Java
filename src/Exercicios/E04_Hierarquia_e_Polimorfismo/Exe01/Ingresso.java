package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe01;

public class Ingresso {
    private double price;
    private String movie;
    private boolean dubbed;

    public Ingresso(double price, String movie, boolean dubbed) {
        this.price = price;
        this.movie = movie;
        this.dubbed = dubbed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public boolean isDubbed() {
        return dubbed;
    }

    public void setDubbed(boolean dubbed) {
        this.dubbed = dubbed;
    }

    @Override
    public String toString() {
        return ", para o filme '" + movie + '\'' +
                ", dublagem: " + dubbed +
                ", preço total = R$ " + price +
                '.';
    }
}
