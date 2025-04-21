package TreinoSimples;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++){
            System.out.print(FibonacciUtils.CalculocomMemo(i)+ " ");
        }
        scanner.close();
    }
}
