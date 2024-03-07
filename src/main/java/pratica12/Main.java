package pratica12;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o valor do numerador: ");
            int numerador = scanner.nextInt();
            System.out.println("Digite o valor do denominador: ");
            int denominador = scanner.nextInt();

            double resultado = numerador/denominador;
            System.out.println("Resultado é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Denominador não pode ser zero.");
        } catch (InputMismatchException e) {
            System.out.println("Por favor, adicione somente números.");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }
}
