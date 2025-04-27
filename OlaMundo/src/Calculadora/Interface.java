package Calculadora;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            int opcao = exibirMenu(scanner);

            if (opcao == 0){
                continuar = false;
                System.out.println("Obrigado por usar");
                System.out.println("Encerrando......");
                continue;
            }else if (opcao>5 || opcao<0){
                System.out.println("Opção Invalida... Tente Novamente!!!");
                continue;
            }

            System.out.print("Digite o 1° valor: ");
            int x = scanner.nextInt();

            System.out.print("Digite o 2° valor: ");
            int y = scanner.nextInt();

            OperacaoMatematica operador;

            switch (opcao){
                case 1:{
                    operador = new Soma();
                    break;
                }
                case 2:{
                    operador = new Subtracao();
                    break;
                }
                case 3:{
                    operador = new Multiplicacao();
                    break;
                }
                case 4:{
                    operador = new Divisao();
                    break;
                }
                case 5:{
                    operador = new Modulo();
                    break;
                }
                default:{
                    System.out.println("Opção invalida!");
                    continue;
                }
            }
            double resultado = operador.executar(x, y);
            System.out.println("O resultado é igual a " + resultado);
        }
        scanner.close();
    }

    public static int exibirMenu(Scanner scanner){
        System.out.println("\nEscolha uma das operações abaixo:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Modulo da soma dos números");
        System.out.println("0 - Sair");
        System.out.print("Digite uma opção: ");

        return scanner.nextInt();

    }
}
