package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do dólar em reais atualmente: ");
        double valorDolar = scanner.nextDouble();
        System.out.print("Digite o valor que quer comprar em dólar: ");
        double valorReal = scanner.nextDouble();

        System.out.printf("Valor em reais a pagar: %.2f",CurrencyConverter.conversor(valorDolar, valorReal));

    }
}
