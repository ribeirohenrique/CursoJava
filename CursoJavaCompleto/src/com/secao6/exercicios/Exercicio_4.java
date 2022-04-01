package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {


        int valor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        valor = scanner.nextInt();

        //Aqui ele iterou somente com os valores que davam diferente de zero na divisao
        //Atentar na logica
        for (int i = 1; i < valor; i++) {
            if (i % 2 != 0) {
                System.out.println("Valor de X: " + i);
            }

        }
        scanner.close();
    }
}
