package pratica6.classes;

import pratica6.interfaces.*;

public class ConversorDolar implements ConversaoFinanceira {
    @Override
    public double converterValorParaReal(double valorDolar){
        return valorDolar * 5;
    }
}
