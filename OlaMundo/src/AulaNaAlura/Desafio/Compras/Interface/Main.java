package AulaNaAlura.Desafio.Compras.Interface;

import AulaNaAlura.Desafio.Compras.Lista.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;
        Produto produtos = new Produto();

        System.out.print("Qual é o limite do cartão: ");
        double limite = leitura.nextDouble();
        produtos.setLimiteDoCartao(limite);

        while (continuar) {
            System.out.print("Descrição do produto: ");
            String produto = leitura.nextLine();
            produtos.setNome(produto);
            leitura.nextLine();


            System.out.print("Valor do produto: R$");
            double valorDoProduto = leitura.nextDouble();
            produtos.setValor(valorDoProduto);

            List<Produto> list = null;
            if (valorDoProduto < limite) {
                produtos.limiteDoCartao(valorDoProduto);
                list = new ArrayList<>();
                list.add(produtos);
            } else {
                continuar = false;
                System.out.println("Valor insuficiente.");
                System.out.println(list);
            }
        }
    }
}
