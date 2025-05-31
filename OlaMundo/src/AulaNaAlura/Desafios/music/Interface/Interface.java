package AulaNaAlura.Desafios.music.Interface;

import AulaNaAlura.Desafios.music.Audios.Music;
import AulaNaAlura.Desafios.music.Audios.Podcast;
import AulaNaAlura.Desafios.music.Preferidas.MinhasPreferidas;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Podcast podcast = new Podcast();


        podcast.setNome("Experien");
        podcast.setAutor("Gustavo Guanabara");
        podcast.setTipoGenero("Tech");
        podcast.setDuracao(200);

        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 2000 ; i++) {
            podcast.curtir();
        }



        podcast.exibirInformacoesPodcast();

        System.out.println();
        System.out.println();

        Music musica = new Music();
        musica.setNome("Indios");
        musica.setAlbum("Foresta");
        musica.setCantor("Renato Russo");
        musica.setAnoDeLancamento(2000);
        musica.setDuracao(5);
        musica.setGenero("Rock");

        for (int i = 0; i < 1000000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 10000; i++) {
            musica.curtir();
        }

        musica.exibirInformacoesMusic();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclue(musica);
        preferidas.inclue(podcast);


    }
}
