package pratica6.classes;

import pratica6.interfaces.*;

public class SalaRetangular implements CalculoGeometrico {
    
    public double base;
    public double altura;

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*base+2*altura;
    }
}
