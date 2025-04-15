package TreinoSimples;

public class CalculacaoDeDoisNumeros {
    public static void main(String[] args){
        int x = 15;
        int y = 11;
        int soma = x + y;

        if (x>y){
            int subtracao = x- y;
            System.out.println("x - y = " + subtracao);
            int multi = x * y;
            System.out.println("x * y = " + multi );
        }else{
            int subtracao = y - x;
            System.out.println("y - x = " + subtracao);
            int multi = y * x;
            System.out.println("y * x = " + multi );
        }


    }
}
