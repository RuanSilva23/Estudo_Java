package AulaNaAlura.com.Avalieton.Principal;

import AulaNaAlura.com.Avalieton.Modelos.Filme;
import AulaNaAlura.com.Avalieton.Modelos.Serie;
import AulaNaAlura.com.Avalieton.Modelos.Titulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = new Filme("Top Gun", 2022);
        filme.media(10);
        Filme outroFilme = new Filme("Velozes e Furiosos", 2012);
        outroFilme.media(9);
        Filme doRuan = new Filme("Avatar", 2014);
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota para o filme("+doRuan.getNome() +"): ");
            int x = scanner.nextInt();
            doRuan.media(x);
        }

        Serie serie = new Serie("Loki", 2023);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(doRuan);
        lista.add(serie);

        for (Titulo titulos: lista){
            System.out.println(titulos);
            if (titulos instanceof Filme filme1 && filme1.getClassificacao() > 2){
                System.out.println("Classificação: " + filme1.getClassificacao() );
            }
        }
    }
}
