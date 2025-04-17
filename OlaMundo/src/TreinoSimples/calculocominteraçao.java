package TreinoSimples;

import java.util.Scanner;

public class calculocominteraçao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int x = scanner.nextInt();
        System.out.print("Digite outro valor: ");
        int y = scanner.nextInt();

        int soma = x + y;
        int multi = x * y;
        int expressao = ((x + y)*2)/2;
        float expressao2 = ((y - x)*(y + x))/x*y ;

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Os resultados das expressões numéricas entre " + x + " e " + y + " são: ");
        System.out.println("");
        System.out.println("Soma: " + soma);



        if (x>y){
            int subt = x - y;
            System.out.println("Subtração: " + subt);
            int divisao = x/y;
            System.out.println("Divisão " + divisao);
        }else {
            int subt = y - x;
            System.out.println("Subtração: " + subt);
            int divisao = y/x;
            System.out.println("Divisão " + divisao);
        }

        System.out.println("Multiplicação: " + multi);
        System.out.println("1° Expressão: " + expressao);
        System.out.println("2° Expressão: " + expressao2);



        scanner.close();
    }
}
