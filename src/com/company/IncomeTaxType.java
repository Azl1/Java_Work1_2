package com.company;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    BigDecimal progressive_tax = new BigDecimal("0.15");
    // double NALOG = 0.13;

    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        return progressive_tax.multiply(bigDecimal);

    }
}
