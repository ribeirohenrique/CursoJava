package application;

import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor da linha %d, coluna %d: ", (1 + j), (1 + i));
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite um numero que esteja na matriz: ");
        int numMatriz = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
