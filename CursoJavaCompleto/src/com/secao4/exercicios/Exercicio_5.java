package com.secao4.exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        int[] codPeca = new int[2];
        int[] qtdPeca = new int[2];
        double[] valorUnit = new double[2];

        double total;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o código do produto %d: ", i);
            codPeca[i] = scanner.nextInt();

            System.out.printf("Digite a quantidade do produto %d: ", i);
            qtdPeca[i] = scanner.nextInt();

            System.out.printf("Digite o valor unitário do produto %d: ", i);
            valorUnit[i] = scanner.nextDouble();
            System.out.println();
        }

        total = (valorUnit[0] * qtdPeca[0]) + (valorUnit[1] * qtdPeca[1]);

        for (int i = 0; i < codPeca.length; i++) {
            System.out.printf("Produto: %d, Quantidade: %d, Valor unitário: %.2f \n", codPeca[i], qtdPeca[i], valorUnit[i]);
        }

        System.out.printf("Valor total: %.2f \n",total);
    }
}
