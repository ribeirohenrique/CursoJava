package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        double N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        N = scanner.nextDouble();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d, Cubo: %d, Quadrado: %d \n",i, (int)Math.pow(i,2), (int)Math.pow(i,3));

        }

    }
}
