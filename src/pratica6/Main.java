package pratica6;

import pratica6.classes.*;

public class Main {
    public static void main(String[] args) {
        ConversorDolar conversor = new ConversorDolar();
        double saldoDolar = 500;
        double valorReal = conversor.converterValorParaReal(saldoDolar);
        System.out.println(valorReal);
    }
}
