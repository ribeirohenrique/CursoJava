package com.secao5.exercicios;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        int horaInicio, horaFim, tempoTotal;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        horaInicio = scanner.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        horaFim = scanner.nextInt();

        if (horaInicio < horaFim) {
            tempoTotal = horaFim - horaInicio;
        } else {
            tempoTotal = 24 - horaInicio + horaFim;
        }

        System.out.printf("O jogo durou %d horas.", tempoTotal);

        scanner.close();

    }
}
