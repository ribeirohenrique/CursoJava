package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        int senha = 0;
        Scanner scanner = new Scanner(System.in);

        while (senha != 2002) {
            System.out.print("Digite uma senha numerica inteira: ");
            senha = scanner.nextInt();

        }

        System.out.println("Acesso permitido");
        scanner.close();
    }
}
