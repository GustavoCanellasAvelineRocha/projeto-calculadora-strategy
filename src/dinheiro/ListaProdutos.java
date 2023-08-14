package dinheiro;

import java.util.HashMap;
import java.util.Map;

public class ListaProdutos {
    private Map<String, Double> produtos;
    public ListaProdutos() {
        Map<String, Double> produtos = new HashMap<>();

        produtos.put("refrigerante", 1.00);
        produtos.put("chips", 2.50);
        produtos.put("doritos", 6D);
        produtos.put("trento", 1.00);

        this.produtos = produtos;
    }

    public Map<String, Double>  getProdutos(){
        return this.produtos;
    }


}
