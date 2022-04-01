package com.secao4.exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        float A, B, C;
        float resA, resB, resC, resD, resE;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = scanner.nextFloat();
        System.out.print("Digite o valor de B: ");
        B = scanner.nextFloat();
        System.out.print("Digite o valor de C: ");
        C = scanner.nextFloat();
        System.out.println();

        resA = (A * C) / 2;
        resB = (float) (Math.PI * Math.pow(C, 2.0));
        resC = ((A + B) * C) / 2;
        resD = B * 4;
        resE = A * B;

        System.out.printf("Triangulo: %.2f \n",resA);
        System.out.printf("Circulo:   %.2f \n",resB);
        System.out.printf("Trapezio:  %.2f \n",resC);
        System.out.printf("Quadrado:  %.2f \n",resD);
        System.out.printf("Retangulo: %.2f \n",resE);









    }
}
