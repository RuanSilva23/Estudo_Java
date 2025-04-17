package TreinoCompleto;

import java.util.Scanner;

public class FuncoesSimples {
    public static int soma(int x, int y){
        return x + y;
    }

    public static int expressao(int x, int y){
        int expressao = x*x+x-y;
        return expressao;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1° valor: ");
        int x = scanner.nextInt();
        System.out.print("Digite o 2° valor: ");
        int y = scanner.nextInt();

        int res = soma(x, y);

        System.out.println("O resultado da soma entre o "+ x + " + " + y + " = " + res);

        int expre = expressao(x, y);

        System.out.println("O valor da expressão é igual a "+ expre);

    }
}
