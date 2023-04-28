package com.company;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("0.0");
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal("1000.0"), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal("5000.0"), new VATaxType(), taxService),
                new Bill(new BigDecimal("7000.0"), new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }


}
