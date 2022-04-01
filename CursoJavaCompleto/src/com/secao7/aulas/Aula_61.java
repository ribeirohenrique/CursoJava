package com.secao7.aulas;

import java.util.Scanner;

public class Aula_61 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int c = scanner.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        scanner.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }
}
