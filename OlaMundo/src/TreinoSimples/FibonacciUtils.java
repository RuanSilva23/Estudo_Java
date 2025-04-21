package TreinoSimples;


import java.util.Arrays;

public class FibonacciUtils {
    public static int CalculocomMemo(int n){
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return calculoMemoRec(n, memo);
    }

    private static int calculoMemoRec(int n, int[] memo){
        if (memo[n] != -1){
            return memo[n];
        }
        if (n == 0 || n == 1){
            return n;
        }
        memo[n] = calculoMemoRec(n - 1, memo) + calculoMemoRec(n - 2, memo);
        return memo[n];
    }
}
