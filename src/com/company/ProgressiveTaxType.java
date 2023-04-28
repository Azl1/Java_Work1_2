package com.company;

public class ProgressiveTaxType extends TaxType {

    double NALOG = 0.13;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * NALOG;
    }
}
