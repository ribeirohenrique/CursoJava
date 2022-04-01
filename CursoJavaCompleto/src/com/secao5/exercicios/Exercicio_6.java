package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        double valor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inteiro: ");
        valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo entre 0 e 25");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo entre 25 e 50");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo entre 50 e 75");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo entre 75 e 100");
        } else {
            System.out.println("Fora de intervalo");
        }

        scanner.close();

    }
}
