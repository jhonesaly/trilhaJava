package Pratica2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        //1: Crie um programa que solicite ao usuário digitar um número. 
        //.1: Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo"

        System.out.print("1) Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é nulo.");
        }


    }
}
