package application;

import services.InterestService;
import services.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        InterestService interestService = new UsaInterestService(1.0);
        double payment = interestService.payment(amount, months);

        System.out.printf("Payment after %d months: \n", months);
        System.out.printf("%.2f", payment);




    }
}
