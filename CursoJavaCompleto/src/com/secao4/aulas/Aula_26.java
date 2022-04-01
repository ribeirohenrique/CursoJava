package com.secao4.aulas;

import java.util.Scanner;

public class Aula_26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        String nome;
        double dinheiro;
        char c;

        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite o numero: ");
        x = scanner.nextInt();
        System.out.println("Digite o dinheiro: ");
        dinheiro = scanner.nextDouble();
        System.out.println("Digite o caractere: ");
        c = scanner.next().charAt(0);
        System.out.printf("Voce digitou o nome %s, com numero %d e R$ %.2f de dinheiro \n", nome, x, dinheiro);
        System.out.println("Capturei o caractere: " + c);
    }

}
