package com.secao6.aulas;

import java.util.Scanner;

public class Aula_45 {
    public static void main(String[] args) {

        int x = 1;
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        while (x != 0) {
            System.out.print("Digite um valor: ");
            x = scanner.nextInt();
            soma += x;
        }

        System.out.println("A soma foi: " + soma);





        scanner.close();
    }
}
