package com.secao6.exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {


        int cod = 1;
        Scanner scanner = new Scanner(System.in);

        int contEtanol = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        while (cod >= 1 && cod < 4) {

            System.out.print("Digite o código do combustível: ");
            cod = scanner.nextInt();
            switch (cod) {
                case 1:
                    System.out.println("Etanol");
                    contEtanol += 1;
                    break;
                case 2:
                    System.out.println("Gasolina");
                    contGasolina += 1;
                    break;
                case 3:
                    System.out.println("Diesel");
                    contDiesel += 1;
                    break;
                case 4:
                    System.out.println("Muito obrigado");
                    break;
                default:
                    System.out.println("Digite outro código");
                    cod = 1;
                    break;
            }
        }

        System.out.println("Etanol: " + contEtanol);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Diesel: " + contDiesel);
        scanner.close();

    }
}
