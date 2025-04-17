package TreinoCompleto;

import java.util.Scanner;

public class Consulta {
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

            if (opcao == 0){
                continuar = false;

                System.out.println("Encerrando o programa. Obrigado por usar!");
                continue;
            } else if (opcao<0 || opcao > 6) {
                System.out.println("Opção Invalida!!!!");
                System.out.println("Tente novamente...");
                continue;

            }

            System.out.print("Digite o 1° valor: ");
            int x = scanner.nextInt();
            System.out.print("Digite o 2° valor: ");
            int y = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    int soma = x + y;
                    System.out.println("O resultado da soma é igual a " + soma);
                    break;
                }
                case 2: {
                    if (x>y){
                        int subtracao = x - y;
                        System.out.println("O resultado da subtração é igual a " + subtracao);
                    }else{
                        int subtracao = y-x;
                        System.out.println("O resultado da subtração é igual a " + subtracao);
                    }

                    break;
                }
                case 3:{
                    int subtracao = x - y;
                    System.out.println("O resultado da subtração é igual a " + subtracao);
                    break;
                }

                case 4: {
                    int multiplicacao = x * y;
                    System.out.println("O resultado da multiplicação é igual a " + multiplicacao);
                    break;
                }
                case 5: {
                    if (y==0){
                        System.out.println("Operação Invalida........");
                    }else {
                        double divisao = (double) x / y;
                        System.out.println("O resultado da divisão é igual a " + divisao);
                    }
                    break;
                }
                case 6:{
                    int modulo = (x + y)%2;
                    System.out.println("O resultado do módulo é igual a " + modulo);
                    break;
                }
                default: {
                    System.out.println("Algo fora do comum ocorreu!");
                }
            }

        }
        scanner.close();

    }
}

