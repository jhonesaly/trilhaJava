package pratica5.classes;

public class Carro {
    private String modelo;
    private double precoA;
    private double precoB;
    private double precoC;

    public void setModelo(String nome) {
        this.modelo = nome;
    }

    public void setPrimeiroPreco(double precoA) {
        this.precoA = precoA;
    }

    public void setSegundoPreco(double precoB) {
        this.precoB = precoB;
    }
    
    public void setTerceiroPreco(double precoC) {
        this.precoC = precoC;
    }

    public double getMaiorPreco() {
        if (precoA >= precoB && precoA >= precoC) {
            return precoA;
        } else if ((precoB >= precoA && precoB >= precoC)) {
            return precoB;
        } else {
            return precoC;
        }
    }

    public double getMenorPreco() {
        if (precoA <= precoB && precoA <= precoC) {
            return precoA;
        } else if ((precoB <= precoA && precoB <= precoC)) {
            return precoB;
        } else {
            return precoC;
        }
    }
}