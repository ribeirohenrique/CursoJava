package com.secao6.exercicios;

import java.util.Scanner;

public class Exericicio_9 {
    public static void main(String[] args) {

        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        N = scanner.nextInt();

        //prestar atencao na logica do programa
        //so vai printar os valores que forem resto zero
        for (int i = N; i > 0; i--) {
            if (N % i == 0) {
                System.out.println("Valor: " + i);
            }

        }
        scanner.close();
    }
}
