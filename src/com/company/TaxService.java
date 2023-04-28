package com.company;

import java.math.BigDecimal;

public class TaxService {

    BigDecimal bigDecimal = new BigDecimal("0.0");

    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}
