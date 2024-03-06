package projeto;

import java.util.Scanner;

import projeto.classes.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static User usuario = new User("Alyson Jhones", 100.00);
    

    public static void main(String[] args) {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        int opcao;

        while (true) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarTransferencia();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("**********************");
        System.out.println("*** Menu Principal ***");
        System.out.println("**********************");
        System.out.println("Saudações, " + usuario.getNome() + ".\n");
        System.out.println("Menu:");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Realizar Depósito");
        System.out.println("3. Realizar Transferência");
        System.out.println("4. Sair");
        System.out.println("*********************");
        System.out.print("Digite a opção desejada: ");
    }

    private static void consultarSaldo() {
        System.out.println("Saldo: R$" + usuario.getSaldo() + "\n");
    }

    private static void realizarDeposito() {
        System.out.print("Digite o valor do depósito: ");
        double valor = scanner.nextDouble();
        usuario.setSaldo(usuario.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Novo saldo: R$" + usuario.getSaldo() + "\n");
    }

    private static void realizarTransferencia() {
        System.out.print("Digite o valor da transferência: ");
        double valor = scanner.nextDouble();
        if (valor < usuario.getSaldo()) {
            usuario.setSaldo(usuario.getSaldo() - valor);
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Novo saldo: R$" + usuario.getSaldo() + "\n");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }
}