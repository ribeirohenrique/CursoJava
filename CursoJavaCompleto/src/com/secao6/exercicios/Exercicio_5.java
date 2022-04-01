package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        int valor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de repeticoes: ");
        valor = scanner.nextInt();


        int contIn = 0;
        int contOut = 0;
        int x;
        for (int i = 0; i < valor; i++) {
            System.out.print("Digite o valor: ");
            x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                contIn++;
            } else {
                contOut++;
            }
        }
        System.out.printf("%d In \n", contIn);
        System.out.printf("%d Out \n", contOut);
        scanner.close();

    }
}
