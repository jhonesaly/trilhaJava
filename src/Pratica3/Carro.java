package Pratica3;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void exibirFicha(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    public int calcularIdade(int anoCorrente){
        return anoCorrente - ano;
    }
}
