package TreinoCompleto;

import java.util.Scanner;

public class Calculadora {
    public static int soma(int x, int y){
        return x + y;
    }

    public static int subtracaosemneg(int x, int y){
        if (x>y){
            int subtracao = x - y;
            System.out.println("O resultado da subtração é igual a " + subtracao);
            return subtracao;
        }else{
            int subtracao = y-x;
            System.out.println("O resultado da subtração é igual a " + subtracao);
            return subtracao;
        }
    }

    public static int subtracao(int x, int y){
        return x - y;
    }

    public static int multiplicacao(int x, int y){
        return x * y;
    }

    public static double divisao(int x, int y){
        if (y==0){
            System.out.println("Operação Invalida........");
            return 0;
        }else {
            double divisao = (double) x / y;
            return divisao;
        }
    }

    public static int modulo(int x, int y){
        return (x+y)%2;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma das operações abaixo:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração sem números negativos");
            System.out.println("3 - Subtração com números negativos");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Divisão");
            System.out.println("6 - Modulo da soma dos números");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                continuar = false;

                System.out.println("Encerrando o programa. Obrigado por usar!");
                continue;
            } else if (opcao < 0 || opcao > 6) {
                System.out.println("Opção Invalida!!!!");
                System.out.println("Tente novamente...");
                continue;

            }

            System.out.print("Digite o 1° valor: ");
            int x = scanner.nextInt();
            System.out.print("Digite o 2° valor: ");
            int y = scanner.nextInt();

            switch (opcao){
                case 1: {
                    int resultadoSoma = soma(x, y);
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                }
                case 2:{
                    int resultadosubtracaosemneg = subtracaosemneg(x, y);
                    System.out.println("Resultado da subtração: " + resultadosubtracaosemneg);
                    break;
                }
                case 3:{
                    int resultadosubtracao = subtracao(x, y);
                    System.out.println("Resultado da subtração: " + resultadosubtracao);
                    break;
                }
                case 4:{
                    int resultadoMultiplicacao = multiplicacao(x, y);
                    System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
                    break;
                }
                case 5:{
                    double resultadoDivisao =  divisao(x, y);
                    System.out.println("Resultado da Divisão: " + resultadoDivisao);
                    break;
                }
                case 6:{
                    int resultadoModulo = modulo(x, y);
                    System.out.println("Resultado da Módulo: " + resultadoModulo);
                    break;
                }
                default:{
                    System.out.println("Algo fora do comum ocorreu!!!!");
                }
            }
        }
    }
}
