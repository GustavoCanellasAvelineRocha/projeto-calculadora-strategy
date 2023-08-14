import dinheiro.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pagar pagar = new Pagar();
        String produto = "refrigerante";
        double valorAPagar = pagar.listaProdutos().getProdutos().get(produto);
        valorAPagar = valorAPagar*100;
        while (valorAPagar>0) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 1) {
                valorAPagar = pagar.pagar(new Moeda1Real(), valorAPagar);
                System.out.println(valorAPagar);
            } else if (numero == 2) {
                valorAPagar = pagar.pagar(new Moeda50Centavos(), valorAPagar);
                System.out.println(valorAPagar);
            } else if (numero == 3) {
                valorAPagar = pagar.pagar(new Moeda25Centavos(), valorAPagar);
                System.out.println(valorAPagar);
            } else if (numero == 4) {
                valorAPagar = pagar.pagar(new Moeda10Centavos(), valorAPagar);
                System.out.println(valorAPagar);
            } else if (numero == 5) {
                valorAPagar = pagar.pagar(new Moeda5Centavos(), valorAPagar);
                System.out.println(valorAPagar);
            }
        }

        System.out.println("Seu produto = " + produto);
        System.out.println("Seu troco = " + Math.abs(valorAPagar)/100D);

    }
}