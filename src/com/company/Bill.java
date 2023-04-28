package com.company;

public class Bill extends TaxType{
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        double taxAmount = taxType.calculateTaxFor(amount);

        taxService.payOut(taxAmount);
    }

    @Override
    public double calculateTaxFor(double amount) {
        return super.calculateTaxFor(amount);
    }
}

