package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contract data");

        System.out.print("Number: ");
        Integer number = scanner.nextInt();
        System.out.print("Date: (DD/MM/AAAA): ");
        Date date = sdf.parse(scanner.next());
        System.out.print("Contract value: ");
        Double totalValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, totalValue);
        ContractService cs = new ContractService(new PaypalService());

        System.out.print("Enter number of installments: ");
        int numberInstallments = scanner.nextInt();
        cs.processContract(contract, numberInstallments);

        System.out.println("Installments");
        for (Installment installment : contract.getInstallmentList()) {
            System.out.println(installment);
        }
    }
}
