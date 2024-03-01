package Pratica1;

public class Main {
    public static void main(String[] args) {
        /*
        1) Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        2) Declare uma variável do tipo double e uma variável do tipo int.
        2.1) Faça o casting da variável double para int e imprima o resultado.
        3) Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        3.1) Atribua valores a essas variáveis e concatene-as em uma mensagem.
        4) Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        4.1)Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        5) Declare uma variável do tipo double valorEmDolares.
        5.1) Atribua um valor em dólares a essa variável.
        5.2) Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        5.3) Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        6) Declare uma variável do tipo double precoOriginal.
        6.1) Atribua um valor em reais a essa variável, representando o preço original de um produto.
        6.2) Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        6.3) Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        */

        //1
        double valor1 = 10;
        double valor2 = 5;
        double resposta1 = (valor1 + valor2)/2;
        System.out.println("1) " + resposta1);

        //2
        double varDouble1;
        int varInt1;
        varDouble1 = 10.7;
        int resposta2 = (int) varDouble1;
        System.out.println("2) " + resposta2);

        //3
        char varChar1;
        String varString1;

        varChar1= 'a';
        varString1= "aly";

        String resposta3 = "A palavra " + varString1 + " começa com " + varChar1;
        System.out.println("3) " + resposta3);

        //4
        double precoProduto;
        int quantidade;

        precoProduto = 10.99;
        quantidade = 5;

        double resposta4 = precoProduto * quantidade;
        System.out.println("4) " + resposta4);

        //5
        double valorEmDolares;

        valorEmDolares = 799.2;

        double resposta5 = valorEmDolares * (4.94);
        System.out.println("5) " + resposta5);

        //6
        double precoOriginal;
        double percentualDesconto;

        precoOriginal = 5937.99;
        percentualDesconto = .3;

        double resposta6 = precoOriginal * (1-percentualDesconto);
        System.out.println("6) " + resposta6);
    }
}
