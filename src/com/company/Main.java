package com.company;

public class Main {
    AdsService adsService = new AdsService();
    VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
            new SedanType(), new PetrolType());
    VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
            new PickupType(), new DieselType());

    adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

    adsService.filterByVehicleTypeByPurpose(new PassengerType());

    adsService.filterByVehicleTypeByPurpose(new TruckType());

    //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

}
