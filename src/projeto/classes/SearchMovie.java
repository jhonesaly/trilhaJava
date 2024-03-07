package projeto.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.Scanner;

public class SearchMovie {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        // Ler a chave da API do arquivo .env
        String chave = readApiKeyFromEnv();

        if (chave == null || chave.isEmpty()) {
            System.out.println("Chave da API não encontrada no arquivo .env.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        String busca = scanner.nextLine();

        String url = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private static String readApiKeyFromEnv() {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(".env")) {
            properties.load(input);
            return properties.getProperty("OMDB_API_KEY");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo .env: " + e.getMessage());
            return null;
        }
    }
}
