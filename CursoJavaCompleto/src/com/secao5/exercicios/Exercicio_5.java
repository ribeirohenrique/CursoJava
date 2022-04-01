package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        int codItem, qtdItem;
        double valorItem;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        codItem = scanner.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        qtdItem = scanner.nextInt();

        if (codItem == 1) {
            valorItem = 4.00;
            System.out.printf("Cachorro quente, R$ %.2f \n", valorItem);
            System.out.println("Total: " + (valorItem * qtdItem));
        }
        if (codItem == 2) {
            valorItem = 4.50;
            System.out.printf("X-Salada, R$ %.2f \n", valorItem);
            System.out.println("Total: " + (valorItem * qtdItem));
        }
        if (codItem == 3) {
            valorItem = 5.00;
            System.out.printf("X-Bacon, R$ %.2f \n", valorItem);
            System.out.println("Total: " + (valorItem * qtdItem));
        }
        if (codItem == 4) {
            valorItem = 2.00;
            System.out.printf("Torrada simples, R$ %.2f \n", valorItem);
            System.out.println("Total: " + (valorItem * qtdItem));
        }
        if (codItem == 5) {
            valorItem = 1.50;
            System.out.printf("Refrigerante, R$ %.2f \n", valorItem);
            System.out.println("Total: " + (valorItem * qtdItem));
        }

        scanner.close();

    }
}
