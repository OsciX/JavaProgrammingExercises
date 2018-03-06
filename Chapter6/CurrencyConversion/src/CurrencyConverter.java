/*
    CurrencyConverter.java
    Written by Ryan Davis on 3/1/2018
*/

public class CurrencyConverter {
    double factor;
    char symbol;

    public CurrencyConverter(double conversionFactor) {
        factor = conversionFactor;
    }

    public CurrencyConverter(double conversionFactor, char outputSymbol) {
        factor = conversionFactor;
        symbol = outputSymbol;
    }

    public double convert(double amount) {
        return amount * factor;
    }

    public String convertf(double amount) {
        return String.format("%c%.2f", symbol, convert(amount));
    }
}
