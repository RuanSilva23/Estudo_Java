package AulaNaAlura.com.Avalieton.Principal;

import AulaNaAlura.com.Avalieton.Modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual filme você quer pesquisar: ");
        String filme = scanner.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + filme + "&apikey=7a9c54d5";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        Gson gson = new Gson();
        Titulo meutitulo = gson.fromJson(json, Titulo.class );
        System.out.println("Titulo: " + meutitulo.getNome());
        System.out.println("Ano de lançamento: " + meutitulo.getAnoDeLancamento());
    }
}
