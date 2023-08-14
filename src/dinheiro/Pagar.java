package dinheiro;

public class Pagar {
    private ListaProdutos listaProdutos;
    public Pagar() {
        this.listaProdutos = new ListaProdutos();
    }

    public double pagar(Moedas paymentMethod,double valor){
        return paymentMethod.enviaMoeda(valor);
    }

    public ListaProdutos listaProdutos(){
        return this.listaProdutos;
    }
}
