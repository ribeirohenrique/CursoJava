package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        int A, B;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (A): ");
        A = scanner.nextInt();

        System.out.print("Digite o segundo valor (B): ");
        B = scanner.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scanner.close();
    }
}
