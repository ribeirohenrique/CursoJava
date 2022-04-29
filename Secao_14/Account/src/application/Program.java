package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import jdk.swing.interop.SwingInterOpUtils;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting
        //Relacao É UM, a Business account é uma conta

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //Downcasting
        //Preciso informar que é do tipo BusinessAccount
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Abaixo vai dar erro
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        //Esta é a maneira correta
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");

        }

        System.out.println("-------------------------------");

        Account acc6 = new Account(1009, "Fernando", 1000.0);
        acc6.withdraw(200.00);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1010, "Joana", 1000.00, 0.01);
        acc.withdraw(200.0);
        System.out.println(acc7.getBalance());

        System.out.println("-------------------------------");

        Account acc8 = new BusinessAccount(1003, "Fabricio", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }
}
