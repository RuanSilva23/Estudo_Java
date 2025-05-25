package AulaNaAlura.com.Avalieton;

import AulaNaAlura.com.Avalieton.Modelos.Filme;
import AulaNaAlura.com.Avalieton.Modelos.Musica;
import AulaNaAlura.com.Avalieton.Modelos.Serie;
import AulaNaAlura.com.Avalieton.com.Avalieton.Calculation;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme meufilme = new Filme();
        meufilme.setNome("Avatar");
        meufilme.setDuracaoEmMinutos(200);

        meufilme.setDuracaoEmMinutos(200);

        /*System.out.print("Nome do filme: ");
        String nome = scanner.nextLine();

        System.out.print("Ano de lançamento: ");
        int ano = scanner.nextInt();

        meufilme.setNome(nome);

        if (ano > 2025){
            System.out.println("não temos em catalógo.");
            System.out.println("Este filme não foi lançado ainda na plataforma. ");
        }else{
            meufilme.setAnoDeLancamento(ano);
            meufilme.exibirNome();

            meufilme.media(10);
            meufilme.media(8);
            meufilme.media(6);

            System.out.println("A média do filme: " + meufilme.mediaAvalia());
        }*/

        Serie loki = new Serie();
        loki.setNome("Loki");
        loki.setAnoDeLancamento(2023);
        loki.setTemporadas(2);
        loki.setEpisodiosPorTemporada(6);
        loki.setDuracaoPorEpisodio(50);
        System.out.println("Duração da série em mitutos é " + loki.getDuracaoEmMinutos());
        /*loki.exibirNome();

        Musica rock = new Musica();
        rock.setNome("Faroeste a Cabloco.");
        rock.setNome("Renato Russo");
        rock.setTempoDaMusica(9);

        rock.exibirNome();*/

        Calculation calculadora = new Calculation();
        calculadora.inclui(meufilme);
        Filme outrofilme = new Filme();
        outrofilme.setNome("Top Gun");
        outrofilme.setDuracaoEmMinutos(150);
        calculadora.inclui(outrofilme);
        System.out.println(calculadora.getTempoTotal());




    }
}
