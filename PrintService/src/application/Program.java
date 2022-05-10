package application;

import services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

    }
}
