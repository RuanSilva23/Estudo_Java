package AulaNaAlura.Aulas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Esse é o Pontueito.");
        System.out.println("Filme top Gun: Maverick.");
        boolean inclusoNoPlano = true;
        String plano;
        plano = "pro";

        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento: " + anoDeLancamento);

        if (anoDeLancamento >= 2022 && plano.equals("plus")){
            System.out.println("O filme é um lançamento nas telonas.");
        }else {
            System.out.println("O filme é um clássico.");
        }

        System.out.print("Qual é sua nota para esse filme: ");
        double nota1 = scanner.nextDouble();

        double media = (nota1 + 8.5 + 7.0)/3;

        System.out.println("A média desse filme: " + media);

        String sinopse;
        sinopse = """
                Filme Top Gun: Maverick
                Filme de aventura com muita ação e pilotagem arriscada com os caças americanos.
                Ano de lançamento:
                """;

        System.out.println(sinopse + anoDeLancamento);

        int classificacaoEstrela;
        classificacaoEstrela = (int) (media/2);

        System.out.println("Esse filme tem " + classificacaoEstrela + " Estrelas.");

        String [] filme = {"Top Gun", "Bad Boys", "Velozes e Furiosos"};

        System.out.println("Quais filmes você quer ver: " + Arrays.toString(filme));


    }
}
