package TreinoSimples;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static int fibonacci(int n){
        if (n==0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos: ");
        int n = scanner.nextInt();

        for (int i = 0; i <=n; i++){
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();

    }
}
