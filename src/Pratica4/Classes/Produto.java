package Pratica4.Classes;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int idade) {
        this.preco = idade;
    }

    public void aplicarDesconto(double desconto) {
        preco = preco*(1-desconto);
    }
}
