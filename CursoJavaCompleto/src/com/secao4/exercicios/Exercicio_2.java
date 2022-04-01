package com.secao4.exercicios;

public class Exercicio_2 {
    public static void main(String[] args) {

        double raio1 = 2.00;
        System.out.printf("Area 1: %.4f", area(raio1));

        double raio2 = 100.64;
        System.out.printf("Area 2: %.4f", area(raio2));

        double raio3 = 150.00;
        System.out.printf("Area 3: %.4f", area(raio3));
    }

    public static double area (double raio) {
        double pi = Math.PI;
        double pow = Math.pow(raio, 2);
        System.out.println();
        return pi * pow;
    }
}
