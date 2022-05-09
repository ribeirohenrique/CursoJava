package model.services;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;

import java.util.Date;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private BrasilTaxServices taxServices;

    public RentalService() {
    }

    public RentalService(Double pricePerDay, Double pricePerHour, BrasilTaxServices taxServices) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxServices = taxServices;
    }

    double basicPayment;
    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double)(t2 - t1) / 1000 / 60 / 60;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
