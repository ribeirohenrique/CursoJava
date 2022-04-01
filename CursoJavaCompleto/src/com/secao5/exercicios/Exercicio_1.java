package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        int valor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo ou negativo: ");
        valor = scanner.nextInt();

        if (valor < 0) {
            System.out.println("VALOR NEGATIVO");
        } else {
            System.out.println("VALOR NAO NEGATIVO");
        }

        scanner.close();
    }
}
