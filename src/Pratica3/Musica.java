package Pratica3;

public class Musica {
    public String titulo; 
    public String artista;
    public int anoLancamento;
    public double avaliacao = 0;
    public int numAvaliacoes = 0;

    public void exibirFicha() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
    }

    public void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double calcularMedia(){
        return avaliacao / numAvaliacoes;
    }
}
