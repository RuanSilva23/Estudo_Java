package TreinoSimples;

public class FibonacciUtils2 {
    public static int calculoRecursaoSimples(int n){
        if (n == 0 || n == 1){
            return n;
        }else{
            return calculoRecursaoSimples(n - 1 ) + calculoRecursaoSimples(n - 2);
        }
    }

    public static int calculoComMemo(int n, int[] memo){
        if (memo[n] != -1){
            return memo[n];
        }
        if (n == 0 || n == 1){
            return n;
        } else{
            memo[n] = calculoComMemo(n -1, memo) + calculoComMemo(n - 2, memo);
        }
        return memo[n];
    }

    public static int calculoInterativo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int soma = a + b;
            a = b;
            b = soma;
        }
        return b;

    }
}
