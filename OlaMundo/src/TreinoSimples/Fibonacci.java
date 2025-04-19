package TreinoSimples;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Quantos termos voê vai querer: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++){
            System.out.print(a + " " );
           int soma = a + b;
           a = b;
           b = soma;
        }

    }
}
