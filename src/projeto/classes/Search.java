package projeto.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.Scanner;

public class Search {

    public static String searchInput(String searchType) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do " + searchType + ": ");
        String busca = scanner.nextLine();
        return busca;
    }

    public static String readApiKeyFromEnv(String API_KEY_NAME) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(".env")) {
            properties.load(input);
            return properties.getProperty(API_KEY_NAME);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo .env: " + e.getMessage());
            return null;
        }
    }
    

    public static HttpResponse<String> APICommunication(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }
}
