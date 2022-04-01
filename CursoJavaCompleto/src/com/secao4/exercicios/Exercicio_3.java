package com.secao4.exercicios;

public class Exercicio_3 {
    public static void main(String[] args) {

        int A, B, C, D;

        System.out.printf("Diferença 1: %d", diferenca(5,6,7,8));
        System.out.printf("Diferença 2: %d", diferenca(5,6,-7,8));
    }

    public static int diferenca(int a, int b, int c, int d) {
        int diferenca = (a * b) - (c * d);
        System.out.println();
        return diferenca;
    }
}
