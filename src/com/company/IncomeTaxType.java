package com.company;

public class IncomeTaxType extends TaxType{

    double progressive_tax = 0.15;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * progressive_tax;
    }
}
