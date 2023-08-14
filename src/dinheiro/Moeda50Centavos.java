package dinheiro;

public class Moeda50Centavos implements Moedas {
    @Override
    public double enviaMoeda(double pagar) {
       return pagar = pagar-50;
    }
}
