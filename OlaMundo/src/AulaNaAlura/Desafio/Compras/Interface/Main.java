package AulaNaAlura.Desafio.Compras.Interface;

import AulaNaAlura.Desafio.Compras.Lista.CartaoDeCredito;
import AulaNaAlura.Desafio.Compras.Lista.Compras;
<<<<<<< HEAD
=======

import java.util.Collections;
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;
<<<<<<< HEAD


        System.out.print("Qual é o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        leitura.nextLine();


=======

        System.out.print("Qual é o limite do cartão: ");
        double limite = leitura.nextDouble();
        leitura.nextLine();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8


        int consulta;
        while (continuar) {
            leitura.nextLine();
            System.out.print("Descrição do produto: ");
            String produto = leitura.nextLine();


            System.out.print("Valor do produto: R$");
            double valorDoProduto = leitura.nextDouble();
            leitura.nextLine();

<<<<<<< HEAD
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
=======
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
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
                continuar = false;
            }


        }
<<<<<<< HEAD
        System.out.println("\n=================");
        System.out.println("Compras realizadas: \n");
        for (Compras c : cartao.getCompras() ){
            System.out.println(c.getNome() +" - "+ c.getValor() + " - " + c.getDividiu() + " vezes.");
        }
        System.out.println("\n====================");
        System.out.println("\n Saldo restante no cartão: " + cartao.getSaldo());
=======
        System.out.println("\n------------------------------");
        System.out.println("Compras realizadas: \n");
        Collections.sort(cartaoDeCredito.getCompras());
        for (Compras c : cartaoDeCredito.getCompras()){
            System.out.println(c.getNome() + "-" + c.getValor());
        }
        System.out.println("\n--------------------------------");
        System.out.println("\nSaldo restante do cartão: " + cartaoDeCredito.getSaldo());
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
    }
}
