package com.company;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    BigDecimal NALOG = new BigDecimal("0.13");
   // double NALOG = 0.13;

    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        return NALOG.multiply(bigDecimal);
    }
}
