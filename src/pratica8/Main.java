package pratica8;

import java.util.ArrayList;
import pratica8.classes.*;

public class Main {
    public static void main(String[] args) {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }
        
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoPerecivel("abacate", 1.00, 11, "1/1"));
        produtos.add(new ProdutoPerecivel("banana", 2.00, 22, "2/2"));
        produtos.add(new ProdutoPerecivel("caqui", 3.00, 33, "3/3"));

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        

    }
}
