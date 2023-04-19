package com.company;

public class StationWagonType extends VehicleTypeByBodyTypes{

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
