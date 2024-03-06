package projeto.classes;

public class User {

    //private int id;
    //private String senha;
    private String nome;
    private double saldo;

    public User(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // public void registerUser(String nomeCompleto, int cpf, String senha) {
    //     this.nome = nomeCompleto;
    //     this.id = cpf;
    //     this.nome = nomeCompleto;
    //     this.nome = nomeCompleto;
    // }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

