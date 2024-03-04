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
        int numero1 = scanner.nextInt();
        if (numero1 > 0) {
            System.out.println("O número é positivo.");
        } else if (numero1 < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é nulo.");
        }

        //2:Peça ao usuário para inserir dois números inteiros. 
        //.1:Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.print("2) Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("2) Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O primeiro número é menor que o segundo.");
        }
    }
}
