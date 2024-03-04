package Pratica3;

public class Main {
    public static void main (String[] args) {

        // Limpa terminal:
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }

        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        Calculadora calculadora = new Calculadora();
        int numero = calculadora.calcularDobro(9);
        System.out.println(numero);

        Musica musica = new Musica();
        musica.titulo = "Fear of the dark";
        musica.artista = "Iron Maiden";
        musica.anoLancamento = 1992;
        musica.avaliar(9);
        musica.avaliar(8);
        musica.avaliar(10);
        musica.exibirFicha();
        double nota = musica.calcularMedia();
        System.out.println(nota);

        Carro carro = new Carro();
        carro.modelo = "corolla";
        carro.ano = 2003;
        carro.cor = "vinho";
        carro.exibirFicha();
        int idadeCarro = carro.calcularIdade(2023);
        System.out.println(idadeCarro);


    }
}
