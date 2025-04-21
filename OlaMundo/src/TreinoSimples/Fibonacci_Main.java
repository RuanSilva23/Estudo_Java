package TreinoSimples;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            System.out.println(" ");
            System.out.println("============ MENU ============");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Fibonacci Recursiva Simples");
            System.out.println("2 - Fibonacci Com Memoização");
            System.out.println("3 - Fibonacci Iterativa");
            System.out.println("0 - Sair");
            System.out.print("A opção escolhida foi: ");

            int opcao = scanner.nextInt();



            if (opcao == 0){
                continuar = false;
                System.out.println("Encerrando........");
                continue;
            } else if (opcao > 3 || opcao < 1) {
                System.out.println("Opção Invalida!! Tente novamente...");
                continue;
            }

            System.out.print("Quantos termos: ");
            int n = scanner.nextInt();

            System.out.println(" ");

            if (n < 0){
                System.out.println("Número inválido. Digite um valor maior ou igual a 0.");
                continue;
            }

            switch (opcao){
                case 1:{
                    for (int i = 0; i <= n; i++){
                        System.out.print(FibonacciUtils2.calculoRecursaoSimples(i) + " ");
                    }
                    break;
                }

                case 2:{
                    int[] memo = new int[n+1];
                    Arrays.fill(memo, -1);
                    for (int i = 0; i <= n; i++){
                        System.out.print(FibonacciUtils2.calculoComMemo(i, memo) + " ");
                    }

                    break;

                }

                case 3:{
                    for (int i = 0; i <= n; i++){
                        System.out.print(FibonacciUtils2.calculoInterativo(i) + " ");
                    }

                    break;

                }

            }
            System.out.println(" ");
        }

        scanner.close();
}
}
