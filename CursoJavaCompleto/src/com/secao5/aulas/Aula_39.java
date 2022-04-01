package com.secao5.aulas;

import java.util.Scanner;

public class Aula_39 {
    public static void main(String[] args) {

        int x;
        String dia;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia da semana: ");
        x = scanner.nextInt();

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        scanner.close();
    }
}
