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
        int numero1;
        int numero2;
        double numero3;

        //1: Crie um programa que solicite ao usuário digitar um número. 
        //.1: Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo"

        System.out.print("1) Digite um número: ");
        numero1 = scanner.nextInt();
        if (numero1 > 0) {
            System.out.println("O número é positivo.");
        } else if (numero1 < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é nulo.");
        }

        //2:Peça ao usuário para inserir dois números inteiros. 
        //.1:Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.print("\n2) Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("2) Digite o segundo número: ");
        numero2 = scanner.nextInt();
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O primeiro número é menor que o segundo.");
        }

        /*Crie um menu que oferece duas opções ao usuário: 
        "1. Calcular área do quadrado" e "2. Calcular área do círculo". 
        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */
        System.out.print("\n3) Digite um número: ");
        numero1 = scanner.nextInt();
        System.out.print("3) Escolha uma das opções:\n[1] Calcular área do quadrado\n[2] Calcular área do círculo\n");
        numero2 = scanner.nextInt();
        if (numero2 == 1) {
            numero3 = numero1*numero1;
        } else {
            numero3 = Math.PI*numero1*numero1;
        }
        System.out.printf("A área calculada é: %f\n", numero3);

        /*4) Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/
        System.out.print("\n4) Digite um número: ");
        numero1 = scanner.nextInt();
        System.out.println("Sua tabuada é: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * numero1);    
        }

        /*5) Crie um programa que solicite ao usuário a entrada de um número inteiro. 
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
         */
        System.out.print("\n5) Digite um número: ");
        numero1 = scanner.nextInt();
        if (numero1%2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
