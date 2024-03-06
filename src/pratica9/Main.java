package pratica9;

import java.util.ArrayList;
import pratica9.classes.*;

public class Main {
    public static void main(String[] args) {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        AnimalCachorro animal = new AnimalCachorro();
        
        if (animal instanceof AnimalCachorro) {
            Animal dog = (Animal) animal;
            System.out.println(dog);
        } else {
            System.out.println("Error");
        }
    
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Panela", 5.00));
        listaProdutos.add(new Produto("Prato", 10.00));
        listaProdutos.add(new Produto("Peneira", 15.00));

        double totalValores = 0;

        for (Produto i: listaProdutos) {
            totalValores += i.getPreco();
        }
        System.out.println(totalValores/listaProdutos.size());

    }
}
