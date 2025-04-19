package TreinoSimples;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciMemo {

    public static int fibonacci(int n, int[] memo){
        if (memo[n] != -1){
            return memo[n];
        }
        if (n==0 || n ==1) {
            return n;
        }else{
            memo[n] = fibonacci(n-1, memo)+fibonacci(n-2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos serão: ");
        int n = scanner.nextInt();

        int[] memo = new int[1+n];
        Arrays.fill(memo, -1);

        for (int i = 0; i <= n; i++){
            System.out.print(fibonacci(i, memo) + " ");
        }
    }
}
