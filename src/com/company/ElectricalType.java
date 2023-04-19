package com.company;

public class ElectricalType extends VehicleTypeByFuelTypes{

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
