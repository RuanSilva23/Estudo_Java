package funcoes;

import java.util.Scanner;

public class funcoes_procedimentos {
    public static int soma(int x, int y){
        return x + y;
    }
    public static int subtracao(int x, int y){
        return x - y;
    }

    public static int multiplicacao(int x, int y){
        return x * y;
    }

    public static int express(int x, int y){
        return ((x + y)/2)*5;
    }

    public void trocarvalor(int x){
        x = 10;
        System.out.println(x);
    }

    public static void imprime(String mensagem){
        System.out.println(mensagem);
    }

    public static void imprimele(){
        System.out.println("Olá, mundo!");
    }

    //A função de soma e subtrair:

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual valor para x: ");
        int a = scanner.nextInt();
        System.out.print("Qual valor para y; ");
        int b = scanner.nextInt();

        int resultsoma = soma(a, b);
        System.out.println("O resultado da soma é " + resultsoma);

        int resultsub = subtracao(a, b);
        System.out.println("O resultado da subtração é " + resultsub);

        int resultmulti = multiplicacao(a, b);
        System.out.println("O resultado da multiplicação é " + resultmulti);

        int resultexpress = express(a, b);
        System.out.println("O resultado da expressão é " + resultexpress);


        imprime("Olá, Mundo! Meu nome é Ruan Silva, sou aluno de ADS no Descomplca ");

        int x = 15;
        System.out.println(x);

        imprimele();

    }
    
}
