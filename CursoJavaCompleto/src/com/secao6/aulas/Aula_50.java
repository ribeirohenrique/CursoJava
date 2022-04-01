package com.secao6.aulas;

import java.util.Scanner;

public class Aula_50 {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas vezes vai repetir: ");
        n = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite outro valor: ");
            int x = scanner.nextInt();
            soma += x;

        }
        System.out.println("Soma: " + soma);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println();

        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }
    }
}
