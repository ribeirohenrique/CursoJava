package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrasilTaxServices;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Pickup (DD/MM/AAAA HH:SS): ");
        Date start = sdf.parse(scanner.nextLine());
        System.out.print("Return (DD/MM/AAAA HH:SS): ");
        Date finish = sdf.parse(scanner.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrasilTaxServices());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE");
        System.out.printf("Basic payment: %.2f \n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f \n", carRental.getInvoice().getTax());
        System.out.printf("Total payment: %.2f \n", carRental.getInvoice().getTotalPayment());
    }
}
