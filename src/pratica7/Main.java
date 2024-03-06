package pratica7;

import java.util.ArrayList;

import pratica7.classes.*;

public class Main {
    public static void main(String[] args) {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Paulo", 11));
        listaDePessoas.add(new Pessoa("Pedro", 22));
        listaDePessoas.add(new Pessoa("Polo", 33));

        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println(listaDePessoas.get(i));
        }
    }
}
