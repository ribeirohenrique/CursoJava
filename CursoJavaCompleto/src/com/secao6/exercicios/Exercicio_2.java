package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {


        int X = 1;
        int Y = 1;
        Scanner scanner = new Scanner(System.in);

        while (X != 0 || Y != 0) {

            System.out.print("Digite a coordenada X: ");
            X = scanner.nextInt();

            System.out.print("Digite a coordenada Y: ");
            Y = scanner.nextInt();

            if (X > 0 && Y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro Quadrante");
            } else if (X > 0 && Y < 0) {
                System.out.println("Quarto Quadrante");
            }

        }

        System.out.println("Uma das coordenadas foi nula");
        scanner.close();

    }
}
