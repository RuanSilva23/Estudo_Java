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

    public static int expressao2(int x, int y){
        if (x>y){
            int res =  (x - y)*2;
            return res;
        }else if (x<y){
            int res = (y - x)*x;
            return res;
        }else{
            return 1;
        }
    }

    public static int expressao3(int x, int y){
        int condicao;
        if (x>y){
            condicao = 1;
        } else if (x<y) {
            condicao = 2;
        }else {
             condicao = 3;
        }

        switch (condicao) {
            case 1: {
                return (x * x * x * x) + (x * x) - y;

            }
            case 2: {
                return (x * x) - x + y;

            }
            case 3: {
                return x + y - (x * x) + y * 2;
            }

            default:
                throw new IllegalCallerException("Condição Inesperada.");
        }
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

        int expre2 = expressao2(x, y);

        System.out.println("O valor da expressão 2 é igual a " + expre2);

        int resultado3 = expressao3(x, y);

        System.out.println("O resultado da expressão 3 é igual a " + resultado3);


        scanner.close();
    }
}
