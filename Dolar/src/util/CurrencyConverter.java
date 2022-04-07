package util;

public class CurrencyConverter {

    public static final double IMPOSTO_IOF = 1.06;

    public static double conversor(double valorReal, double valorDolar) {
        return (valorReal * valorDolar) * IMPOSTO_IOF;

    }
}
