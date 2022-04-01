package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        double valorRenda, totalImposto;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do Salario: ");
        valorRenda = scanner.nextDouble();

        if (valorRenda > 0 && valorRenda <= 2000.00) {
            System.out.println("Isento");
        } else if (valorRenda > 2000.00 && valorRenda <=  3000.00) {
            totalImposto = (valorRenda - 2000.00) * 0.08;
            System.out.printf("Valor do imposto: %.2f",totalImposto);
        } else if (valorRenda > 3000.00 && valorRenda <= 4500.00) {
            totalImposto = (valorRenda - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("Valor do imposto: %.2f", totalImposto);
        } else if (valorRenda > 4500.00) {
            totalImposto = (valorRenda - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("Total do imposto: %.2f", totalImposto);
        }
    }
}
