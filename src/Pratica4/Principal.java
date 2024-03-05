package Pratica4;

import Pratica4.Classes.ContaBancaria;
import Pratica4.Classes.IdadePessoa;

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
    
    }
}