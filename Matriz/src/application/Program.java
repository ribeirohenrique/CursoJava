package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da Matriz, Linha / Coluna: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        //este primeiro for percorre as linhas
        for (int i = 0; i < mat.length; i++) {

            //este segundo for percorre as colunas
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite um valor: ");
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int j = 0; j < mat.length; j++) {
            System.out.print(mat[j][j] + " ");

        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }

        }
        System.out.print("Numeros negativos: ");

    }
}
