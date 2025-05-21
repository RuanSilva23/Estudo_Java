package AulaNaAlura;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu filme preferido? ");
        String filme;
        filme = scanner.nextLine();
        System.out.print("Quantas avaliações: ");
        int avaliacoes = scanner.nextInt();

        double media = 0;
        double soma = 0;
        for (int i = 1; i <= avaliacoes; i++) {
            System.out.print(i + "º avaliação do filme: ");
            double avaliacao = scanner.nextDouble();
            soma = soma + avaliacao;
            media = soma/avaliacoes;
        }

        int estrela = (int)(media/2);

        System.out.println("O filme favorito é o " + filme);
        System.out.println("A média de avaliação do filme foi de " + media);
        System.out.println("O qual deixou ele com " + estrela + " estrelas.");
    }
}
