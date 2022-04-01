package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {


        double x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira coordenada (x): ");
        x = scanner.nextDouble();

        System.out.print("Digite a segunda coordenada (y): ");
        y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Plano Q1");
        } else if (x < 0 && y < 0) {
            System.out.println("Plano Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Plano Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Plano Q3");
        } else {
            System.out.println("Ponto de origem");
        }

        scanner.close();
    }
}
