package com.company;

public class VATaxType extends TaxType{

    double NDS = 0.18;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * NDS;
    }
}
