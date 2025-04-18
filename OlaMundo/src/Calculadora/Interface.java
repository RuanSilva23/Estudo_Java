package Calculadora;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            System.out.println("\nEscolha uma das operações abaixo:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Modulo da soma dos números");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 0){
                continuar = false;
                System.out.println("Obrigado por usar");
                System.out.println("Encerrando......");
                continue;
            }else if (opcao>5 || opcao<0){
                System.out.println("Opção Invalida... Tente Novamente!!!");
            }
        }
    }
}
