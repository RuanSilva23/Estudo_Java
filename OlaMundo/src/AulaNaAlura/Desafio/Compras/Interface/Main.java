package AulaNaAlura.Desafio.Compras.Interface;

import AulaNaAlura.Desafio.Compras.Lista.CartaoDeCredito;
import AulaNaAlura.Desafio.Compras.Lista.Compras;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;


        System.out.print("Qual é o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        leitura.nextLine();



        while (continuar) {
            leitura.nextLine();
            System.out.print("Descrição do produto: ");
            String produto = leitura.nextLine();


            System.out.print("Valor do produto: R$");
            double valorDoProduto = leitura.nextDouble();
            leitura.nextLine();

            System.out.print("Esse valor foi dividido em quantas parcelas: ");
            int vezesDivididas = leitura.nextInt();
            Compras compras = new Compras(produto, valorDoProduto, vezesDivididas);

            boolean comprasRealizadas = cartao.lancamento(compras);

            if (comprasRealizadas){
                System.out.println("Compra Realizada com sucesso.");
                System.out.println("Quer continuar: S(1) ou N(0)");
                int continuarSouN = leitura.nextInt();

                if (continuarSouN == 0){
                    continuar = false;
                }

            }else {
                System.out.println("Limite insuficiente para essa compra.");
                continuar = false;
            }


        }
        System.out.println("\n=================");
        System.out.println("Compras realizadas: \n");
        for (Compras c : cartao.getCompras() ){
            System.out.println(c.getNome() +" - "+ c.getValor() + " - " + c.getDividiu() + " vezes.");
        }
        System.out.println("\n====================");
        System.out.println("\n Saldo restante no cartão: " + cartao.getSaldo());
    }
}
