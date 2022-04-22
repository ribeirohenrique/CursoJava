package application;

import java.util.Scanner;

public class Vetores_PartOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidade;
        double soma = 0;
        System.out.print("Digite a quantidade de espaços no vetor: ");
        quantidade = scanner.nextInt();
        double[] valores = new double[quantidade];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o valor %d: ", i);
            valores[i] = scanner.nextDouble();
        }

        System.out.println();
        System.out.print("O array está lido como: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + ", ");
        }

        System.out.println("E sua média dá: ");
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        System.out.println(soma / valores.length);
    }
}
