package com.secao6.aulas;

import java.util.Scanner;

public class Aula_55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f \n", F);
            System.out.print("Deseja Repetir? (s/n): ");
            resp = scanner.next().charAt(0);
        } while (resp != 'n');
        scanner.close();

    }
}
