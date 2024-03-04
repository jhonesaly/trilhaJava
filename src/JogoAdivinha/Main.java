package JogoAdivinha;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        int NUMERO = new Random().nextInt(100);
        int chute;
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        while (contador < 5) {

            System.out.print("Digite um chute: ");
            chute = scanner.nextInt();

            if (chute == NUMERO) {
                System.out.printf("Você acertou! O número era %d.", NUMERO);
                break;
            } else {
                System.out.println("Errou!");
                contador++;
                if (contador < 5) {
                    if (chute < NUMERO) {
                        System.out.println("O número é maior que seu chute.");
                    } else {
                        System.out.println("O número é menor que seu chute.");
                    }
                    System.out.printf("O contador está em: %d\n\n", contador);
                } else {
                    System.out.printf("O jogo acabou. O número era: %d", NUMERO);
                }
                
            }
        }
        scanner.close();
    }
}