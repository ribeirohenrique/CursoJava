package application;

import entities.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int numConta = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String titular = scanner.nextLine();

        System.out.print("Is there an initial deposit? (s/n): ");
        char simNao = scanner.next().charAt(0);
        if (simNao == 's') {
            System.out.print("enter initial deposit value: ");
            double depositoInicial = scanner.nextDouble();
            System.out.println("Account Data: ");
            account = new Account(numConta, titular, depositoInicial);
        } else {
            System.out.println("Account Data: ");
            account = new Account(numConta, titular);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.fazerDeposito(scanner.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.fazerSaque(scanner.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

    }
}
