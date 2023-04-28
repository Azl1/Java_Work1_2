package com.company;

import java.math.BigDecimal;

public class VATaxType extends TaxType{

    BigDecimal NDS = new BigDecimal("0.18");
    // double NALOG = 0.13;

    @Override
    public BigDecimal calculateTaxFor(BigDecimal bigDecimal) {
        return NDS.multiply(bigDecimal);
    }
}
