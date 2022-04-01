package com.secao5.aulas;

import java.util.Scanner;

public class Aula_38 {
    public static void main(String[] args) {

        /*
        a += b;     ----    a = a + b;
        a -= b;     ----    a = a - b;
        a *= b;     ----    a = a * b;
        a /= b;     ----    a = a / b;
        a %= b;     ----    a = a % b;
         */

        int minutos;
        double conta = 50.00;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos minutos consumiu no mês: ");
        minutos = scanner.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.00;
        }

        System.out.printf("O valor da conta é: %.2f", conta);

        scanner.close();
    }
}
