package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        int valor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo ou negativo: ");
        valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

        scanner.close();
    }
}
