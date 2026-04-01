package com.nvminh162;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle myCar = factory.createVehicle("car");
        myCar.drive();

        Vehicle myBike = factory.createVehicle("bike");
        myBike.drive();

        Vehicle myBus = factory.createVehicle("bus");
        myBus.drive();
        Bus bus = (Bus) factory.createVehicle("bus");
        bus.otherMethod();
    }
}
