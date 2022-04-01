package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        int N;
        double A, B;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de repeticoes: ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o primeiro valor: ");
            A = scanner.nextInt();
            System.out.print("Digite o segundo valor: ");
            B = scanner.nextInt();

            if (B == 0) {
                System.out.println("Divisao impossivel");
            } else {
                System.out.printf("Resultado: %.2f \n", (A / B));
            }


        }
        scanner.close();


    }
}
