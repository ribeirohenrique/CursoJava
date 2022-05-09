package model.services;

import org.w3c.dom.DOMImplementation;

public class BrasilTaxServices {

    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
