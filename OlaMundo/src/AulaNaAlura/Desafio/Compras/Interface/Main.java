package AulaNaAlura.Desafio.Compras.Interface;

import AulaNaAlura.Desafio.Compras.Lista.CartaoDeCredito;
import AulaNaAlura.Desafio.Compras.Lista.Compras;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;

        System.out.print("Qual é o limite do cartão: ");
        double limite = leitura.nextDouble();
        leitura.nextLine();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);


        int consulta;
        while (continuar) {
            System.out.print("Descrição do produto: ");
            String produto = leitura.nextLine();


            System.out.print("Valor do produto: R$");
            double valorDoProduto = leitura.nextDouble();
            leitura.nextLine();

            Compras compras = new Compras(produto, valorDoProduto);
            boolean compraRealizada = cartaoDeCredito.lancamento(compras);

            if (compraRealizada){
                System.out.println("Compra realizada com sucesso.");
                System.out.print("Quer continuar S(1) or N(0)");
                consulta = leitura.nextInt();
                if (consulta==0){
                    continuar = false;
                }
            }else {
                System.out.println("Limite insuficiente.");
                continuar = false;
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("Compras realizadas: \n");
        Collections.sort(cartaoDeCredito.getCompras());
        for (Compras c : cartaoDeCredito.getCompras()){
            System.out.println(c.getNome() + "-" + c.getValor());
        }
        System.out.println("\n--------------------------------");
        System.out.println("\nSaldo restante do cartão: " + cartaoDeCredito.getSaldo());
    }
}
