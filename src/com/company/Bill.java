package com.company;

import java.math.BigDecimal;

public class Bill extends TaxType{
    BigDecimal bigDecimal = new BigDecimal("0.0");
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal bigDecimal, TaxType taxType, TaxService taxService) {
        this.amount = bigDecimal;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);

        taxService.payOut(taxAmount);
    }



}

