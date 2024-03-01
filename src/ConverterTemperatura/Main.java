package ConverterTemperatura;

public class Main {
    public static void main(String[] args) {
        double temperaturaCelsiusFloat = 29.0 ;
        double temperaturaFahrenheitFloat = (temperaturaCelsiusFloat * 1.8) + 32;

        int temperaturaFahrenheitInteiro = (int) temperaturaFahrenheitFloat;
        int temperaturaCelsiusInteiro = (int) temperaturaCelsiusFloat;

        System.out.printf("A temperatura atual é %d °C ou %.1f °F", temperaturaCelsiusInteiro, temperaturaFahrenheitFloat);
    }
}
