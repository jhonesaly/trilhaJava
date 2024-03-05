package Pratica4;

import Pratica4.classes.ContaBancaria;
import Pratica4.classes.IdadePessoa;
import Pratica4.classes.Produto;


public class Principal {
    public static void main(String[] args) {
        //1
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setNumeroConta(1234);
        minhaConta.setSaldo(1000);
        minhaConta.titular = "Alyson";
        System.out.println("A conta " + minhaConta.getNumeroConta() + " Possui R$" + minhaConta.getSaldo());    
    
        //2
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Paulo");
        pessoa.setIdade(19);
        System.out.println(
            "O " 
            + pessoa.getNome() + 
            " Tem " 
            + pessoa.getIdade() + 
            " anos."
            );
    
        //3
        Produto produto = new Produto();
        produto.setNome("xbox");
        produto.setPreco(2000);
        System.out.println(produto.getPreco());
        produto.aplicarDesconto(0.1);
        System.out.println(produto.getPreco());
        produto.aplicarDesconto(0.1);
        System.out.println(produto.getPreco());
    }
}