package com.nvminh162;

/*
    class VehicleFactory {
        public Vehicle createVehicle(String type) {
            if (type.equalsIgnoreCase("car")) {
                return new Car();
            } else if (type.equalsIgnoreCase("bike")) {
                return new Bike();
            } else if (type.equalsIgnoreCase("bus")) {
                return new Bus();
            }
            return null;
        }
    }
*/

public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "bus" -> new Bus();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}
