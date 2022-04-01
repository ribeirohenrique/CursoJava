package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        N = scanner.nextInt();

        int fator = 1;
        for (int i = N; i > 1; i--) {
            fator *= i;
        }
        System.out.println("Valor: " + fator);

        scanner.close();
    }

}
