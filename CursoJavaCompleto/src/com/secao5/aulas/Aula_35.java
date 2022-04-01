package com.secao5.aulas;

import java.util.Scanner;

public class Aula_35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hora;

        System.out.print("Que horas sao: ");
        hora = scanner.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }


        scanner.close();
    }
}
