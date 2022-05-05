package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Holder: ");
            String holder = scanner.nextLine();
            System.out.print("Initial Balance: ");
            double initialBalance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double withdraw = scanner.nextDouble();

            account.withdraw(withdraw);

            System.out.println(account);


        } catch (ParseException e) {

        }
    }
}
