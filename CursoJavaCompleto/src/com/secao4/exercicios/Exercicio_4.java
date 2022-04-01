package com.secao4.exercicios;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        int numero;
        double horasTrabalhadas;
        double salarioHora;
        Scanner scanner = new Scanner(System.in);

        System.out.print("INSERT THE EMPLOYEE NUMBER: ");
        numero = scanner.nextInt();
        System.out.print("INSERT THE NUMBER OF WORKED HOURS: ");
        horasTrabalhadas = scanner.nextDouble();
        System.out.print("INSERT THE SALARY PER HOUR: ");
        salarioHora = scanner.nextDouble();

        System.out.println();
        System.out.printf("EMPLOYEE NUMBER: %d, SALARY: %.2f", numero, salarioMensal(horasTrabalhadas, salarioHora));
        scanner.close();
    }

    public static double salarioMensal(double horasTrabalhadas, double salarioHora) {
        return horasTrabalhadas * salarioHora;
    }
}
