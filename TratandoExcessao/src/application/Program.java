package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        metodo1();
        System.out.println("Fim do programa");
    }

    public static void metodo1() {
        System.out.println("######METODO 1 INICIO######");
        metodo2();
        System.out.println("######METODO 1 FIM######");

    }

    public static void metodo2() {
        System.out.println("######METODO 2 INICIO######");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite palavras separadas por espaço: ");
            String[] vect = scanner.nextLine().split(" ");
            System.out.print("Digite uma posição: ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");

            //aqui foi printado na tela o stack trace
            //a leitura é sempre do fim pro começo, ao contrario
            e.printStackTrace();
            scanner.next();

        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("######METODO 2 FIM######");
    }
}
