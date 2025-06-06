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
            }else if (opcao>6 || opcao<0){
                System.out.println("Opção Invalida... Tente Novamente!!!");
                continue;
            }


            int x = escolhaNumeros1(scanner);


            int y = escolhaNumero2(scanner);

            NomesOperadores operacao = NomesOperadores.fromCodigo(opcao);

            OperacaoMatematica operador;

            switch (operacao){
                case SOMA:{
                    operador = new Soma();
                    break;
                }
                case SUBTRACAO:{
                    operador = new Subtracao();
                    break;
                }
                case MULTIPLICACAO:{
                    operador = new Multiplicacao();
                    break;
                }
                case DIVISAO:{
                    operador = new Divisao();
                    break;
                }
                case MODULO:{
                    operador = new Modulo();
                    break;
                }

                case POTENCIACAO:{
                    operador = new Potenciacao();
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
        System.out.println("6 - Potenciação");
        System.out.println("0 - Sair");
        System.out.print("Digite uma opção: ");

        return scanner.nextInt();

    }

    public static int escolhaNumeros1(Scanner scanner){
        System.out.print("Digite o 1° valor: ");

        return  scanner.nextInt();
    }

    public static int escolhaNumero2(Scanner scanner) {
        System.out.print("Digite o 2° valor: ");

        return  scanner.nextInt();
    }
}
