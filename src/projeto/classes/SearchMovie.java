package projeto.classes;

import java.io.IOException;
import java.net.http.HttpResponse;

public class SearchMovie extends Search {
    
    public static void main(String[] args) throws IOException, InterruptedException {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        // Ler a chave da API do arquivo .env
        String chave = readApiKeyFromEnv("OMDB_API_KEY");

        if (chave == null || chave.isEmpty()) {
            System.out.println("Chave da API não encontrada no arquivo .env.");
            return;
        }

        String busca = searchInput("filme");

        String url = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + chave;

        HttpResponse<String> response = APICommunication(url);

        System.out.println(response.body());
    }
}
