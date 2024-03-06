package pratica10;

import pratica10.classes.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        
        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(20);
        listaNumeros.add(10);
        listaNumeros.add(40);
        listaNumeros.add(30);
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("Matrix"));
        listaTitulos.add(new Titulo("Avatar"));
        listaTitulos.add(new Titulo("Zorro"));
        listaTitulos.add(new Titulo("Batman"));
        
        Collections.sort(listaTitulos);
        for (Titulo i:listaTitulos) {
            System.out.println(i.getNome());
        }


    }
}
