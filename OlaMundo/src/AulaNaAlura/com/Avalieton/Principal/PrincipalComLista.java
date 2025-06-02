package AulaNaAlura.com.Avalieton.Principal;

import AulaNaAlura.com.Avalieton.Modelos.Filme;
import AulaNaAlura.com.Avalieton.Modelos.Serie;
import AulaNaAlura.com.Avalieton.Modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = new Filme("Top Gun", 2022);
        filme.media(10);
        Filme outroFilme = new Filme("Velozes e Furiosos", 2012);
        outroFilme.media(9);
        Filme doRuan = new Filme("Avatar", 2014);
        /*for (int i = 0; i < 3; i++) {
            System.out.print("Nota para o filme("+doRuan.getNome() +"): ");
            int x = scanner.nextInt();
            doRuan.media(x);
        }*/

        Serie serie = new Serie("Loki", 2023);

        List<Titulo> lista = new LinkedList<>();

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

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Ruan");
        buscaPorArtistas.add("Alice");
        buscaPorArtistas.add("Maria Luisa");
        buscaPorArtistas.add(1, "Zoe");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);

        System.out.println(buscaPorArtistas);

        System.out.println("Listas ordenadas pelos titulos dos filmes e séries:");
        System.out.println("1 - Ordenação em ordem alfabetica");
        System.out.println("2 - Ordenação em ordem de lançamento");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                Collections.sort(lista);
                System.out.println(lista);
                break;

            case 2:
                lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
                System.out.println(lista);
                break;

            default:
                System.out.println("Erro.");
                break;
        }



    }
}
