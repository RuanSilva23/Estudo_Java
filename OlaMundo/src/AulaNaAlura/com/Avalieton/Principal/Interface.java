package AulaNaAlura.com.Avalieton.Principal;

import AulaNaAlura.com.Avalieton.Modelos.Episodios;
import AulaNaAlura.com.Avalieton.Modelos.Filme;
import AulaNaAlura.com.Avalieton.Modelos.Serie;
import AulaNaAlura.com.Avalieton.com.calculo.Calculation;
import AulaNaAlura.com.Avalieton.com.calculo.Recomendacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme meufilme = new Filme("Avatar", 2014);


        meufilme.setDuracaoEmMinutos(200);

        meufilme.mediaAvalia();
        meufilme.media(10);
        meufilme.media(8);
        System.out.println(meufilme.mediaAvalia());

        Filme filmeDoRuan = new Filme("Velozes e Furiosos", 2010);

        Serie loki = new Serie("Loki", 2023);

        loki.setTemporadas(2);
        loki.setEpisodiosPorTemporada(6);
        loki.setDuracaoPorEpisodio(50);
        System.out.println("Duração da série em mitutos é " + loki.getDuracaoEmMinutos());


        Calculation calculadora = new Calculation();
        calculadora.inclui(meufilme);

        Filme filme = new Filme("Top Gun", 2022);
        calculadora.inclui(filme);
        filme.getDuracaoEmMinutos();
        System.out.println(calculadora.getTempoTotal());

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(meufilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setNome("Loki");
        episodios.setTotalDeVisualizcoes(1000);
        recomendacao.filtra(episodios);

        Filme outroFilme = new Filme("Vingadores", 2012);


        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(meufilme);
        filmes.add(outroFilme);
        filmes.add(filmeDoRuan);
        filmes.add(filme);
        System.out.println("O primeiro filme da lista: " + filmes.get(0).getNome());
        System.out.println("O tamanho da lista: " + filmes.size());

        System.out.println(filmes);

        for (int i = 0; i < filmes.toArray().length ; i++) {
            System.out.println("O " + i + "º filme: " + filmes.get(i).getNome());

        }

        System.out.println(filmes.get(1).toString());




    }
}
