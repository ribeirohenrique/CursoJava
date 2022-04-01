package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos valores quer testar: ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o primeiro valor real: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo valor real: ");
            double b = scanner.nextDouble();
            System.out.print("Digite o terceiro valor real: ");
            double c = scanner.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("média %.1f \n", media);
        }
        scanner.close();

    }
}
