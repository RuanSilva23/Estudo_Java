package TreinoSimples;

public class CalculacaoDeDoisNumeros {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
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

        for (int i = 1; i<15; i++){
            System.out.println(i + "º");
            int somax = x + i;

            int multix = x * i;

            int somay = y + i;

            int multiy = y * i;

            System.out.println(x + " + "+ i + " = " + somax);
            System.out.println(y + " + "+ i + " = " + somay);
            System.out.println(x + " * "+ i + " = " + multix);
            System.out.println(y + " * "+ i + " = " + multiy);


        }





    }
}
