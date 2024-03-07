package pratica11;

import com.google.gson.Gson;

record Pessoa(String nome, int idade, String cidade) {}

public class Main {
    public static void main(String[] args) {
        Gson gson  = new Gson();

        String json = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Pessoa pessoaDesserializada = gson.fromJson(json, Pessoa.class);
        System.out.println("JSON para objeto: " + pessoaDesserializada);
    }
}
