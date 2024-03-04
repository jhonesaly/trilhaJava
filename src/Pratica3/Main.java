package Pratica3;

public class Main {
    public static void main (String[] args) {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        

    }
}
